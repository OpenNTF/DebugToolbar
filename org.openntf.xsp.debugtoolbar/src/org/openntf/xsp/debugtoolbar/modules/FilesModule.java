package org.openntf.xsp.debugtoolbar.modules;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

import org.openntf.xsp.debugtoolbar.beans.DebugToolbarBean;

import com.ibm.commons.util.StringUtil;

public class FilesModule {
	
	private long logFileModifiedRead;
	private ArrayList<String> logFileHistory;
	private ArrayList<SelectItemGroup> logFileOptions;
	
	private String dominoProgramDir;
	private String dominoDataDir;
	
	private static final long LOG_FILE_SIZE_LIMIT_MB = 5; 	// log file size limit in MB
	private static final String LOG_FILE_CONTENTS = "logFileContents";
	private static final String LOG_FILE_SELECTED = "logFileSelected";
	
	private static final String TEMP_VAR_NAME = "dBarTemp";
	
	public FilesModule() {
		
	}
	
	// returns a list of all available log files
		public ArrayList<SelectItemGroup> getLogFileOptions() {

			try {

				if (logFileOptions == null || logFileOptions.size() == 0) {
					
					// path to the domino data / program directory
					dominoDataDir = com.ibm.xsp.model.domino.DominoUtils.getEnvironmentString("Directory"); 
dominoProgramDir = com.ibm.xsp.model.domino.DominoUtils.getEnvironmentString("NotesProgram"); // path	

					logFileOptions = new ArrayList<SelectItemGroup>();

					// files in workspace/logs folder (e.g. error-log files)

					// error logs
					logFileOptions.add(getFilesOptions("domino" + File.separator + "workspace" + File.separator + "logs" + File.separator, "Error (logs)", "error",
							null));

					// trace logs
					logFileOptions.add(getFilesOptions("domino" + File.separator + "workspace" + File.separator + "logs" + File.separator, "Trace (logs)", "trace",
							null));

					// other files
					logFileOptions.add(getFilesOptions("domino" + File.separator + "workspace" + File.separator + "logs" + File.separator, "Other (logs)", null,
							new ArrayList<String>(Arrays.asList(("error,trace").split(",")))));

					// files in IBM_TECHNICAL_SUPPORT folder

					// xpages logs
					logFileOptions.add(getFilesOptions("IBM_TECHNICAL_SUPPORT" + File.separator, "XPages (IBM_TECHNICAL_SUPPORT)", "xpages", null));

					// console logs
					logFileOptions.add(getFilesOptions("IBM_TECHNICAL_SUPPORT" + File.separator, "Console (IBM_TECHNICAL_SUPPORT)", "console", null));

					logFileOptions.add(getFilesOptions("IBM_TECHNICAL_SUPPORT" + File.separator, "Other (IBM_TECHNICAL_SUPPORT)", null, new ArrayList<String>(
							Arrays.asList(("xpages,console").split(",")))));

					// other files
					ArrayList<SelectItem> groupItems = new ArrayList<SelectItem>();
					groupItems.add(new SelectItem(dominoProgramDir + File.separator + "notes.ini", "notes.ini"));
					groupItems.add(new SelectItem(dominoProgramDir + File.separator + "jvm" + File.separator + "lib" + File.separator + "security" + File.separator
							+ "java.policy", "java.policy"));
					logFileOptions.add(new SelectItemGroup("other files", null, true, groupItems.toArray(new SelectItem[groupItems.size()])));

				}

			} catch (Exception e) {
				DebugToolbarBean.get().error(e);
			}

			return logFileOptions;
		}

		public void clearLogFileOptions() {
			if (logFileOptions != null) {
				logFileOptions.clear();
			}
		}

		// retrieve a list of files from the specified folder relative to the
		// domino\data folder (as a SelectItemGroup)
		// optionally with an include/ exclude filter
		private SelectItemGroup getFilesOptions(String folder, String groupTitle, String prefixInclude, ArrayList<String> prefixExclude) {

			ArrayList<SelectItem> groupItems = new ArrayList<SelectItem>();
			ArrayList<FileInfo> logFilesInfoList = getFilesList(folder, prefixInclude, prefixExclude);

			for (FileInfo info : logFilesInfoList) {
				groupItems.add(new SelectItem(dominoDataDir + File.separator + folder + info.getName(), info.getDescription()));
			}

			return new SelectItemGroup(groupTitle, null, true, groupItems.toArray(new SelectItem[groupItems.size()]));
		}

