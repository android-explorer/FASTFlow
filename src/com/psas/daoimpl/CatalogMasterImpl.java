package com.psas.daoimpl;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.psas.common.HibernateUtil;
import com.psas.common.HibernateUtilH;
import com.psas.dao.CatalogMasterInterface;
import com.psas.pojo.CatalogMaster;




public class CatalogMasterImpl implements CatalogMasterInterface
{

	@Override
	public int getstart(String informationType, String values, String sequenceOfDisplay, String status)
			throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		
		System.out.println("getstart");
		
		 
		Session session = null;
		Transaction tx2 = null;
		int result = 0;
		
		
		

		try{
			
			session = HibernateUtil.getSession();
			tx2 = session.beginTransaction(); //ExceptionLine
			
			CatalogMaster catalogMaster;
		// catalogMaster=new CatalogMaster();
			
			System.out.println("catalog master starting storing data");
			
			
			
			catalogMaster =   (CatalogMaster) session.createCriteria(CatalogMaster.class)
					.add(Restrictions.eq("informationtype",informationType.toLowerCase().trim()).ignoreCase())		
					.add(Restrictions.eq("sequenceofdisplay",sequenceOfDisplay.toLowerCase().trim()).ignoreCase())	
					.add(Restrictions.eq("status",status.toLowerCase().trim()).ignoreCase())	
					.add(Restrictions.eq("values",values.toLowerCase().trim()).ignoreCase())	
										.uniqueResult();
			
			
			if (catalogMaster!= null) {

				result=2;	
			}else{
				
		catalogMaster=new CatalogMaster();
			
			
			catalogMaster.setInformationType(informationType);
			catalogMaster.setValues(values);
			catalogMaster.setSequenceOfDisplay(sequenceOfDisplay);
            catalogMaster.setStatus(status);
			
			System.out.println("catalog master ended storing data");
			
				session.save(catalogMaster);
				
				System.out.println("catalog master session saved");
			
				
			result=1;
		}
			
				tx2.commit();
			
			
			System.out.println("catalog master commit successful for storing");
			
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
}
