package org.openntf.xsp.debugtoolbar;

import org.openntf.xsp.debugtoolbar.beans.DebugToolbarBean;
import org.openntf.xsp.debugtoolbar.beans.Message;

/*
 * Set of helper function for easy logging of messages to the toolbar
 * from Java.
 */
public abstract class Logger {

	public static void debug( String msg) {
		Logger.log(msg, null, Message.TYPE_DEBUG);
	}
	public static void debug( String msg, String context) {
		Logger.log(msg, context, Message.TYPE_DEBUG);
	}
	
	public static void warn( String msg) {
		Logger.log(msg, null, Message.TYPE_WARNING);
	}
	public static void warn( String msg, String context) {
		Logger.log(msg, context, Message.TYPE_WARNING);
	}
	
	public static void info( String msg) {
		Logger.log(msg, null, Message.TYPE_INFO);
	}
	public static void info( String msg, String context) {
		Logger.log(msg, context, Message.TYPE_INFO);
	}
	
	public static void error( Throwable e) {
		Logger.log(e, null, Message.TYPE_ERROR);
	}

	public static void error( String e) {
		Logger.log(e, null, Message.TYPE_ERROR);
	}
	public static void error( String msg, String context) {
		Logger.log(msg, null, Message.TYPE_ERROR);
	}
	
	private static void log( Object obj, String context, String type) {
		DebugToolbarBean dBar = DebugToolbarBean.get();
		if (dBar != null ) {
			dBar.log(obj, context, type);
		}
	}
	
}
