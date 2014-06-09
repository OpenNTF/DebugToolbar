package org.openntf.xsp.debugtoolbar.beans;

/*
 * <<
 * 
 * XPages Debug Toolbar
 * Copyright 2012,2013,2014 Mark Leusink http://linqed.eu
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this 
 * file except in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF 
 * ANY KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License
 * >> 
 */

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.Map.Entry;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.model.SelectItemGroup;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.openntf.xsp.debugtoolbar.inspector.ComponentAnalyser;
import org.openntf.xsp.debugtoolbar.inspector.ComponentEvaluationResult;
import org.openntf.xsp.debugtoolbar.lifecycle.DebugBeanPhaseListener;
import org.openntf.xsp.debugtoolbar.modules.DebugToolbarUtils;
import org.openntf.xsp.debugtoolbar.modules.FilesModule;
import org.openntf.xsp.debugtoolbar.objectdumper.DumperFactory;
import org.openntf.xsp.debugtoolbar.objectdumper.IObjectDumper;

import lotus.domino.ACL;
import lotus.domino.Database;
import lotus.domino.Name;
import lotus.domino.NoteCollection;
import lotus.domino.Session;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;

import lotus.domino.Document;
import lotus.domino.NotesException;

import com.ibm.commons.util.StringUtil;
import com.ibm.designer.runtime.directory.DirectoryUser;
import com.ibm.xsp.designer.context.XSPContext;

public class DebugToolbarBean implements Serializable {

	private static final long serialVersionUID = 6348127836747732428L;

	public static final String BEAN_NAME = "dBar";

	private static final String DEFAULT_TOOLBAR_COLOR = "#161E7A";

	private static final int MAX_MESSAGES = 2000; // maximum number of message
													// held in this class
	
	public static final int MAX_DATASET_SAMPLE = 50; // maximum number of
														// samples from a list
														// that are shown by
														// default


	private boolean toolbarVisible; // (automatically) set to true if the
									// toolbar is loaded, if set to false
									// (default)
									// no messages are written to the toolbar's
									// messages section

	private static final String LINKBASE_FACES = "http://download.oracle.com/docs/cd/E17802_01/j2ee/j2ee/javaserverfaces/1.1_01/docs/api/";
	private static final String LINKBASE_JAVA = "http://java.sun.com/javase/6/docs/api/";
	private static final String LINKBASE_IBM = "http://public.dhe.ibm.com/software/dw/lotus/Domino-Designer/JavaDocs/Designer/9.0.1/";
	private static final String LINKBASE_GOOGLE = "http://google.com/search?q=";
	
	private Vector<Message> messages;
	private boolean isDetailedTimings;
	private int numErrors;

	private boolean collapsed;
	private Vector<String> filterLogTypes;
	private String activeTab;
	private String requestContextPath;
	private String consolePath;
	private boolean showLists;
	private String toolbarColor;

	private boolean configLoaded;

	private List<Object> sortedScopeKeys;

	
	
	private boolean debugLifecycle;

	private boolean inspectorShowHiddenComponents; // show or hide components
													// without an id
	private boolean inspectorSortAlphabetic; // sort the component ids list
												// alphabetically or in page
												// order
	private ArrayList<String> inspectorComponentIdsOptions; // list of component
															// ids
	private String inspectorSelectedComponentId; // selected component id
	private ArrayList<String> inspectorExpression; // list of components of the
													// current selected
													// expression
	private boolean inspectorDeclaredOnly;
	private ArrayList<String> inspectorHistory;
	private boolean inspectorHideMethods;

	private transient Database dbCurrent;
	private transient Session session;
	private String currentDbFilePath;
	private String currentDbTitle;
	private String serverName;

	private int accessLevel;

	private Vector<String> userRoles;
	private String notesVersion;
	private String extLibVersion;
	private String effectiveUserName;
	private String userName;

	// variables for external log database
	private String logDbPath; // path to the (OpenLog) database
	private boolean logEnabled; // enable/ disable persistent logging
	private int logLevel; // level of messages to log
	private boolean logDbValid;
	private transient Database dbLog;

	private static int LEVEL_ERROR = 0;
	private static int LEVEL_WARN = 1;
	private static int LEVEL_INFO = 2;
	private static int LEVEL_DEBUG = 3;
	
	private FilesModule filesModule;

	private ComponentEvaluationResult m_CRE;

