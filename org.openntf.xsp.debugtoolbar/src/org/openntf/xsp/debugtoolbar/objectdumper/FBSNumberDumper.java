package org.openntf.xsp.debugtoolbar.objectdumper;

import org.openntf.xsp.debugtoolbar.beans.DebugToolbarBean;

import com.ibm.jscript.types.FBSNumber;

public class FBSNumberDumper implements IObjectDumper<FBSNumber> {

	public String getDump(Object obj, DebugToolbarBean dBar) {
		try {
			return ((FBSNumber) obj).toJavaObject().toString();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return obj.toString();
	}


}
