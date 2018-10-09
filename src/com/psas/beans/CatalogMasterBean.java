package com.psas.beans;




import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import com.psas.dao.CatalogMasterInterface;
import com.psas.daoimpl.CatalogMasterImpl;


@ManagedBean(name = "catMaster2", eager = true)
@RequestScoped
@ViewScoped
public class CatalogMasterBean implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6213440663343748626L;
	private String informationType;	
	private	String values;
	private String sequenceOfDisplay;
	private String status;
	
	private CatalogMasterInterface catalogMasterInterface=new CatalogMasterImpl();
	

	

	


	public String submit() throws Exception
	{
	System.out.println("submit method started "+informationType+" "+values+" "+sequenceOfDisplay+" "+status);
	
	FacesContext context = FacesContext.getCurrentInstance();
	context.getExternalContext().getFlash().setKeepMessages(true);
	
	
	
	
	
	
	int result=0;
	
	result=catalogMasterInterface.getstart(informationType, values, sequenceOfDisplay, status);
	if(result==1)
	{
		System.out.println("succesful");
	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Your submission is successful.", "PrimeFaces Rocks."));
	System.out.println("successful "+result);
	return "catalogueMaster?faces-redirect=true" ;
	}
	
	else if(result==2)
	{
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "This combination of Interaction Type and value is already registered", "PrimeFaces Rocks."));
		return "catalogueMaster?faces-redirect=false";
	
	}
		
	
	
	else
	{
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Internal Error", "PrimeFaces Rocks."));
		return "catalogueMaster?faces-redirect=false";
	}
	
	
	
}
	
	public void reset()
	{
	
		 informationType=null;	
         values=null;
		 sequenceOfDisplay=null;
		 status=null;
	}
	
	
	
	
	
	public String getInformationType() {
		return informationType;
	}


	public void setInformationType(String informationType) {
		this.informationType = informationType;
	}


	public String getValues() {
		return values;
	}


	public void setValues(String values) {
		this.values = values;
	}


	public String getSequenceOfDisplay() {
		return sequenceOfDisplay;
	}


	public void setSequenceOfDisplay(String sequenceOfDisplay) {
		this.sequenceOfDisplay = sequenceOfDisplay;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public CatalogMasterInterface getCatalogMasterInterface() {
		return catalogMasterInterface;
	}


	public void setCatalogMasterInterface(CatalogMasterInterface catalogMasterInterface) {
		this.catalogMasterInterface = catalogMasterInterface;
	}
	
	
	
}
