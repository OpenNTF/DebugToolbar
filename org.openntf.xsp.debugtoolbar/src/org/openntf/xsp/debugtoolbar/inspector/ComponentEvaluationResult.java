package org.openntf.xsp.debugtoolbar.inspector;

import java.io.Serializable;

public class ComponentEvaluationResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean m_Success;
	private String m_ErrorMessage;
	private Throwable m_Error;
	private Object m_ResultObject;
	private Class<?> m_ResultObjectClass;

	public static ComponentEvaluationResult generateResult(Object objResult) {
		ComponentEvaluationResult cre = new ComponentEvaluationResult();
		cre.setSuccess(true);
		cre.setResultObject(objResult);
		cre.setResultObjectClass(objResult.getClass());
		return cre;
	}

	public static ComponentEvaluationResult generateMissingParameterResult() {
		ComponentEvaluationResult crRC = new ComponentEvaluationResult();
		crRC.setErrorMessage("Edit parameters and click 'Enter' to execute this expression");
		crRC.setSuccess(false);
		return crRC;
	}

	public static ComponentEvaluationResult generateErroResult(String strError, Throwable err) {
		ComponentEvaluationResult crRC = new ComponentEvaluationResult();
		crRC.setErrorMessage(strError);
		crRC.setError(err);
		crRC.setSuccess(false);
		return crRC;
	}

	public String getErrorMessage() {
		return m_ErrorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		m_ErrorMessage = errorMessage;
	}

	public Object getResultObject() {
		return m_ResultObject;
	}

	public void setResultObject(Object resultObject) {
		m_ResultObject = resultObject;
	}

	public Class<?> getResultObjectClass() {
		return m_ResultObjectClass;
	}

	public void setResultObjectClass(Class<?> resultObjectClass) {
		m_ResultObjectClass = resultObjectClass;
	}

	public boolean isSuccess() {
		return m_Success;
	}

	public void setSuccess(boolean success) {
		m_Success = success;
	}

	public Throwable getError() {
		return m_Error;
	}

	public void setError(Throwable error) {
		m_Error = error;
	}

}
