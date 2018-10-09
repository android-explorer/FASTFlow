package com.psas.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.psas.common.HibernateUtil;
import com.psas.common.HibernateUtilH;
import com.psas.dao.InteractionMasterInterface;
import com.psas.pojo.InteractionMaster;
import com.psas.pojo.ProductMaster;
import com.psas.vo.InteractionMasterVo;
import com.psas.vo.ProductMasterVo;


public class InteractionMasterImpl implements InteractionMasterInterface {

	@Override
	public int getstart(String fieldDealerName, String fieldAgronomistName, String customerName,
			String interactionDetails) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.out.println("getstart");
		
		InteractionMaster interactionMaster=null;  
		Session session = null;
		Transaction tx2 = null;
		int result = 0;
		
		try{
			
			session = HibernateUtil.getSession();
			tx2 = session.beginTransaction(); //ExceptionLine
			
			interactionMaster=new InteractionMaster();
			
			System.out.println("interaction master starting storing data");
				
			interactionMaster.setFieldDealerName(fieldDealerName);
			interactionMaster.setFieldAgronomistName(fieldAgronomistName);
			interactionMaster.setCustomerName(customerName);
			interactionMaster.setInteractionDetails(interactionDetails);
			
			System.out.println("interaction master ended storing data");
			
				session.save(interactionMaster);
				
				System.out.println("interaction master session saved");
			
				
			result=1;
			
			
				tx2.commit();
			
			
			System.out.println("Interaction master commit successful for storing");
			
			
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
	@Override
	public List<InteractionMasterVo> getstart1() {
		// TODO Auto-generated method stub
		List<InteractionMasterVo> list = new ArrayList<InteractionMasterVo>();
		//OrganizationMaster organizationMasterObj = null;
		Session session = null;
		Transaction tx1 = null;
		//OrganizationMasterVo organizationMasterVoObj=null;
		try
		{
			session = HibernateUtil.getSession(); //exception coming at heroku
            tx1 = session.beginTransaction();
            
            System.out.println("before line 123");
			List<InteractionMaster> databaseList = (List<InteractionMaster>) session
					.createCriteria(InteractionMaster.class)					
					.list();
			 System.out.println("after line 126");
			for(InteractionMaster interactionMaster :databaseList){ //for-each loop
			
			
				InteractionMasterVo masterVo=new InteractionMasterVo();

				masterVo.setCustomerName(interactionMaster.getCustomerName());
				masterVo.setFieldAgronomistName(interactionMaster.getFieldAgronomistName());
				masterVo.setFieldDealerName(interactionMaster.getFieldDealerName());
				masterVo.setInteractionDetails(interactionMaster.getInteractionDetails());
				
				 System.out.println("before line 140");
			list.add(masterVo);
			
			 System.out.println("before line 141");
		
			
			}
			tx1.commit();
			 System.out.println("after line 146 i.e commit of retrieval");
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
