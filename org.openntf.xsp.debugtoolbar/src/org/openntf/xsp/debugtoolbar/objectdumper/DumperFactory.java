package org.openntf.xsp.debugtoolbar.objectdumper;

import java.util.HashMap;

import com.ibm.jscript.types.FBSBoolean;
import com.ibm.jscript.types.FBSNumber;
import com.ibm.jscript.types.FBSString;

public enum DumperFactory {
	INSTANCE;

	private HashMap<Class<?>, IObjectDumper<?>> m_Dumpers;
	private static IObjectDumper<Object> DEFAULTDUMPER = new IObjectDumper<Object>() {

		public String getDump(Object obj) {

			return obj.toString();
		}

		public Object getTypedObject(Object obj) {
			return obj;
		}
	};

	public IObjectDumper<?> getDumper(Object obj) {
		if (m_Dumpers == null) {
			buildDumpers();
		}
		if (m_Dumpers.containsKey(obj.getClass())) {
			return m_Dumpers.get(obj.getClass());
		}
		return DEFAULTDUMPER;
	}

	private synchronized void buildDumpers() {
		m_Dumpers = new HashMap<Class<?>, IObjectDumper<?>>();
		m_Dumpers.put(FBSString.class, new FBSStringDumper());
		m_Dumpers.put(FBSNumber.class, new FBSNumberDumper());
		m_Dumpers.put(FBSBoolean.class, new FBSBooleanDumper());
	}
}
