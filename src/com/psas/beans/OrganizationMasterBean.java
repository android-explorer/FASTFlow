package com.psas.beans;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import javax.faces.context.FacesContext;

import com.psas.dao.OrganizationMasterInterface;
import com.psas.daoimpl.OrganizationMasterImpl;
//import com.psas.dao.Bank2Interface;
//import com.psas.daoimpl.BankImpl;
//import com.psas.pojo.OrganizationMaster;
import com.psas.vo.OrganizationMasterVo;


@ManagedBean(name = "orgMaster", eager = true )
@RequestScoped
@ViewScoped

public class OrganizationMasterBean implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = -2480595090433199781L;
/**
	 * 
	 */
	
private String createdByName;	
private	String organizationId;
private String parentOrganization;
private String organizationTitle;
private String organizationType;
private String organizationDescription;
private String website;
private String telephone;
private String fax;
private String facebook;
private String twitter;
private String officeName;
private String officeNumber;
private String addressLine1;
private String addressLine2;
private String postalCode;
private String city;
private String state;
private String country;
private String organizationChief;
private String chiefRiskOfficer;
private String riskManager;
private String riskCordinator;
private String status;
private String riskThreshold1;
private String riskThreshold2;
private String riskThreshold3;
private String riskThreshold4;
private String riskThreshold5;
private String extraField1;
private String extraField2;

private String startingLetter;
// String startingLetter=(""+organizationTitle.charAt(0)+organizationTitle.charAt(1)+organizationTitle.charAt(2)).trim();

private  OrganizationMasterInterface orgMasterInterfObj=(OrganizationMasterInterface) new OrganizationMasterImpl();


private  List<OrganizationMasterVo> listObj;
//private  List<OrganizationMasterVo> filteredlist=new ArrayList<OrganizationMasterVo>();
//private List<String> autosuggestList;

/*public List<String> getAutosuggestList() {
	autosuggestList.add("vinod");
	return autosuggestList;
}*/


public List<OrganizationMasterVo> getListObj() {
	return listObj;
}

public void setListObj(List<OrganizationMasterVo> listObj) {
	this.listObj = listObj;
}

/*public void setAutosuggestList(List<String> autosuggestList) {
	this.autosuggestList = autosuggestList;
} */




OrganizationMasterVo organizationMasterVoObj=new OrganizationMasterVo();


/*
@PostConstruct
public void init(){
	listObj = new  ArrayList<OrganizationMasterVo>();
	//autosuggestList=new ArrayList<String>();
	try {
		listObj = orgMasterInterfObj.getstart1();
		
		System.out.println("I am init");
		
		//setFilteredlist(listObj);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
                         for (int i = 0; i < listObj.size(); i++) {
		
		                    autosuggestList.add(listObj.get(i).getOrganizationTitle());
	                                    }                                 



}   */









public String getParentOrganization() {
	return parentOrganization;
}
public void setParentOrganization(String parentOrganization) {
	this.parentOrganization = parentOrganization;
}

public String getOrganizationTitle() {
	return organizationTitle;
}
public void setOrganizationTitle(String organizationTitle) {
	this.organizationTitle = organizationTitle;
}















