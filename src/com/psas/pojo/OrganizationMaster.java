package com.psas.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "organizationmaster", uniqueConstraints = @UniqueConstraint(columnNames = "organizationTitle"))
public class OrganizationMaster implements java.io.Serializable {
	
	/**
	 * //, uniqueConstraints = @UniqueConstraint(columnNames = "organizationTitle")
	 */
	private static final long serialVersionUID = 3562699233305652366L;
	
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
	private String extrafield2;
	private String startingLetter;
	private int backendDatabaseId;
	private String createdBy;
	private String lastUpdatedBy;
	private Date createdOn;
	private Date lastUpdatedOn;
	private int autoSequenceId;
	
	
	
	@Column(name = "autoSequenceId",  length = 50)
	public int getAutoSequenceId() {
		return autoSequenceId;
	}


	public void setAutoSequenceId(int autoSequenceId) {
		this.autoSequenceId = autoSequenceId;
	}

	@Column(name = "startingLetter",  length = 50)
	public String getStartingLetter() {
		return startingLetter;
	}


	public void setStartingLetter(String startingLetter) {
		this.startingLetter = startingLetter;
	}


	
	
	public OrganizationMaster() {
		
		// TODO Auto-generated constructor stub
	}

	
/*	public OrganizationMaster(int organizationId) {
		
		// TODO Auto-generated constructor stub
	}*/

	
	public OrganizationMaster(String organizationId, String parentOrganization,  String organizationTitle,
			String organizationType, String organizationDescription, String website, String telephone, String fax,
			String facebook, String twitter, String officeName, String officeNumber, String addressLine1,
			String addressLine2, String postalCode, String city, String state, String country, String organizationChief,
			String chiefRiskOfficer, String riskManager, String riskCordinator, String status, String riskThreshold1,
			String riskThreshold2, String riskThreshold3, String riskThreshold4, String riskThreshold5,
			String extraField1, String extrafield2) {
		
		this.organizationId = organizationId;
		this.parentOrganization = parentOrganization;
	
		this.organizationTitle = organizationTitle;
		this.organizationType = organizationType;
		this.organizationDescription = organizationDescription;
		this.website = website;
		this.telephone = telephone;
		this.fax = fax;
		this.facebook = facebook;
		this.twitter = twitter;
		this.officeName = officeName;
		this.officeNumber = officeNumber;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.postalCode = postalCode;
		this.city = city;
		this.state = state;
		this.country = country;
		this.organizationChief = organizationChief;
		this.chiefRiskOfficer = chiefRiskOfficer;
		this.riskManager = riskManager;
		this.riskCordinator = riskCordinator;
		this.status = status;
		this.riskThreshold1 = riskThreshold1;
		this.riskThreshold2 = riskThreshold2;
		this.riskThreshold3 = riskThreshold3;
		this.riskThreshold4 = riskThreshold4;
		this.riskThreshold5 = riskThreshold5;
		this.extraField1 = extraField1;
		this.extrafield2 = extrafield2;
	}
	
	
	
	
	
	


	@Column(name = "organizationId",  length = 50)
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	
	@Column(name = "parentOrganization",  length = 50)
	public String getParentOrganization() {
		return parentOrganization;
	}
	public void setParentOrganization(String parentOrganization) {
		this.parentOrganization = parentOrganization;
	}
	