		private ArrayList<FileInfo> getFilesList(String folder, String prefixInclude, ArrayList<String> prefixExclude) {

			// list of included file extensions for log folders
			ArrayList<String> includeExt = new ArrayList<String>();
			includeExt.add("xml");
			includeExt.add("log");
			includeExt.add("txt");

			File dir = new File(dominoDataDir + File.separator + folder);

			ArrayList<FileInfo> filesInfoList = new ArrayList<FileInfo>();

			for (File f : dir.listFiles()) {

				if (!f.isDirectory() && f.length() > 0) {

					String name = f.getName();
					String ext = name.substring(name.lastIndexOf(".") + 1).toLowerCase();

					if (includeExt.contains(ext)) {

						boolean include = true;

						if (prefixInclude != null) {
							include = f.getName().startsWith(prefixInclude);

						} else if (prefixExclude != null) {

							for (String prefix : prefixExclude) {
								if (f.getName().startsWith(prefix)) {
									include = false;
									break;
								}
							}
						}

						if (include) {
							filesInfoList.add(new FileInfo(f.getName(), f.lastModified(), f.length()));
						}
					}
				}
			}

			// sort the list of files descending by last modified
			Collections.sort(filesInfoList);

			return filesInfoList;

		}
		
		public ArrayList<String> getLogFileHistory() {
			return logFileHistory;
		}
		
		// checks if the selected file is the most recent version
		public boolean isLogFileMostRecent() {

			String selected = getSelectedLogFile();

			if (StringUtil.isEmpty(selected)) {
				return true;
			} else {

				File f = new File(selected);
				long lastModified = f.lastModified();

				return (logFileModifiedRead >= lastModified);
			}

		}
		
		public boolean hasRecentFiles() {
			return (logFileHistory != null && logFileHistory.size() > 0);
		}
		
		private void addToFileHistory(String fileName) {
			if (logFileHistory == null) {
				logFileHistory = new ArrayList<String>();
			}

			if (!logFileHistory.contains(fileName)) {

				if (logFileHistory.size() >= 5) { // store last 5 files only
					logFileHistory.remove(logFileHistory.size() - 1); // remove
																		// oldest
																		// element
				}

				logFileHistory.add(0, fileName);
			}

		}
		
		/*
		 * Reads the selected log file and stores the contents in the viewScope
		 */
		public void showFileContents() {
			
			BufferedReader reader = null;

			try {

				String selected = getSelectedLogFile();

				if (StringUtil.isEmpty(selected)) { // no file selected
					setLogFileContents(null);
					return;
				}

				// add selected file to history
				addToFileHistory(selected);

				String contents = null;

				File f = new File(selected);
				if (f.length() > (LOG_FILE_SIZE_LIMIT_MB * 1024 * 1024)) { // file
																			// too
																			// large

					contents = "FilesModule is too large: size is " + (f.length() / 1024 / 1024) + " MB (limit is " + LOG_FILE_SIZE_LIMIT_MB + " MB)";

				} else {

					logFileModifiedRead = f.lastModified();

					StringBuffer fileContents = new StringBuffer(1000);
					reader = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
					char[] buffer = new char[1024];
					int read = 0;

					while ((read = reader.read(buffer)) != -1) {
						String readData = String.valueOf(buffer, 0, read);
						fileContents.append(readData);
						buffer = new char[1024];
					}

					// escape less then /greater then characters
					contents = fileContents.toString().replace("<", "&lt;").replace(">", "&gt;");
				}

				setLogFileContents(contents);

			} catch (Exception e) {
				DebugToolbarBean.get().error(e);
			} finally {
				try {
					reader.close();
				} catch (Exception e) {
				}
			}

		}
		
		public String getSelectedLogFile() {
			return getTempVar(LOG_FILE_SELECTED);
		}
		
		public void setSelectedLogFile(String to) {
			setTempVar(LOG_FILE_SELECTED, to);
		}

		public String getLogFileContents() {
			return getTempVar(LOG_FILE_CONTENTS);
		}

		public void setLogFileContents(String to) {
			setTempVar(LOG_FILE_CONTENTS, to);
		}
		
		@SuppressWarnings("unchecked")
		private String getTempVar(String varName) {
			Map<String, Object> viewScope = (Map<String, Object>) DebugToolbarUtils.resolveVariable("viewScope");

			if (viewScope.containsKey(TEMP_VAR_NAME)) {
				return ((HashMap<String, String>) viewScope.get(TEMP_VAR_NAME)).get(varName);
			}
			return null;

		}

		// store a (temporary) dBar variable in the viewScope
		@SuppressWarnings({ "unchecked", "rawtypes" })
		private void setTempVar(String varName, String varContent) {

			Map<String, Object> viewScope = (Map<String, Object>) DebugToolbarUtils.resolveVariable("viewScope");

			HashMap<String, String> tempVar = null;
			if (viewScope.containsKey(TEMP_VAR_NAME)) {
				tempVar = (HashMap) viewScope.get(TEMP_VAR_NAME);
			} else {
				tempVar = new HashMap<String, String>();
			}

			tempVar.put(varName, varContent);
			viewScope.put(TEMP_VAR_NAME, tempVar);

		}

}
