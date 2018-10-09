package com.psas.daoimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.psas.common.HibernateUtil;
//import com.psas.common.HibernateUtil;
import com.psas.common.HibernateUtilH;

import com.psas.dao.OrganizationMasterInterface;

import com.psas.pojo.OrganizationMaster;
import com.psas.vo.OrganizationMasterVo;

public class OrganizationMasterImpl implements OrganizationMasterInterface {
	
	private String organizationId;
	
	public static String orgId;
	
	@Override
	public int getstart(String createdByName, String parentOrganization, String organizationTitle,
			String organizationType, String organizationDescription, String website, String telephone, String fax,
			String facebook, String twitter, String officeName, String officeNumber, String addressLine1,
			String addressLine2, String postalCode, String city, String state, String country, String organizationChief,
			String chiefRiskOfficer, String riskManager, String riskCordinator, String status, String riskThreshold1,
			String riskThreshold2, String riskThreshold3, String riskThreshold4, String riskThreshold5,
			String extraField1, String extraField2, String startingLetter) throws Exception { 
		// TODO Auto-generated method stub
		
		
		
		
		 String createdBy=null;
         Date createdOn=new Date();
		 String lastUpdatedBy=null;
		 Date lastUpdatedOn=new Date();
		
		OrganizationMaster orgMasterObj = null;
		Session session = null;
		Transaction tx2 = null;
		int result = 0;
		
		try{
			
			session = HibernateUtil.getSession();
			tx2 = session.beginTransaction(); //ExceptionLine
			
			orgMasterObj =   (OrganizationMaster) session.createCriteria(OrganizationMaster.class)
					.add(Restrictions.eq("organizationTitle",organizationTitle.toLowerCase().trim()).ignoreCase())				
										.uniqueResult();
			
			if (orgMasterObj != null) {

				result=2;	
			}else{
				
				orgMasterObj=new OrganizationMaster();
				
				
				startingLetter=(""+(organizationTitle).charAt(0)+(organizationTitle).charAt(1)+(organizationTitle).charAt(2)).trim();
				
				Criteria criteria = session
					    .createCriteria(OrganizationMaster.class)
					    .setProjection(Projections.max("autoSequenceId"));
					Integer autoSequenceId =  (Integer) criteria.uniqueResult();
				
					
					if(autoSequenceId==null)
						autoSequenceId=1020;
					else
						autoSequenceId++;
					
					
					
					
				organizationId=startingLetter+autoSequenceId;
				
				
				
			orgMasterObj.setOrganizationId(organizationId);	 
			orgMasterObj.setParentOrganization(parentOrganization);
			orgMasterObj.setorganizationTitle(organizationTitle);
			orgMasterObj.setOrganizationType(organizationType);
			orgMasterObj.setOrganizationDescription(organizationDescription);
			orgMasterObj.setWebsite(website);
			orgMasterObj.setTelephone(telephone);
			orgMasterObj.setFax(fax);
			orgMasterObj.setFacebook(facebook);
			orgMasterObj.setTwitter(twitter);
			orgMasterObj.setOfficeName(officeName);
			orgMasterObj.setOfficeNumber(officeNumber);
			orgMasterObj.setAddressLine1(addressLine1);
			orgMasterObj.setAddressLine2(addressLine2);
			orgMasterObj.setPostalCode(postalCode);
			orgMasterObj.setCity(city);
			orgMasterObj.setState(state);
			orgMasterObj.setCountry(country);
			orgMasterObj.setOrganizationChief(organizationChief);
			orgMasterObj.setChiefRiskOfficer(chiefRiskOfficer);
			orgMasterObj.setRiskManager(riskManager);
			orgMasterObj.setRiskCordinator(riskCordinator);
			orgMasterObj.setStatus(status);
			orgMasterObj.setRiskThreshold1(riskThreshold1);
			orgMasterObj.setRiskThreshold2(riskThreshold2);
			orgMasterObj.setRiskThreshold3(riskThreshold3);
			orgMasterObj.setRiskThreshold4(riskThreshold4);
			orgMasterObj.setRiskThreshold5(riskThreshold5);
			orgMasterObj.setExtraField1(extraField1);
			orgMasterObj.setExtrafield2(extraField2);
			orgMasterObj.setStartingLetter(startingLetter);
			orgMasterObj.setCreatedOn(createdOn);
			orgMasterObj.setCreatedBy(createdBy);
			orgMasterObj.setLastUpdatedBy(lastUpdatedBy);
			orgMasterObj.setLastUpdatedOn(lastUpdatedOn);
			
			orgMasterObj.setAutoSequenceId(autoSequenceId);
			
			
			
				session.save(orgMasterObj);
				
				
				orgId=organizationId;
				
			result=1;
			}
			
				tx2.commit();
			
			
			
			
			
		}catch(Exception e){
			if(tx2 != null)
			{
				tx2.rollback();
				System.out.println("rolled back");
			}

			e.printStackTrace();
			throw new Exception(e);
		} finally {
			if (session != null)
				session.close();
		}
		
		
		return result;
	
	}


























	@SuppressWarnings("unchecked")
	public List<OrganizationMasterVo> getstart1() throws Exception {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub
		
		List<OrganizationMasterVo> list = new ArrayList<OrganizationMasterVo>();
		//OrganizationMaster organizationMasterObj = null;
		Session session = null;
		Transaction tx1 = null;
		//OrganizationMasterVo organizationMasterVoObj=null;
		try
		{
			session = HibernateUtil.getSession(); //exception coming at heroku
            tx1 = session.beginTransaction();
            
			List<OrganizationMaster> databaseList = (List<OrganizationMaster>) session
					.createCriteria(OrganizationMaster.class)					
					.list();
           
			for(OrganizationMaster orgMaster :databaseList){ //for-each loop
			
			
				OrganizationMasterVo organizationMasterVo= new OrganizationMasterVo();
			
					
				organizationMasterVo.setOrganizationId(orgMaster.getOrganizationId());
				organizationMasterVo.setParentOrganization(orgMaster.getParentOrganization());
				organizationMasterVo.setOrganizationTitle(orgMaster.getorganizationTitle());
				organizationMasterVo.setOrganizationType(orgMaster.getOrganizationType());
				organizationMasterVo.setOrganizationDescription(orgMaster.getOrganizationDescription());
				organizationMasterVo.setWebsite(orgMaster.getWebsite());
				organizationMasterVo.setTelephone(orgMaster.getTelephone());
				organizationMasterVo.setFax(orgMaster.getFax());
				organizationMasterVo.setFacebook(orgMaster.getFacebook());
				organizationMasterVo.setTwitter(orgMaster.getTwitter());
				organizationMasterVo.setOfficeName(orgMaster.getOfficeName());
				organizationMasterVo.setOfficeNumber(orgMaster.getOfficeNumber());
				organizationMasterVo.setAddressLine1(orgMaster.getAddressLine1());
				organizationMasterVo.setAddressLine2(orgMaster.getAddressLine2());
				//many more fields are left to write here
				
				
				
			list.add(organizationMasterVo);
			
			
		
			
			}
			tx1.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
        	if(session != null)
            session.close();
	    }

		return list;
	
	}
	




















	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
}
