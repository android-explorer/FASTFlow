package com.psas.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;


import com.psas.dao.ProductMasterInterface;

import com.psas.daoimpl.ProductMasterImpl;

import com.psas.vo.ProductMasterVo;

@ManagedBean(name = "pmaster1", eager = true)
@RequestScoped
@ViewScoped
public class ProductMasterBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1319719578385686227L;
	
	
	
	String productType;
	String productDescription;
	String status;
	String productName;
	
	
	private  ProductMasterInterface productMasterInterface=(ProductMasterInterface) new ProductMasterImpl();
	
	
	private  List<ProductMasterVo> listObj;
	
	ProductMasterVo productmasterVo=new ProductMasterVo();
	
	
	
	@PostConstruct
	public void init(){
		listObj = new  ArrayList<ProductMasterVo>();
		//autosuggestList=new ArrayList<String>();
		try {
			listObj =  productMasterInterface.getstart1();
			
			System.out.println("I am init");
			
			//setFilteredlist(listObj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		                                



	}   


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<ProductMasterVo> getListObj() {
		return listObj;
	}
	public void setListObj(List<ProductMasterVo> listObj) {
		this.listObj = listObj;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String submit() throws Exception
	{
		
		System.out.println("producttype: "+productType);
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getFlash().setKeepMessages(true);
		int result=0;
		
		result=productMasterInterface.getstart(productType, productDescription, status,productName);
		System.out.println(result);
		if(result==1){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Your submission is successful.Your product Id is: "+ProductMasterImpl.productid2, "PrimeFaces Rocks."));
		}
		else if(result==2){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Product with same name is already registered. ", "PrimeFaces Rocks."));
		}
		else{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Internal Error.Please try after sometime. ", "PrimeFaces Rocks."));
		}
		
		  return "productMaster?faces-redirect=true";
	}
	

	public String reset()
	{
		
	
		
		productType=null;
	productDescription=null;
		 status=null;
		productName=null;
		
		  return "productMaster?faces-redirect=true";
	}
	
	
	
	
	

}
