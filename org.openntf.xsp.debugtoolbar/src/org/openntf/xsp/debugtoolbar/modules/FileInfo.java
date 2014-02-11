package org.openntf.xsp.debugtoolbar.modules;

import java.io.Serializable;

//class to hold information about a file
public class FileInfo implements Serializable, Comparable<Object> {

	private static final long serialVersionUID = -120581900512974320L;
	String name;
	Long modified;
	long size;

	public FileInfo(String name, long modified, long size) {
		this.name = name;
		this.modified = new Long(modified);
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public Long getModified() {
		return modified;
	}

	public String getDescription() {
		return name + " (" + DebugToolbarUtils.getReadableSize(size) + ") ";
	}

	public int compareTo(Object argInfo) {
		return ((FileInfo) argInfo).getModified().compareTo(this.getModified());
	}

}
