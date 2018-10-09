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
import com.psas.dao.ProductMasterInterface;

import com.psas.pojo.ProductMaster;

import com.psas.vo.ProductMasterVo;

public class ProductMasterImpl implements ProductMasterInterface{

public	static String  productid2;
	
	@Override
	public int getstart(String productType, String productDescription, String status,String productName) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		String customerId="Col123456";
		
		
		ProductMaster productmaster=null;
		Session session = null;
		Transaction tx2 = null;
		int result = 0;
		try{
		session = HibernateUtil.getSession();
		tx2 = session.beginTransaction(); 
		
		System.out.println("before line 43");
		productmaster =    (ProductMaster) session.createCriteria(ProductMaster.class)
				.add(Restrictions.eq("productName",productName.toLowerCase().trim()).ignoreCase())				
									.uniqueResult();
		System.out.println("after line 43");
		if(productmaster==null)
		{
		
		productmaster=new ProductMaster();
		
		
		System.out.println("before line 54");
		Criteria criteria = session
			    .createCriteria(ProductMaster.class)
			    .setProjection(Projections.max("productId"));
		Integer productId =   (Integer) criteria.uniqueResult();
			
		System.out.println("after line 58");
			
			if(productId==null)
				productId=145791;
			else
				productId++;
			System.out.println("after line 65");
		
		productmaster.setProductId(productId);
		productmaster.setCustomerId(customerId);
		productmaster.setProductId(productId);
		productmaster.setProductDescription(productDescription);
		productmaster.setProductType(productType);
		productmaster.setStatus(status);
		productmaster.setProductName(productName);
		
		session.save(productmaster);
		productid2=productId.toString();
	result=1;
		}
		
		else
		{
			result=2;
		}
		
		
		tx2.commit();
		System.out.println("after line 86 i.e after commit");
		
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
	public List<ProductMasterVo> getstart1() throws Exception {
		// TODO Auto-generated method stub
		List<ProductMasterVo> list = new ArrayList<ProductMasterVo>();
		//OrganizationMaster organizationMasterObj = null;
		Session session = null;
		Transaction tx1 = null;
		//OrganizationMasterVo organizationMasterVoObj=null;
		try
		{
			session = HibernateUtil.getSession(); //exception coming at heroku
            tx1 = session.beginTransaction();
            
            System.out.println("before line 123");
			List<ProductMaster> databaseList = (List<ProductMaster>) session
					.createCriteria(ProductMaster.class)					
					.list();
			 System.out.println("after line 126");
			for(ProductMaster productMaster :databaseList){ //for-each loop
			
			
				ProductMasterVo masterVo=new ProductMasterVo();

				masterVo.setCustomerId(productMaster.getCustomerId());	
				masterVo.setProductDescription(productMaster.getProductDescription());
				masterVo.setProductName(productMaster.getProductName());
				masterVo.setProductId(productMaster.getProductId());
				masterVo.setProductType(productMaster.getProductType());
				masterVo.setStatus(productMaster.getStatus());
				
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