	@Column(name = "organizationTitle",  length = 50)
	public String getorganizationTitle() {
		return organizationTitle;
	}
	public void setorganizationTitle(String organizationTitle) {
		this.organizationTitle = organizationTitle;
	}
	
	
	@Column(name = "organizationType",  length = 50)
	public String getOrganizationType() {
		return organizationType;
	}
	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}
	
	@Column(name = "organizationDescription",  length = 50)
	public String getOrganizationDescription() {
		return organizationDescription;
	}
	public void setOrganizationDescription(String organizationDescription) {
		this.organizationDescription = organizationDescription;
	}
	
	@Column(name = "website",  length = 50)
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	@Column(name = "telephone",  length = 50)
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Column(name = "fax",  length = 50)
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	@Column(name = "facebook",  length = 50)
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	
	@Column(name = "twitter",  length = 50)
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	
	@Column(name = "officeName",  length = 50)
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	
	@Column(name = "officeNumber",  length = 50)
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	
	@Column(name = "addressLine1",  length = 50)
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	@Column(name = "addressLine2",  length = 50)
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	
	@Column(name = "postalCode",  length = 50)
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	@Column(name = "city",  length = 50)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "state",  length = 50)
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Column(name = "country",  length = 50)
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Column(name = "organizationChief",  length = 50)
	public String getOrganizationChief() {
		return organizationChief;
	}
	public void setOrganizationChief(String organizationChief) {
		this.organizationChief = organizationChief;
	}
	
	@Column(name = "chiefRiskOfficer",  length = 50)
	public String getChiefRiskOfficer() {
		return chiefRiskOfficer;
	}
	public void setChiefRiskOfficer(String chiefRiskOfficer) {
		this.chiefRiskOfficer = chiefRiskOfficer;
	}
	
	@Column(name = "riskManager",  length = 50)
	public String getRiskManager() {
		return riskManager;
	}
	public void setRiskManager(String riskManager) {
		this.riskManager = riskManager;
	}
	
	@Column(name = "riskCordinator",  length = 50)
	public String getRiskCordinator() {
		return riskCordinator;
	}
	public void setRiskCordinator(String riskCordinator) {
		this.riskCordinator = riskCordinator;
	}
	
	@Column(name = "status",  length = 50)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Column(name = "riskThreshold1",  length = 50)
	public String getRiskThreshold1() {
		return riskThreshold1;
	}
	public void setRiskThreshold1(String riskThreshold1) {
		this.riskThreshold1 = riskThreshold1;
	}
	
	@Column(name = "riskThreshold2",  length = 50)
	public String getRiskThreshold2() {
		return riskThreshold2;
	}
	public void setRiskThreshold2(String riskThreshold2) {
		this.riskThreshold2 = riskThreshold2;
	}
	
	@Column(name = "riskThreshold3",  length = 50)
	public String getRiskThreshold3() {
		return riskThreshold3;
	}
	public void setRiskThreshold3(String riskThreshold3) {
		this.riskThreshold3 = riskThreshold3;
	}
	
	@Column(name = "riskThreshold4",  length = 50)
	public String getRiskThreshold4() {
		return riskThreshold4;
	}
	public void setRiskThreshold4(String riskThreshold4) {
		this.riskThreshold4 = riskThreshold4;
	}
	
	@Column(name = "riskThreshold5",  length = 50)
	public String getRiskThreshold5() {
		return riskThreshold5;
	}
	public void setRiskThreshold5(String riskThreshold5) {
		this.riskThreshold5 = riskThreshold5;
	}
	
	@Column(name = "extraField1",  length = 50)
	public String getExtraField1() {
		return extraField1;
	}
	public void setExtraField1(String extraField1) {
		this.extraField1 = extraField1;
	}
	
	@Column(name = "extraField2",  length = 50)
	public String getExtrafield2() {
		return extrafield2;
	}
	public void setExtrafield2(String extrafield2) {
		this.extrafield2 = extrafield2;
	}

	@Column(name = "createdBy",  length = 50)
	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "lastUpdatedBy",  length = 50)
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}


	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Column(name = "createdOn",  length = 50)
	public Date getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "lastUpdateOn",  length = 50)
	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}


	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "backendDatabaseId", unique = true, nullable = false)
	public int getBackendDatabaseId() {
		return backendDatabaseId;
	}


	public void setBackendDatabaseId(int backendDatabaseId) {
		this.backendDatabaseId = backendDatabaseId;
	}


	public String getCreatedByName() {
		return createdByName;
	}


	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	@Column(name = "lastUpdateOn",  length = 50)
	public String getOrganizationTitle() {
		return organizationTitle;
	}


	public void setOrganizationTitle(String organizationTitle) {
		this.organizationTitle = organizationTitle;
	}
	
	
	
	
	
	
	

}
