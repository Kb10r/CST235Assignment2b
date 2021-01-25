package controllers;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
@ViewScoped
public class FormController {
	public String onSubmit(User u) {
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", u);
		return "TestResponse.xhtml";
	}
	
	public String onFlash(User u) {
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", u);
		return "TestResponseFlash.xhtml?faces-redirect=true";
	}
}