	@SuppressWarnings("unchecked")
	public DebugToolbarBean() {

		try {
			activeTab = ""; // default tab: none

			toolbarVisible = false;
			collapsed = false;
			messages = new Vector<Message>();
			filterLogTypes = new Vector<String>();
			showLists = true;
			toolbarColor = DEFAULT_TOOLBAR_COLOR;

			configLoaded = false;

			requestContextPath = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
			consolePath = requestContextPath + "/debugToolbarConsole.xsp";
			
			filesModule = new FilesModule();

			inspectorShowHiddenComponents = false;
			inspectorComponentIdsOptions = new ArrayList<String>();
			inspectorExpression = new ArrayList<String>();

			logEnabled = false;

			dbCurrent = getCurrentDatabase();
			currentDbFilePath = dbCurrent.getFilePath();
			currentDbTitle = dbCurrent.getTitle();
			serverName = dbCurrent.getServer();

			accessLevel = dbCurrent.getCurrentAccessLevel();

			userName = getSession().getUserName();
			effectiveUserName = getSession().getEffectiveUserName();
			userRoles = dbCurrent.queryAccessRoles(effectiveUserName);

			notesVersion = getSession().getNotesVersion();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	// retrieve an instance of this toolbar class
	public static DebugToolbarBean get() {
		return (DebugToolbarBean) DebugToolbarUtils.resolveVariable(BEAN_NAME);
	}

	// dump the contents of any object to the toolbar
	public void dump(Object dumpObject) {
		this.info(this.dumpIt(dumpObject), "dumped");
	}

	// dump a list of all signers to the messages tab
	public void dumpNoteSigners() {

		NoteCollection nc = null;
		TreeMap<String, String> elementSigners = new TreeMap<String, String>();

		try {

			Database dbCurrent = this.getCurrentDatabase();
			nc = dbCurrent.createNoteCollection(false);
			nc.selectAllDesignElements(true);
			nc.buildCollection();

			ArrayList<String> signers = new ArrayList<String>();

			this.debug("started retrieving all signers for " + nc.getCount() + " design elements");

			String nid = nc.getFirstNoteID();
			while (nid != null && nid.length() > 0) {

				if (StringUtil.isNotEmpty(nid)) {

					Document note = dbCurrent.getDocumentByID(nid);

					if (note != null) {

						String signer = note.getSigner();
						if (StringUtil.isEmpty(signer)) {
							signer = "(not signed)";
						} else {
							signers.add(signer);
						}

						String title = note.getItemValueString("$TITLE");
						if (StringUtil.isEmpty(title)) {
							title = "(title not found for note " + nid + ")";
						}

						elementSigners.put(title, signer);

						note.recycle();
					}

				}

				nid = nc.getNextNoteID(nid);
			}

			this.dump(elementSigners);
			this.debug("number of signers: " + (new HashSet<String>(signers)).size());

		} catch (NotesException e) {
			this.error(e);
		} finally {
			try {
				if (nc != null) {
					nc.recycle();
				}
			} catch (NotesException e) {
				e.printStackTrace();
			}
		}

	}

	public void init(boolean defaultCollapsed, String color) {

		toolbarVisible = true;

		if (!this.configLoaded) {
			this.collapsed = defaultCollapsed;

			if (color != null) {
				this.toolbarColor = color;
			}

			this.configLoaded = true;
		}
	}

	public void init(boolean defaultCollapsed) {
		this.init(defaultCollapsed, null);
	}

	public boolean isDesigner() {
		return this.accessLevel >= ACL.LEVEL_DESIGNER;
	}

	public static boolean hideDetails(String entryName) {

		if (entryName.startsWith(DebugToolbarBean.BEAN_NAME)) {
			return true;
		} else if (entryName.equals("expressionInfo") || entryName.equals("expression")) {
			return true;
		}

		return false;

	}

	public String getActiveTab() {
		return this.activeTab;
	}

	// change the active tab
	public void setActiveTab(String tabName) {

		if (tabName.equals(this.activeTab)) { // open tab clicked: close it
			this.activeTab = "";

		} else {

			this.activeTab = tabName;

			if (tabName.indexOf("Scope") > -1) {
				readScopeKeys();
			}

		}
	}

	public void openTab(String tabName) {
		this.activeTab = tabName;
	}

	public void close() {
		this.setActiveTab("");
	}

	public boolean scopeHasValues() {
		return (this.getScopeKeys() == null ? false : this.getScopeKeys().size() > 0);
	}

	public List<Object> getScopeKeys() {
		return sortedScopeKeys;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void readScopeKeys() {

		Map map = (Map) DebugToolbarUtils.resolveVariable(activeTab);

		sortedScopeKeys = new ArrayList<Object>(map.keySet());

		Collections.sort(sortedScopeKeys,

		new Comparator<Object>() {

			// sort ascending
			public int compare(Object key1, Object key2) {
				String k1 = key1.toString();
				String k2 = key2.toString();
				return k1.compareTo(k2);
			}

		});

	}

	public void clearScopeContents(String type) {
		if (type.equals("both")) {
			this.clearApplicationScope();
			this.clearSessionScope();
		} else if (type.equals("sessionScope")) {
			this.clearSessionScope();
		} else {
			this.clearApplicationScope();
		}
	}

	/*
	 * Returns the dumped contents of an entry from the current scope. The key
	 * of entry is defined as an Object, because it doesn't have to be a string
	 * (can be a number too for instance)
	 */
	@SuppressWarnings({ "rawtypes" })
	public String getScopeEntry(Object entryName) {

		// entry name

		if (StringUtil.isEmpty((String) entryName)) {
			return "invalid input";
		}

		// don't render variables related to the debug toolbar
		if (DebugToolbarBean.hideDetails(entryName.toString())) {
			return "(skipped - debugToolbar variable)";
		}

		Map map = (Map) DebugToolbarUtils.resolveVariable(this.getActiveTab());

		return this.dumpIt(map.get(entryName));

	}

	// dump the contents of an object
	public String dumpIt(Object o) {

		if (o == null) {
			return "&lt;null&gt;";
		}
		
		IObjectDumper<?> myDumper = DumperFactory.INSTANCE.getDumper(o);
		return myDumper.getDump(o, this);

	}

	// clear the contents of the sessionScope
	@SuppressWarnings("rawtypes")
	public void clearSessionScope() {

		Map sessionScope = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();

		Iterator it = sessionScope.keySet().iterator();
		while (it.hasNext()) {

			String key = (String) it.next();
			if (!key.equals(BEAN_NAME)) { // don't remove debug toolbar variable
				sessionScope.remove(key);
			}

		}

		// hide all tabs after clearing
		setActiveTab("");
	}

	// clear the contents of the applicationScope
	@SuppressWarnings("rawtypes")
	public void clearApplicationScope() {
		try {

			Map applicationScope = FacesContext.getCurrentInstance().getExternalContext().getApplicationMap();

			Iterator it = applicationScope.keySet().iterator();
			while (it.hasNext()) {
				applicationScope.remove(it.next());
			}

			setActiveTab("");
		} catch (Exception e) {
			this.error(e);
		}
	}

	// remove a specific entry from a scope
	@SuppressWarnings("rawtypes")
	public void clearScopeEntry(String name) {

		if (StringUtil.isNotEmpty(name)) {

			Map map = (Map) DebugToolbarUtils.resolveVariable(activeTab);
			map.remove(name);

			readScopeKeys();
		}
	}

	public boolean isCollapsed() {
		return this.collapsed;
	}

	public void setCollapsed(boolean to) {
		this.collapsed = to;
	}

	// see above: used to hide/show the toolbar ("remove" link)
	public boolean isToolbarVisible() {
		return this.toolbarVisible;
	}

	public void setToolbarVisible(boolean to) {
		this.toolbarVisible = to;
	}

	/**
	 * Check the visibility of the toolbar - this determines wether messages are
	 * logged to the toolbar (at all)
	 * 
	 * @deprecated use {@link isToolbarVisible()} instead
	 */
	public boolean isEnabled() {
		return this.toolbarVisible;
	}

	/**
	 * Set the visibility of the toolbar - this determines wether messages are
	 * logged to the toolbar (at all)
	 * 
	 * @deprecated use {@link setToolbarVisible(booelean to)} instead
	 */
	public void setEnabled(boolean to) {
		this.toolbarVisible = to;
	}

	public boolean isShowLists() {
		return showLists;
	}

	public void setShowLists(boolean to) {
		this.showLists = to;
	}

	/*
	 * log a message with a specific type to the toolbar and/or external
	 * database
	 */
	public void log(Object msg, String msgContext, String type) {

		if (toolbarVisible || logEnabled) {

			Message message = new Message(msg, msgContext, type);

			addMessageToToolbar(message);

			// store log document
			createLogDocument(message, type.equals(Message.TYPE_ERROR), Level.INFO);

		}

	}

	private void log(Throwable throwable, String msgContext) {

		if (toolbarVisible || logEnabled) { // abort if toolbar not visible/ no
											// external logging enabled

			Message message = new Message(throwable, msgContext);

			addMessageToToolbar(message);

			// store log document
			createLogDocument(message, true, Level.WARNING);
		}

	}

	// adds a message to the debug toolbar
	private void addMessageToToolbar(Message message) {
		try {

			if (!toolbarVisible) {
				return;
			}

			this.messages.add(0, message);

			if (message.isError()) {
				numErrors++;
			}

			if (messages.size() > DebugToolbarBean.MAX_MESSAGES) {
				messages.remove(messages.size() - 1); // remove oldest element
			}

		} catch (Exception e) {

			// error while logging to the toolbar: log to console
			System.err.println("(DebugToolbarBean) error while logging: " + e.getMessage());
			System.out.println("(DebugToolbarBean) " + message.getText());
		}
	}

	public void info(Object msg) {
		this.log(msg, null, Message.TYPE_INFO);
	}

	public void info(Object msg, String msgContext) {
		this.log(msg, msgContext, Message.TYPE_INFO);
	}

	public void debug(Object msg) {
		this.log(msg, null, Message.TYPE_DEBUG);
	}

	public void debug(Object msg, String msgContext) {
		this.log(msg, msgContext, Message.TYPE_DEBUG);
	}

	public void warn(Object msg) {
		this.log(msg, null, Message.TYPE_WARNING);
	}

	public void warn(Object msg, String msgContext) {
		this.log(msg, msgContext, Message.TYPE_WARNING);
	}

	public void error(Throwable error) {
		this.log(error, null);
	}

	public void error(Throwable error, String msgContext) {
		this.log(error, msgContext);
	}

	public void error(Object error) {
		this.error(error, null);
	}

	public void error(Object error, String msgContext) {
		this.log(error, msgContext, Message.TYPE_ERROR);
	}

	public void addDivider() {
		this.log("", null, Message.TYPE_DIVIDER);
	}

	// clear all debug log messages
	public void clearMessages() {
		messages.clear();
		numErrors = 0;
	}

	/*************************************
	 * INSPECTOR
	 ************************************/

	// return a string representation of the expression
	public String getInspectorExpression() {
		return DebugToolbarBean.join(inspectorExpression);
	}
	
	public boolean hasInspectorExpression() {
		return (inspectorExpression != null && inspectorExpression.size()>0);
	}

	public static void addInspectorMessage(String message) {
		FacesContext.getCurrentInstance().addMessage("inspectorMessages", new FacesMessage(FacesMessage.SEVERITY_WARN, message, message));
	}

	// split the expression on the dots, but not for dots in parentheses
	public void setInspectorExpression(String expression) {
		String regex = "\\.(?![^(]*\\))";
		inspectorExpression = new ArrayList<String>(Arrays.asList(expression.split(regex)));

		addExpressionToHistory();
	}

	public void addInspectorExpressionComponent(String c) {
		inspectorExpression.add(c);

		addExpressionToHistory();
	}

	// remove the last component of the expression
	public void removeExpressionComponent() {
		inspectorExpression.remove(inspectorExpression.size() - 1);
	}

	public boolean isExpressionMultipleComponents() {
		return inspectorExpression.size() > 1;
	}

	public String getInspectorShowHiddenComponents() {
		return (inspectorShowHiddenComponents ? "show" : "hide");
	}

	public void setInspectorShowHiddenComponents(String to) {
		inspectorShowHiddenComponents = to.equals("show");
	}

	public String getInspectorSelectedComponentId() {
		return inspectorSelectedComponentId;
	}

	public void setInspectorSelectedComponentId(String to) {
		this.inspectorSelectedComponentId = to;
	}

	private void addExpressionToHistory() {
		if (inspectorHistory == null) {
			inspectorHistory = new ArrayList<String>();
		}

		if (!inspectorHistory.contains(getInspectorExpression())) {
			inspectorHistory.add(getInspectorExpression());
		}

		if (inspectorHistory.size() > 50) {
			inspectorHistory.remove(inspectorHistory.size() - 1); // remove
																	// oldest
																	// element
		}
	}

	public ArrayList<String> getInspectorHistory() {
		return inspectorHistory;
	}

	// retrieve a list of sorted methods for a class
	// Call is routed to the ComponentAnalyser
	public List<Method> getSortedMethods(Class<?> in) {

		return ComponentAnalyser.INSTANCE.getSortedMethods(in, inspectorDeclaredOnly);
	}

	// retrieve a list of sorted fields for a class
	// Call is routed to the ComponentAnalyser
	public List<Field> getSortedFields(Class<?> in) {
		return ComponentAnalyser.INSTANCE.getSortedFields(in, inspectorDeclaredOnly);
	}

	// sort fields by name

	public String getInspectorLink(String className) {

		if (className == null) {
			return "";
		}
	
		String inspectorLink = "";
		
		try {

			String classPath;

			if (className.startsWith("javax.faces")) {

				classPath = className.replace(".", "/") + ".html";
				inspectorLink = LINKBASE_FACES + classPath;

			} else if (className.startsWith("java")) { // link to java api

				classPath = className.replace(".", "/") + ".html";
				inspectorLink = LINKBASE_JAVA + classPath;

			} else if (className.startsWith("com.ibm")) { // link to IBM/XPages
															// API
				classPath = className.replace(".", "/") + ".html";
				inspectorLink = LINKBASE_IBM + classPath;

			} else { // generic Google link

				inspectorLink = LINKBASE_GOOGLE + className;

			}

		} catch (Exception e) {
		}

		return inspectorLink;

	}

	public boolean isInspectorDeclaredOnly() {
		return inspectorDeclaredOnly;
	}

	public void setInspectorDeclaredOnly(boolean apiDeclaredOnly) {
		this.inspectorDeclaredOnly = apiDeclaredOnly;
		this.inspectorHideMethods = false;
	}

	public boolean isInspectorHideMethods() {
		return inspectorHideMethods;
	}

	public void setInspectorHideMethods(boolean to) {
		inspectorHideMethods = to;
	}

	// check if the selected type is filtered from the list of messages
	public boolean isFiltered(String type) {
		return filterLogTypes.contains(type);
	}

	// add or remove the selected type to the list of filtered message types
	public void toggleFiltered(String type, boolean included) {

		if (included) {

			if (filterLogTypes.contains(type)) {
				filterLogTypes.remove(type);

			}

		} else {

			if (!filterLogTypes.contains(type)) {
				filterLogTypes.add(type);
			}

		}
	}

	// filter the list of messages and return it
	public Vector<Message> getFilteredMessages() {

		if (filterLogTypes.size() == 0) {

			return messages;

		} else {

			Vector<Message> filtered = new Vector<Message>();

			Iterator<Message> messagesIt = messages.iterator();
			while (messagesIt.hasNext()) {

				Message m = messagesIt.next();

				if (!filterLogTypes.contains(m.getType())) {

					filtered.add(m);

				}

			}

			return filtered;
		}

	}

	public Vector<Message> getMessages() {
		return messages;
	}

	public boolean isDetailedTimings() {
		return isDetailedTimings;
	}

	public void setDetailedTimings(boolean to) {
		this.isDetailedTimings = to;
	}

	public boolean hasMessages() {
		return this.messages.size() > 0;
	}

	public int getNumMessages() {
		return this.messages.size();
	}

	public int getNumErrors() {
		return this.numErrors;
	}

	public boolean hasErrors() {
		return this.numErrors > 0;
	}

	/**
	 * Start a timer
	 * 
	 * @deprecated use {@link debug(String msg)} instead
	 */
	public void startTimer(String id) {
		this.debug("(timer started) " + id);
	}

	/**
	 * Stop a timer
	 * 
	 * @deprecated use {@link debug(String msg)} instead
	 */
	public void stopTimer(String id) {
		this.debug("(timer stopped) " + id);
	}

	public String getConsolePath() {
		return consolePath;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ArrayList<Entry<String, String>> getCustomVars(String type) {

		ArrayList customVars = new ArrayList<Entry<String, String>>();

		try {

			XSPContext context = XSPContext.getXSPContext(FacesContext.getCurrentInstance());

			if (type.equals("user")) {

				DirectoryUser currentUser = context.getUser();

				Name n = getSession().createName(effectiveUserName);
				Vector<String> groups = new Vector(currentUser.getGroups());
				groups.remove(effectiveUserName);
				groups.remove(n.getCommon());

				customVars.add(new AbstractMap.SimpleEntry("username", effectiveUserName));
				customVars.add(new AbstractMap.SimpleEntry("access level", DebugToolbarUtils.getReadableAccessLevel(accessLevel)));

				customVars.add(new AbstractMap.SimpleEntry("roles", (userRoles.size() > 0 ? userRoles.toString() : "(no roles enabled)")));
				customVars.add(new AbstractMap.SimpleEntry("groups", (groups.size() > 0 ? groups.toString() : "(user not listed in any group)")));

			} else if (type.equals("browser")) {

				customVars.add(new AbstractMap.SimpleEntry("name", context.getUserAgent().getBrowser() + " " + context.getUserAgent().getBrowserVersion()));
				customVars.add(new AbstractMap.SimpleEntry("user agent", context.getUserAgent().getUserAgent()));
				customVars.add(new AbstractMap.SimpleEntry("language", context.getLocale().getDisplayName() + " (" + context.getLocaleString() + ")"));
				customVars.add(new AbstractMap.SimpleEntry("timezone", context.getTimeZoneString()));

			} else if (type.equals("server")) {

				extLibVersion = getExtLibVersion();

				customVars.add(new AbstractMap.SimpleEntry("name", getCurrentDatabase().getServer()));
				customVars.add(new AbstractMap.SimpleEntry("version", notesVersion));
				customVars.add(new AbstractMap.SimpleEntry("platform", getSession().getPlatform()));
				customVars.add(new AbstractMap.SimpleEntry("extension library version", extLibVersion));

			} else if (type.equals("database")) {

				customVars.add(new AbstractMap.SimpleEntry("name", currentDbTitle));
				customVars.add(new AbstractMap.SimpleEntry("path", currentDbFilePath));

				customVars.add(new AbstractMap.SimpleEntry("size", DebugToolbarUtils.getReadableSize((long) getCurrentDatabase().getSize())));
				customVars.add(new AbstractMap.SimpleEntry("created", getCurrentDatabase().getCreated().toString()));
				customVars.add(new AbstractMap.SimpleEntry("last modified", getCurrentDatabase().getLastModified().toString()));
				customVars.add(new AbstractMap.SimpleEntry("full text indexed?", (getCurrentDatabase().isFTIndexed() ? "yes (last update: "
						+ getCurrentDatabase().getLastFTIndexed().toString() + ")" : "no")));

			} else if (type.equals("request")) {

				ExternalContext extCon = FacesContext.getCurrentInstance().getExternalContext();

				HttpServletRequest httpServletRequest = (HttpServletRequest) extCon.getRequest();

				customVars.add(new AbstractMap.SimpleEntry("query string", context.getUrl().getQueryString()));
				customVars.add(new AbstractMap.SimpleEntry("remote address", httpServletRequest.getRemoteAddr()));

				customVars.add(new AbstractMap.SimpleEntry("cookies", getCookieDump(extCon.getRequestCookieMap())));
			}

		} catch (Exception e) {
			error(e, "getCustomVars");

		}

		return customVars;

	}
	
	public static String getReadableSize(long bytes) {
		return DebugToolbarUtils.getReadableSize(bytes);
	}
	
	// retrieve the version of the extension library using reflection (since it
	// might not be installed)
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static String getExtLibVersion() {

		try {

			Class c = Class.forName("com.ibm.xsp.extlib.util.ExtLibUtil");
			Method m = c.getMethod("getExtLibVersion");
			return (String) m.invoke(null);

		} catch (Exception e) {
			return "not activated or installed";
		}

	}

	private static String getCookieDump(Map<String, Cookie> cookieMap) {

		StringBuilder sb = new StringBuilder();

		sb.append("<table class=\"dumped\"><tbody>");

		for (Cookie cookie : cookieMap.values()) {
			sb.append("<tr><td>" + cookie.getName() + "</td><td>" + cookie.getValue() + "</td></tr>");
		}

		sb.append("</tbody></table>");

		return sb.toString();

	}

	public String getColor() {
		return toolbarColor;
	}

	public void setColor(String color) {
		this.toolbarColor = (color == null ? DEFAULT_TOOLBAR_COLOR : color);
	}

	

	/*
	 * read components ids from the view root
	 */
	public ArrayList<String> getComponentIds() {

		try {

			inspectorComponentIdsOptions.clear();

			getComponentChildren((com.ibm.xsp.component.UIViewRootEx2) DebugToolbarUtils.resolveVariable("view"), "");

			if (inspectorSortAlphabetic) {
				Collections.sort(inspectorComponentIdsOptions);
			}

		} catch (Exception e) {
			error(e);
		}

		return inspectorComponentIdsOptions;

	}

	// walk the node tree and collect all component ids
	@SuppressWarnings("unchecked")
	private void getComponentChildren(UIComponent component, String prefix) {

		List<UIComponent> children = component.getChildren();

		if (inspectorComponentIdsOptions.size() > 0 && !inspectorSortAlphabetic) {
			prefix += "- ";
		}

		if (children.size() > 0) {

			for (UIComponent childNode : children) {
				String id = childNode.getId();
				
				if (id != null) {

					if (!"debugToolbar".equals(id)) { // don't add (children of)
														// debug toolbar)

						if (!id.startsWith("_") || inspectorShowHiddenComponents) {
							// add to list
							inspectorComponentIdsOptions.add(prefix + id + " (" + childNode.getClass().getSimpleName() + ")|" + id);
						}
					}
				}

				if (!"debugToolbar".equals(id)) {
					getComponentChildren(childNode, prefix);
				}
			}

		}
	}

	public boolean isInspectorSortAlphabetic() {
		return inspectorSortAlphabetic;
	}

	public void setInspectorSortAlphabetic(boolean to) {
		this.inspectorSortAlphabetic = to;
	}

	/************
	 * FILES
	 ***********/

	public String getSelectedLogFile() {
		return filesModule.getSelectedLogFile();
	}

	public void setSelectedLogFile(String to) {
		filesModule.setSelectedLogFile(to);
	}

	public String getLogFileContents() {
		return filesModule.getLogFileContents();
	}

	public void setLogFileContents(String to) {
		filesModule.setLogFileContents(to);
	}

	public boolean hasRecentFiles() {
		return filesModule.hasRecentFiles();
	}

	public ArrayList<SelectItemGroup> getLogFileOptions() {
		return filesModule.getLogFileOptions();
	}
	
	public void clearLogFileOptions() {
		filesModule.clearLogFileOptions();
	}

	public ArrayList<String> getLogFileHistory() {
		return filesModule.getLogFileHistory();
	}
	
	// checks if the selected file is the most recent version
	public boolean isLogFileMostRecent() {
		return filesModule.isLogFileMostRecent();
	}

	public void showFileContents() {
		filesModule.showFileContents();
	}

	/*************************************
	 * EXTERNAL DB LOGGING
	 ************************************/

	public String getLogDbPath() {
		return logDbPath;
	}

	public void setLogDbPath(String to) {

		try {
			this.logDbValid = true; // reset

			if (to.equals("current")) {
				this.logDbPath = getCurrentDatabase().getFilePath();
			} else {
				this.logDbPath = to;
			}
		} catch (NotesException e) {
			e.printStackTrace();
		}
	}

	public boolean getLogDbValid() {
		return logDbValid;
	}

	public boolean isLogEnabled() {
		return logEnabled;
	}

	public void setLogEnabled(boolean logDbEnabled) {
		this.logEnabled = logDbEnabled;
	}

	public String getLogLevel() {
		if (logLevel == LEVEL_ERROR) {
			return "error";
		} else if (logLevel == LEVEL_WARN) {
			return "warn";
		} else if (logLevel == LEVEL_DEBUG) {
			return "debug";
		} else if (logLevel == LEVEL_INFO) {
			return "info";
		} else {
			return "?";
		}
	}

	public void setLogLevel(String level) {

		// check for valid input
		if (level.equals("all") || level.equals("debug")) {
			logLevel = LEVEL_DEBUG;
		} else if (level.equals("info")) {
			logLevel = LEVEL_INFO;
		} else if (level.equals("warn")) {
			logLevel = LEVEL_WARN;
		} else if (level.equals("error")) {
			logLevel = LEVEL_ERROR;
		} else {
			logLevel = LEVEL_ERROR; // default if no valid level set
		}

	}

	private static boolean isRecycled(Database db) {

		boolean isRecycled = true;

		try {

			@SuppressWarnings("unused")
			int t = db.getCurrentAccessLevel();
			isRecycled = false;

		} catch (NotesException ne) {
			// ne.id == 4376 //object has been removed or recycled
		}

		return isRecycled;
	}

	// retrieve the log database object
	private Database getLogDb() {
		try {

			if (!logDbValid) { // db marked as invalid
				return null;
			}

			if (StringUtil.isEmpty(logDbPath)) {
				logDbValid = false;
				return null;
			}

			if (dbLog == null || DebugToolbarBean.isRecycled(dbLog)) {

				dbLog = getSession().getDatabase(serverName, logDbPath);

				if (dbLog == null) { // still null: mark as invalid
					logDbValid = false;
				}

				if (!dbLog.isOpen()) { // database object could not be opened:
										// mark as invalid
					dbLog = null;
					logDbValid = false;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dbLog;
	}

	// create a document in an external log database
	private void createLogDocument(Message message, boolean isError, Level severity) {

		if (!logEnabled) {
			return;
		}

		// check if we need to log this message, based on the log level set
		int minLogLevel = 0;

		if (message.getType().equals(Message.TYPE_ERROR)) {
			minLogLevel = LEVEL_ERROR;
		} else if (message.getType().equals(Message.TYPE_WARNING)) {
			minLogLevel = LEVEL_WARN;
		} else if (message.getType().equals(Message.TYPE_INFO)) {
			minLogLevel = LEVEL_INFO;
		} else if (message.getType().equals(Message.TYPE_DEBUG)) {
			minLogLevel = LEVEL_DEBUG;
		}

		if (logLevel < minLogLevel) {
			return;
		}

		Document docLog = null;

		try {

			getLogDb();

			// abort if log db could not be opened/ not specified
			if (!logDbValid) {
				return;
			}

			docLog = getLogDb().createDocument();

			docLog.replaceItemValue("Form", "LogEvent");
			docLog.replaceItemValue("LogAgentLanguage", "XPages");
			docLog.replaceItemValue("LogUserName", userName);
			docLog.replaceItemValue("LogEffectiveName", effectiveUserName);

			if (isError) {
				docLog.replaceItemValue("LogErrorMessage", message.getSummary());

				if (message.getErrorId() > 0) {
					docLog.replaceItemValue("LogErrorNumber", message.getErrorId());
				}

				docLog.replaceItemValue("LogStackTrace", message.getStackTrace());
				docLog.replaceItemValue("LogErrorLine", message.getErrorLine());
				docLog.replaceItemValue("LogFromMethod", message.getErrorClassName() + "." + message.getErrorMethod());
			}

			docLog.replaceItemValue("LogSeverity", severity.getName());

			DebugToolbarUtils.setDate(docLog, "LogEventTime", message.getDate());
			DebugToolbarUtils.setDate(docLog, "LogAgentStartTime", message.getDate());

			docLog.replaceItemValue("LogEventType", (isError ? "Error" : "Event"));
			docLog.replaceItemValue("LogMessage", message.getDetails());
			docLog.replaceItemValue("LogFromDatabase", currentDbFilePath);
			docLog.replaceItemValue("LogFromServer", serverName);

			String fromPage = message.getFromPage();
			if (fromPage == null) {
				fromPage = ((com.ibm.xsp.component.UIViewRootEx2) DebugToolbarUtils.resolveVariable("view")).getPageName();
				if (fromPage.indexOf("/") == 0) {
					fromPage = fromPage.substring(1);
				}
			}

			docLog.replaceItemValue("LogFromAgent", fromPage);

			docLog.replaceItemValue("LogAccessLevel", DebugToolbarUtils.getReadableAccessLevel(accessLevel));
			docLog.replaceItemValue("LogUserRoles", userRoles);
			docLog.replaceItemValue("LogClientVersion", notesVersion);

			docLog.save(true);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				docLog.recycle();
			} catch (Exception e) {
			}
		}

	}

	/******************************************
	 * utility functions
	 *****************************************/

	private Session getSession() {
		if (session == null) {
			session = (Session) DebugToolbarUtils.resolveVariable("session");
		} else {
			try {
				@SuppressWarnings("unused")
				boolean tmp = session.isOnServer();
			} catch (NotesException ne) {
				try {
					session = (Session) DebugToolbarUtils.resolveVariable("session");
				} catch (Exception e) {
				}
			}
		}
		return session;
	}

	private Database getCurrentDatabase() {
		if (dbCurrent == null || DebugToolbarBean.isRecycled(dbCurrent)) {
			dbCurrent = (Database) DebugToolbarUtils.resolveVariable("database");
		}
		return dbCurrent;
	}

	private static String join(Collection<String> c) {

		StringBuilder sb = new StringBuilder();
		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			sb.append(it.next());

			if (it.hasNext()) {
				sb.append(".");
			}
		}
		return sb.toString();
	}

	public static List<String> getCanonicalNames(Class<?>[] classCollection) {

		ArrayList<String> result = new ArrayList<String>();

		for (Class<?> c : classCollection) {
			result.add(c.getCanonicalName());
		}
		return result;

	}

	// Inspector API Wrapper

	public boolean executeInspector() {
		m_CRE = ComponentAnalyser.INSTANCE.processInspection(getInspectorExpression());
		if (m_CRE != null) {
			return m_CRE.isSuccess();
		}
		return false;
	}

	public List<Method> getInspectorMethodList() {
		if (m_CRE.isSuccess()) {
			return ComponentAnalyser.INSTANCE.getSortedMethods(m_CRE.getResultObjectClass(), inspectorDeclaredOnly);
		}
		return new ArrayList<Method>();
	}

	public List<Field> getInspectorFielsList() {
		if (m_CRE.isSuccess()) {
			return ComponentAnalyser.INSTANCE.getSortedFields(m_CRE.getResultObjectClass(), inspectorDeclaredOnly);
		}
		return new ArrayList<Field>();
	}

	public boolean hasInspectorException() {
		if (m_CRE == null) {
			return false;
		}
		return !m_CRE.isSuccess();
	}

	public String getInspectorExceptionOutput() {
		if (m_CRE == null) {
			return "No inspection done so far!";
		}
		if (m_CRE.isSuccess()) {
			return "";
		}
		String strMessage = m_CRE.getErrorMessage();
		if (m_CRE.getError() != null) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			m_CRE.getError().printStackTrace(pw);
			strMessage = strMessage + "\n" + sw.toString();
		}
		return strMessage;
	}

	public boolean hasInspectorResult() {
		return m_CRE != null && m_CRE.isSuccess();
	}

	public String getInspectorResultClassName() {
		if (hasInspectorResult()) {
			return m_CRE.getResultObjectClass().getCanonicalName();
		}
		return "";
	}

	public String getInspectorResultValue() {
		if (hasInspectorResult()) {
			return m_CRE.getResultObject().toString();
		}
		return "";

	}

	public boolean isDebugLifecycle() {
		return debugLifecycle;
	}
	public void setDebugLifecycle(boolean to) {
		this.debugLifecycle = to;
	}
	
	public boolean isRestoreViewPhase() {
		DebugBeanPhaseListener listener = DebugBeanPhaseListener.getInstance();
		return (null != listener && listener.isRestoreViewPhase());
	}

	public boolean isApplyRequestValuesPhase() {
		DebugBeanPhaseListener listener = DebugBeanPhaseListener.getInstance();
		return (null != listener && listener.isApplyRequestValuesPhase());
	}

	public boolean isProcessValidationsPhase() {
		DebugBeanPhaseListener listener = DebugBeanPhaseListener.getInstance();
		return (null != listener && listener.isProcessValidationsPhase());
	}

	public boolean isUpdateModelValuesPhase() {
		DebugBeanPhaseListener listener = DebugBeanPhaseListener.getInstance();
		return (null != listener && listener.isUpdateModelValuesPhase());
	}

	public boolean isInvokeApplicationPhase() {
		DebugBeanPhaseListener listener = DebugBeanPhaseListener.getInstance();
		return (null != listener && listener.isInvokeApplicationPhase());
	}

	public boolean isRenderResponsePhase() {
		DebugBeanPhaseListener listener = DebugBeanPhaseListener.getInstance();
		return (null != listener && listener.isRenderResponsePhase());
	}
	
}
