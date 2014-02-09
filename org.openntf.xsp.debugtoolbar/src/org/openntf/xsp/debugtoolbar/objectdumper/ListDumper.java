package org.openntf.xsp.debugtoolbar.objectdumper;

import java.util.Iterator;
import java.util.List;

import org.openntf.xsp.debugtoolbar.beans.DebugToolbarBean;

@SuppressWarnings("rawtypes")
public class ListDumper implements IObjectDumper<List> {

	// dumper for all List types (Vector, ArrayList)

	public String getDump(Object obj, DebugToolbarBean dBar) {

		StringBuilder sb = new StringBuilder();

		try {

			if (!dBar.isShowLists()) {
				return "<span class=\"highlight\">(hidden list/ map)</span>";
			}

			List list = (List) obj;

			if (list.size() == 0) {

				return "(empty list)";

			} else {

				Iterator it = list.iterator();

				sb.append("<table class=\"dumped\"><tbody>");

				boolean first = true;
				int counter = 0;

				while (it.hasNext()) {

					Object itObject = it.next();

					if (counter >= DebugToolbarBean.MAX_DATASET_SAMPLE) {

						sb.append("<tr><td colspan=\"2\"><span class=\"highlight\">More items available...</span></td></tr>");
						break;
					}

					sb.append("<tr><td" + (first ? " class=\"first\"" : "")
							+ ">[" + counter + "]</td><td"
							+ (first ? " class=\"first\"" : "") + ">");
					sb.append(dBar.dumpIt(itObject));
					sb.append("</td></tr>");
					first = false;
					counter++;
				}

				sb.append("</tbody></table>");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return sb.toString();
	}

}
