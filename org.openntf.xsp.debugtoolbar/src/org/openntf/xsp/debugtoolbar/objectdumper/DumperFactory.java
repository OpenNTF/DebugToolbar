package org.openntf.xsp.debugtoolbar.objectdumper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openntf.xsp.debugtoolbar.beans.DebugToolbarBean;

import com.ibm.jscript.types.FBSBoolean;
import com.ibm.jscript.types.FBSNumber;
import com.ibm.jscript.types.FBSObject;
import com.ibm.jscript.types.FBSString;

public enum DumperFactory {
	INSTANCE;

	private HashMap<Class<?>, IObjectDumper<?>> m_Dumpers;
	private static IObjectDumper<Object> DEFAULTDUMPER = new IObjectDumper<Object>() {

		public String getDump(Object obj, DebugToolbarBean dBar) {
			return obj.toString();
		}

	};

	public IObjectDumper<?> getDumper(Object obj) {
		if (m_Dumpers == null) {
			buildDumpers();
		}
		
		if (m_Dumpers.containsKey(obj.getClass())) {
			return m_Dumpers.get(obj.getClass());
		}
		
		if (obj instanceof String || obj instanceof Number || obj instanceof Boolean) {
			return DEFAULTDUMPER;
			
		} else if (obj instanceof FBSString) {
			return m_Dumpers.get( FBSString.class );
		} else if (obj instanceof FBSNumber) {
			return m_Dumpers.get( FBSNumber.class );
		} else if (obj instanceof FBSBoolean) {
			return m_Dumpers.get( FBSBoolean.class );
		} else if ( obj instanceof List ) {
			return m_Dumpers.get( List.class );
		} else if ( obj instanceof Map) {
			return m_Dumpers.get( Map.class) ;
		} else if ( obj instanceof FBSObject) {
			return m_Dumpers.get( FBSObject.class );
		}
			
		return DEFAULTDUMPER;
	}

	private synchronized void buildDumpers() {
		m_Dumpers = new HashMap<Class<?>, IObjectDumper<?>>();
		m_Dumpers.put(FBSString.class, new FBSStringDumper());
		m_Dumpers.put(FBSNumber.class, new FBSNumberDumper());
		m_Dumpers.put(FBSBoolean.class, new FBSBooleanDumper());
		m_Dumpers.put(FBSObject.class, new FBSObjectDumper());
		m_Dumpers.put(List.class, new ListDumper());
		m_Dumpers.put(Map.class, new MapDumper());
	}
}
