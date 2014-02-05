package org.openntf.xsp.debugtoolbar.library;

import com.ibm.xsp.library.AbstractXspLibrary;

public class DebugToolbarLibrary extends AbstractXspLibrary {

	private final static String LIBRARY_ID = DebugToolbarLibrary.class
			.getPackage().getName();

	public DebugToolbarLibrary() {
	}

	public String getLibraryId() {
		return LIBRARY_ID;
	}

	@Override
	public String getPluginId() {
		return "org.openntf.xsp.debugtoolbar";
	}

	@Override
	public String[] getDependencies() {
		return new String[] { "com.ibm.xsp.core.library",
				"com.ibm.xsp.extsn.library", "com.ibm.xsp.domino.library",
				"com.ibm.xsp.designer.library" };
	}

	@Override
	public String[] getXspConfigFiles() {
		String[] files = new String[] { "META-INF/debugToolbar.xsp-config" };

		return files;
	}

	@Override
	public String[] getFacesConfigFiles() {
		String[] files = new String[] { "META-INF/debugToolbar-faces-config.xml" };
		return files;
	}

}
