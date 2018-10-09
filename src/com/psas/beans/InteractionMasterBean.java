package com.psas.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import com.psas.dao.InteractionMasterInterface;
import com.psas.daoimpl.InteractionMasterImpl;
import com.psas.daoimpl.ProductMasterImpl;
import com.psas.vo.InteractionMasterVo;
import com.psas.vo.ProductMasterVo;



@ManagedBean(name = "intMaster1", eager = true)
@RequestScoped
@ViewScoped
public class InteractionMasterBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1902764812114805085L;
	
	private String fieldDealerName;
	private String fieldAgronomistName;
	private String customerName;
	private String interactionDetails;
	
	
	private InteractionMasterInterface interactionMasterInterface=new InteractionMasterImpl() ;
		
		
private  List<InteractionMasterVo> listObj2;
	
	InteractionMasterVo interactionMasterVo=new InteractionMasterVo();
	
	
	
	@PostConstruct
	public void init(){
		setListObj2(new  ArrayList<InteractionMasterVo>());
		//autosuggestList=new ArrayList<String>();
		try {
			setListObj2(interactionMasterInterface.getstart1());
			
			System.out.println("I am init");
			
			//setFilteredlist(listObj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		                                



	}   
	
	public String getFieldDealerName() {
		return fieldDealerName;
	}
	public void setFieldDealerName(String fieldDealerName) {
		this.fieldDealerName = fieldDealerName;
	}
	public String getFieldAgronomistName() {
		return fieldAgronomistName;
	}
	public void setFieldAgronomistName(String fieldAgronomistName) {
		this.fieldAgronomistName = fieldAgronomistName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getInteractionDetails() {
		return interactionDetails;
	}
	public void setInteractionDetails(String interactionDetails) {
		this.interactionDetails = interactionDetails;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	public String submit() throws Exception
	{
		
		System.out.println("fieldDealerName"+fieldDealerName);
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getFlash().setKeepMessages(true);
		
		
		
		int result=0;
		result=interactionMasterInterface.getstart(fieldDealerName, fieldAgronomistName, customerName, interactionDetails);
		if(result==1)
		{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Your submission is successful.", "PrimeFaces Rocks."));
		System.out.println("successful "+result);
		}
		else
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Your submission is unsuccessful due to internal error.", "PrimeFaces Rocks."));	
		
		
		
		return "interactionMaster?faces-redirect=true";
	}
	

	public String reset()
	{
		fieldDealerName=null;
		 fieldAgronomistName=null;
		 customerName=null;
		 interactionDetails=null;
		
		
		
		return "interactionMaster?faces-redirect=true";
	}

	public List<InteractionMasterVo> getListObj2() {
		return listObj2;
	}

	public void setListObj2(List<InteractionMasterVo> listObj2) {
		this.listObj2 = listObj2;
	}

}
