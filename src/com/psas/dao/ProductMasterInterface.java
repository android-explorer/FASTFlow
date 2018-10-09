package com.psas.dao;

import java.util.List;

import com.psas.vo.ProductMasterVo;

public interface ProductMasterInterface {

	
	public int getstart(String productType,String productDescription,String status,String productName)throws Exception;

	

	public List<ProductMasterVo> getstart1() throws Exception;
	
	
	
	
	
}
