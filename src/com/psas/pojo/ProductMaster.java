package com.psas.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "productmaster", uniqueConstraints = @UniqueConstraint(columnNames = "productName"))
public class ProductMaster {
private Integer productId;
private String customerId;
private String productType;
private String productDescription;
private String status;
private String productName;
private int backendPrimaryKey;



public ProductMaster()
{
	
}

public ProductMaster(int productId,String customerId,String productType,
		String productDescription,String status, String productName)
{
	this.productId=productId;
	this.customerId=customerId;
	this.productType=productType;
	this.productDescription=productDescription;
	this.status=status;
	this.productName=productName;
}












@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "backendPrimaryKey", unique = true, nullable = false)
public int getBackendPrimaryKey() {
	return backendPrimaryKey;
}

public void setBackendPrimaryKey(int backendPrimaryKey) {
	this.backendPrimaryKey = backendPrimaryKey;
}

@Column(name = "productId",  length = 50)
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}

@Column(name = "customerId",  length = 50)
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}

@Column(name = "productType",  length = 50)
public String getProductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}

@Column(name = "productDescription",  length = 50)
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}

@Column(name = "status",  length = 50)
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

@Column(name = "productName",  length = 50)
public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

	
	
	
	












	
}
