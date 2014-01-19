package org.openntf.xsp.debugtoolbar.inspector;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;

import com.ibm.commons.util.StringUtil;
import com.ibm.xsp.page.compiled.ExpressionEvaluatorImpl;

public enum ComponentAnalyser {
	INSTANCE;

	public ComponentEvaluationResult processInspection(String strInspector) {
		try {
			if (StringUtil.isEmpty(strInspector)) {
				return null;
			}
			// don't execute expression if parameters need to be set first
			Pattern pattern = java.util.regex.Pattern.compile("\\((.*?)\\)", java.util.regex.Pattern.DOTALL);
			Matcher matcher = pattern.matcher(strInspector);
			while (matcher.find()) {
				String match = matcher.group(1).trim();
				if (!match.startsWith("\"") && !match.endsWith("\"")) {
					// not something in quotes
					if (match.indexOf(".") > -1 || match.indexOf("int") > -1 || match.indexOf("boolean") > -1 || match.indexOf("long") > -1) {
						return ComponentEvaluationResult.generateMissingParameterResult();
					}
				}
			}
			String valueExpr = "#{javascript:" + strInspector + "}";
			FacesContext fc = FacesContext.getCurrentInstance();
			ExpressionEvaluatorImpl evaluator = new ExpressionEvaluatorImpl(fc);
			ValueBinding vb = evaluator.createValueBinding(fc.getViewRoot(), valueExpr, null, null);
			Object objResult = vb.getValue(fc);
			return ComponentEvaluationResult.generateResult(objResult);

		} catch (Exception ex) {
			ex.printStackTrace();
			return ComponentEvaluationResult.generateErroResult("General Error: " + ex.getMessage(), ex);

		}
	}

	public ArrayList<Method> getSortedMethods(Class<?> cl, boolean inspectorDeclaredOnly) {
		Method[] classMethods = cl.getMethods();
		ArrayList<Method> methods = new ArrayList<Method>(Arrays.asList(classMethods));

		String className = cl.getCanonicalName();

		if (inspectorDeclaredOnly) {
			for (Iterator<Method> iterator = methods.iterator(); iterator.hasNext();) {
				Method method = iterator.next();
				if (!method.getDeclaringClass().getCanonicalName().equals(className)) {
					iterator.remove();
				}
			}
		}

		Collections.sort(methods, new Comparator<Method>() {

			public int compare(Method m1, Method m2) {
				String m1Name = m1.getName();
				String m2Name = m2.getName();

				if (m1Name.startsWith("_") && !m2Name.startsWith("_")) {
					return 1;
				}
				if (!m1Name.startsWith("_") && m2Name.startsWith("_")) {
					return -1;
				}
				return m1Name.compareTo(m2Name);
			}
		});

		return methods;
	}

	public ArrayList<Field> getSortedFields(Class<?> cl, boolean inspectorDeclaredOnly) {
		Field[] classFields = cl.getFields();
		ArrayList<Field> fields = new ArrayList<Field>(Arrays.asList(classFields));
		String className = cl.getCanonicalName();

		if (inspectorDeclaredOnly) {
			for (Iterator<Field> iterator = fields.iterator(); iterator.hasNext();) {
				Field field = iterator.next();
				if (!field.getDeclaringClass().getCanonicalName().equals(className)) {
					iterator.remove();
				}
			}
		}

		Collections.sort(fields, new Comparator<Field>() {

			public int compare(Field o1, Field o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		return fields;
	}

}
