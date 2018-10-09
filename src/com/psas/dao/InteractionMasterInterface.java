package com.psas.dao;

import java.util.List;

import com.psas.vo.InteractionMasterVo;

public interface InteractionMasterInterface {

	
	public int getstart(String fieldDealerName,String fieldArgonomistName,
			String customerName,String interactionDetails)throws Exception;

	public List<InteractionMasterVo> getstart1();
	
	
	
	
	
	
	
	
	
}
