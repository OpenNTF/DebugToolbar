package org.openntf.xsp.debugtoolbar.modules;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import javax.faces.context.FacesContext;

import lotus.domino.DateTime;
import lotus.domino.Document;
import lotus.domino.NotesException;

public abstract class DebugToolbarUtils {

	public static Object resolveVariable(String variableName) {
		FacesContext context = FacesContext.getCurrentInstance();
		return context.getApplication().getVariableResolver()
				.resolveVariable(context, variableName);
	}

	// function to store a java.util.Date in a document field (and recycle the
	// DateTime object afterwards)
	public static void setDate(Document doc, String dateItemName, Date date) {

		if (date == null) {
			return;
		}

		DateTime dt = null;

		try {

			dt = doc.getParentDatabase().getParent().createDateTime(date);
			doc.replaceItemValue(dateItemName, dt);

		} catch (NotesException e) {
			e.printStackTrace();
		} finally {
			try {
				dt.recycle();
			} catch (NotesException ne) {
			}
		}

	}
	
	public static String getReadableSize(long bytes) {

		if (bytes < 1024) {
			return bytes + " bytes";
		} else {
			double kbSize = bytes / 1024;

			if (kbSize < 1024) {
				// 0 decimals
				return Math.round(kbSize * 1) / 1 + " kB";
			} else {
				// 1 decimal
				double mbSize = kbSize / 1024;
				NumberFormat df = new DecimalFormat("#0.0");
				return df.format(mbSize) + " MB";
			}
		}

	}
	
	/*
	 * returns a 'readable' access level name for Notes database access
	 */
	public static String getReadableAccessLevel(int level) {

		switch (level) {
		case 1:
			return "Depositor";
		case 2:
			return "Reader";
		case 3:
			return "Author";
		case 4:
			return "Editor";
		case 5:
			return "Designer";
		case 6:
			return "Manager";
		}
		return "";
	}
	
	/*
	 * joins a collection using the specified seperator
	 */
	public static String join(final Collection<String> c, final String sep) {

		StringBuilder sb = new StringBuilder();
		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			sb.append(it.next());

			if (it.hasNext()) {
				sb.append(sep);
			}
		}
		return sb.toString();
	}

}
