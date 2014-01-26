package org.openntf.xsp.debugtoolbar.objectdumper;

import com.ibm.jscript.types.FBSBoolean;

public class FBSBooleanDumper implements IObjectDumper<FBSBoolean> {

	public String getDump(Object obj) {
		try {
			return ((FBSBoolean) obj).toJavaObject().toString();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return obj.toString();
	}

}