public String getOrganizationType() {
	return organizationType;
}
public void setOrganizationType(String organizationType) {
	this.organizationType = organizationType;
}
public String getOrganizationDescription() {
	return organizationDescription;
}
public void setOrganizationDescription(String organizationDescription) {
	this.organizationDescription = organizationDescription;
}
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public String getFax() {
	return fax;
}
public void setFax(String fax) {
	this.fax = fax;
}
public String getFacebook() {
	return facebook;
}
public void setFacebook(String facebook) {
	this.facebook = facebook;
}
public String getTwitter() {
	return twitter;
}
public void setTwitter(String twitter) {
	this.twitter = twitter;
}
public String getOfficeName() {
	return officeName;
}
public void setOfficeName(String officeName) {
	this.officeName = officeName;
}
public String getOfficeNumber() {
	return officeNumber;
}
public void setOfficeNumber(String officeNumber) {
	this.officeNumber = officeNumber;
}
public String getAddressLine1() {
	return addressLine1;
}
public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}
public String getAddressLine2() {
	return addressLine2;
}
public void setAddressLine2(String addressLine2) {
	this.addressLine2 = addressLine2;
}
public String getPostalCode() {
	return postalCode;
}
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getOrganizationChief() {
	return organizationChief;
}
public void setOrganizationChief(String organizationChief) {
	this.organizationChief = organizationChief;
}
public String getChiefRiskOfficer() {
	return chiefRiskOfficer;
}
public void setChiefRiskOfficer(String chiefRiskOfficer) {
	this.chiefRiskOfficer = chiefRiskOfficer;
}
public String getRiskManager() {
	return riskManager;
}
public void setRiskManager(String riskManager) {
	this.riskManager = riskManager;
}
public String getRiskCordinator() {
	return riskCordinator;
}
public void setRiskCordinator(String riskCordinator) {
	this.riskCordinator = riskCordinator;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getRiskThreshold1() {
	return riskThreshold1;
}
public void setRiskThreshold1(String riskThreshold1) {
	this.riskThreshold1 = riskThreshold1;
}
public String getRiskThreshold2() {
	return riskThreshold2;
}
public void setRiskThreshold2(String riskThreshold2) {
	this.riskThreshold2 = riskThreshold2;
}
public String getRiskThreshold3() {
	return riskThreshold3;
}
public void setRiskThreshold3(String riskThreshold3) {
	this.riskThreshold3 = riskThreshold3;
}
public String getRiskThreshold4() {
	return riskThreshold4;
}
public void setRiskThreshold4(String riskThreshold4) {
	this.riskThreshold4 = riskThreshold4;
}
public String getRiskThreshold5() {
	return riskThreshold5;
}
public void setRiskThreshold5(String riskThreshold5) {
	this.riskThreshold5 = riskThreshold5;
}
public String getExtraField1() {
	return extraField1;
}
public void setExtraField1(String extraField1) {
	this.extraField1 = extraField1;
}
public String getExtraField2() {
	return extraField2;
}
public void setExtraField2(String extraField2) {
	this.extraField2 = extraField2;
}


public String save() {
	FacesContext context = FacesContext.getCurrentInstance();
	context.getExternalContext().getFlash().setKeepMessages(true);
System.out.println(parentOrganization);


int result=0;



try {
	result=orgMasterInterfObj. getstart(createdByName,parentOrganization,organizationTitle,organizationType,organizationDescription,
			website,
			 telephone,
			 fax,
			 facebook,
			 twitter,
			 officeName,
			 officeNumber,
			 addressLine1,
			 addressLine2,
			postalCode,
			 city,
			 state,
			 country,
			organizationChief,
			chiefRiskOfficer,
			riskManager,
			riskCordinator,
			 status,
			 riskThreshold1,
			 riskThreshold2,
			 riskThreshold3,
			 riskThreshold4,
			 riskThreshold5,
			 extraField1,
			 extraField2, startingLetter);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

if(result==0)
{
	return "organizationMaster";
}

else if(result==1)
{
	
	
	

	organizationId=OrganizationMasterImpl.orgId;
	
	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "New organization has been registered sucessfully.Your Organization Id is "+organizationId, "PrimeFaces Rocks."));
	
	
	
	
	
	
	
	return "organizationMaster?faces-redirect=true";
}

else if(result==2)
{
	// already registered
	
	
	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "This organization is already registered.", "PrimeFaces Rocks."));
	  return "organizationMaster?faces-redirect=false";
}

else
{

	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Internal Error", "PrimeFaces Rocks."));
	 return "organizationMaster?faces-redirect=true";
}










//reset();// reseting every property by setting null in reset method..this should be the last line of the function but just before return statement
//return "organizationMaster?faces-redirect=true";

}

/*public void reload() throws IOException {
    ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
    ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
} */



public String reset()
{
	// organizationId=null;
	parentOrganization=null;
	organizationTitle=null;
	 organizationType=null;
	organizationDescription=null;
	 website=null;
	 telephone=null;
	 fax=null;;
	 facebook=null;
	 twitter=null;
	 officeName=null;
	 officeNumber=null;
	 addressLine1=null;
	addressLine2=null;
	 postalCode=null;
	city=null;
	 state=null;
	 country=null;
	 organizationChief=null;
	 chiefRiskOfficer=null;
	 riskManager=null;
	 riskCordinator=null;
	 status=null;
	 riskThreshold1=null;
	 riskThreshold2=null;
	 riskThreshold3=null;
	 riskThreshold4=null;
	 riskThreshold5=null;
	 extraField1=null;
	 extraField2=null;
	 startingLetter=null;
	 
	 return "organizationMaster?faces-redirect=true";
	
}
public String getStartingLetter() {
	return startingLetter;
}
public void setStartingLetter(String startingLetter) {
	this.startingLetter = startingLetter;
}

public String getCreatedByName() {
	return createdByName;
}

public void setCreatedByName(String createdByName) {
	this.createdByName = createdByName;
}

}
