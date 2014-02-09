package org.openntf.xsp.debugtoolbar.objectdumper;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.openntf.xsp.debugtoolbar.beans.DebugToolbarBean;

@SuppressWarnings("rawtypes")
public class MapDumper implements IObjectDumper<Map> {

	@SuppressWarnings({ "unchecked" })
	public String getDump(Object obj, DebugToolbarBean dBar) {

		StringBuilder sb = new StringBuilder();

		try {
			
			Map map = (Map) obj;
			SortedSet<Object> keys = new TreeSet<Object>(map.keySet());

			sb.append("<table class=\"dumped\"><tbody>");

			int counter = 0;
			boolean first = true;

			for (Object key : keys) {

				if (counter >= DebugToolbarBean.MAX_DATASET_SAMPLE) {
					sb.append("<tr><td colspan=\"2\"><span class=\"highlight\">More items available...</span></td></tr>");
					break;
				}

				sb.append("<tr><td" + (first ? " class=\"first\"" : "") + ">"
						+ key + "</td>" + "<td"
						+ (first ? " class=\"first\"" : "") + ">"
						+ dBar.dumpIt(map.get(key)) + "</td></tr>");

				first = false;
				counter++;

			}

			sb.append("</tbody></table>");

		} catch (Exception e) {

			e.printStackTrace();
		}

		return sb.toString();
	}
}
