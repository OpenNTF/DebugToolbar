package org.openntf.xsp.debugtoolbar.objectdumper;

import org.openntf.xsp.debugtoolbar.beans.DebugToolbarBean;

import com.ibm.jscript.types.FBSString;

public class FBSStringDumper implements IObjectDumper<FBSString> {

	public String getDump(Object obj, DebugToolbarBean dBar) {
		try {
			return ((FBSString)obj).toJavaObject().toString();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return obj.toString();
	}

}
