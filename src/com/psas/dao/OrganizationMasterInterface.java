package com.psas.dao;

import java.util.List;


import com.psas.vo.OrganizationMasterVo;

public interface OrganizationMasterInterface {
	

		public int getstart(
		 String	createdByName,
		 String parentOrganization,
		 String organizationTitle,
		String organizationType,
		String organizationDescription,
	    String website,
	    String telephone,
		String fax,
		String facebook,
		String twitter,
		String officeName,
		String officeNumber,
		String addressLine1,
		String addressLine2,
		String postalCode,
		String city,
		String state,
		String country,
		String organizationChief,
		String chiefRiskOfficer,
		String riskManager,
		String riskCordinator,
		String status,
		String riskThreshold1,
		String riskThreshold2,
		String riskThreshold3,
		String riskThreshold4,
		String riskThreshold5,
		String extraField1,
		String extraField2, String startingLetter)throws Exception;
		
		
		
		
		//List<OrganizationMasterVo> getstart1() throws Exception;




		
}
