package org.openntf.xsp.debugtoolbar.objectdumper;

import java.util.Iterator;

import org.openntf.xsp.debugtoolbar.beans.DebugToolbarBean;

import com.ibm.jscript.types.FBSObject;

public class FBSObjectDumper implements IObjectDumper<FBSObject> {

	public String getDump(Object obj, DebugToolbarBean dBar) {

		StringBuilder sb = new StringBuilder();

		try {

			FBSObject fbso = (FBSObject) obj;

			@SuppressWarnings("rawtypes")
			Iterator it = fbso.getPropertyKeys();

			sb.append("<table class=\"dumped\"><tbody>");

			boolean first = true;
			int counter = 0;

			while (it.hasNext()) {

				String key = (String) it.next();
				Object val = fbso.get(key);

				if (counter >= DebugToolbarBean.MAX_DATASET_SAMPLE) {
					sb.append("<tr><td colspan=\"2\"><span class=\"highlight\">More items available...</span></td></tr>");
					break;
				}

				String dumpedVal = dBar.dumpIt(val);

				sb.append("<tr><td" + (first ? " class=\"first\"" : "") + ">"
						+ key + "</td>" + "<td"
						+ (first ? " class=\"first\"" : "") + ">" + dumpedVal
						+ "</td></tr>");

				first = false;
				counter++;
			}

			sb.append("</tbody></table>");

		} catch (Exception e) {
			e.printStackTrace();

		}

		return sb.toString();

	}

}
