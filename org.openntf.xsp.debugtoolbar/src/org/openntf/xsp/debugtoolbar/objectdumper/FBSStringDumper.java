package org.openntf.xsp.debugtoolbar.objectdumper;

import com.ibm.jscript.types.FBSString;

public class FBSStringDumper implements IObjectDumper<FBSString> {

	public String getDump(Object obj) {
		try {
			return ((FBSString)obj).toJavaObject().toString();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return obj.toString();
	}

}
