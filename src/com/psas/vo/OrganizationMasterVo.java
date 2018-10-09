package com.psas.vo;

import java.util.Date;

public class OrganizationMasterVo {

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
	private String extrafield2;
	private String startingLetter;
	private String createdBy;
	private String lastUpdatedBy;
	private Date createdOn;
	private Date lastUpdatedOn;
	
	private int autoSequenceId;
	public int getAutoSequenceId() {
		return autoSequenceId;
	}
	public void setAutoSequenceId(int autoSequenceId) {
		this.autoSequenceId = autoSequenceId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}
	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private int backendDatabaseId;
	public int getBackendDatabaseId() {
		return backendDatabaseId;
	}
	public void setBackendDatabaseId(int backendDatabaseId) {
		this.backendDatabaseId = backendDatabaseId;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
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
	public String getExtrafield2() {
		return extrafield2;
	}
	public void setExtrafield2(String extrafield2) {
		this.extrafield2 = extrafield2;
	}
	public String getStartingLetter() {
		return startingLetter;
	}
	public void setStartingLetter(String startingLetter) {
		this.startingLetter = startingLetter;
	}
	
	
}
