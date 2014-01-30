package org.openntf.xsp.debugtoolbar.lifecycle;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;

import org.openntf.xsp.debugtoolbar.beans.DebugToolbarBean;

import com.ibm.commons.util.StringUtil;

/*
 * @author Tony McGuckin, IBM
 * 
 * Originally found at the XSnippets site: http://openntf.org/XSnippets.nsf/snippet.xsp?id=xrpl-isphase-api
 * 
 * All code submitted to OpenNTF XSnippets, whether submitted as a "Snippet" or in the body of a Comment, is provided under the Apache License Version 2.0.
 */
public class DebugBeanPhaseListener implements javax.faces.event.PhaseListener {

	private static final long serialVersionUID = 1L;

	private static DebugBeanPhaseListener instance;

	private PhaseId phaseId;

	public DebugBeanPhaseListener() {
		instance = this;
	}

	// ------------------------------------------------------------------------

	public static DebugBeanPhaseListener getInstance() {
		if (null == instance) {
			instance = new DebugBeanPhaseListener();
		}
		return instance;
	}

	// ------------------------------------------------------------------------

	public boolean isRestoreViewPhase() {
		return (null != phaseId && phaseId.equals(PhaseId.RESTORE_VIEW));
	}

	public boolean isApplyRequestValuesPhase() {
		return (null != phaseId && phaseId.equals(PhaseId.APPLY_REQUEST_VALUES));
	}

	public boolean isProcessValidationsPhase() {
		return (null != phaseId && phaseId.equals(PhaseId.PROCESS_VALIDATIONS));
	}

	public boolean isUpdateModelValuesPhase() {
		return (null != phaseId && phaseId.equals(PhaseId.UPDATE_MODEL_VALUES));
	}

	public boolean isInvokeApplicationPhase() {
		return (null != phaseId && phaseId.equals(PhaseId.INVOKE_APPLICATION));
	}

	public boolean isRenderResponsePhase() {
		return (null != phaseId && phaseId.equals(PhaseId.RENDER_RESPONSE));
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

	// ------------------------------------------------------------------------

	public void beforePhase(PhaseEvent event) {
		try {
			phaseId = event.getPhaseId();

			if (doDebug(event)) {
				DebugToolbarBean dBar = DebugToolbarBean.get();
				if (dBar.isDebugLifecycle()) {
					if (event.getPhaseId().equals(PhaseId.RESTORE_VIEW)) {
						dBar.addDivider();
						dBar.debug("Request:\tStarted...");
					}
					//dBar.debug(" ");
					dBar.debug("Lifecycle:\tBefore Phase: "
							+ event.getPhaseId());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ------------------------------------------------------------------------

	public void afterPhase(PhaseEvent event) {
		try {
			phaseId = event.getPhaseId();

			if (doDebug(event)) {

				DebugToolbarBean dBar = DebugToolbarBean.get();

				if (dBar.isDebugLifecycle()) {

					dBar.debug(event.getFacesContext().getExternalContext()
							.getRequestParameterMap().get("$$ajaxid"));

					dBar.debug("Lifecycle:\tAfter Phase: " + event.getPhaseId());
					//dBar.debug(" ");
					if (event.getPhaseId().equals(PhaseId.RENDER_RESPONSE)) {
						dBar.debug("Request:\tCompleted.");
						dBar.addDivider();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean doDebug(PhaseEvent event) {

		String ajaxId = (String) event.getFacesContext().getExternalContext()
				.getRequestParameterMap().get("$$ajaxid");

		// only debug messages not coming from the debug toolbar
		return StringUtil.isEmpty(ajaxId) || !ajaxId.endsWith("debugToolbar");

	}

} // end DebugBeanPhaseListener
