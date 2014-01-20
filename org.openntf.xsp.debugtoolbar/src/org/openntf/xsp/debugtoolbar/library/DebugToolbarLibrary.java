/*
 * © Copyright GBS Inc 2011
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package org.openntf.xsp.debugtoolbar.library;

import org.openntf.xsp.debugtoolbar.Activator;

import com.ibm.xsp.library.AbstractXspLibrary;

public class DebugToolbarLibrary extends AbstractXspLibrary {
	
	private final static String LIBRARY_ID = DebugToolbarLibrary.class.getName();

	private final static boolean _debug = Activator._debug;

	static {
		if (_debug) {
			System.out.println(DebugToolbarLibrary.class.getName() + " loaded");
		}
	}

	public DebugToolbarLibrary() {
		if (_debug) {
			System.out.println(DebugToolbarLibrary.class.getName() + " created");
		}
	}

	public String getLibraryId() {
		return LIBRARY_ID;
	}

	@Override
	public String getPluginId() {
		return Activator.PLUGIN_ID;
	}

	@Override
	public String[] getDependencies() {
		return new String[] { "com.ibm.xsp.core.library",
				"com.ibm.xsp.extsn.library", "com.ibm.xsp.domino.library",
				"com.ibm.xsp.designer.library" };
	}

	@Override
	public String[] getXspConfigFiles() {
		String[] files = new String[] { 
				"META-INF/debugToolbar.xsp-config"};

		return files;
	}

	@Override
	public String[] getFacesConfigFiles() {
		String[] files = new String[] { 
				"META-INF/debugToolbar-faces-config.xml"};
		return files;
	}

	@Override
	public boolean isGlobalScope() {
		return false;
	}
}
