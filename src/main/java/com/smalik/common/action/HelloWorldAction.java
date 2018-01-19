package com.smalik.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smalik.common.InspirationalBean;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.smalik.common.form.HelloWorldForm;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldAction extends Action{

    private InspirationalBean inspirationalBean;

    @Autowired
    public void setInspirationalBean(InspirationalBean inspirationalBean) {
        this.inspirationalBean = inspirationalBean;
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HelloWorldForm helloWorldForm = (HelloWorldForm) form;
		helloWorldForm.setMessage("Hello World! Struts");
		request.setAttribute("foo", "bar");
		request.setAttribute("inspiration", inspirationalBean == null ? "you suck" : inspirationalBean.getMessage());
		
		return mapping.findForward("success");
	}
	
}