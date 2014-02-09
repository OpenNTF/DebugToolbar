package org.openntf.xsp.debugtoolbar.objectdumper;

import org.openntf.xsp.debugtoolbar.beans.DebugToolbarBean;

public interface IObjectDumper<T> {

	public String getDump(Object obj, DebugToolbarBean dBar);
	
}
