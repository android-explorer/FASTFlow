package com.psas.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "interactionmaster")
public class InteractionMaster {

	//, uniqueConstraints = @UniqueConstraint(columnNames = "productName")
	
	private String fieldDealerName;
	private String fieldAgronomistName;
	private String customerName;
	private String interactionDetails;
	private int backendPrimaryKey;
	
	public InteractionMaster()
	{
		
	}
	
	public InteractionMaster( String fieldDealerName,
 String fieldAgronomistName, String customerName,String interactionDetails)
	{
		this.fieldDealerName=fieldDealerName;
		this.fieldAgronomistName=fieldAgronomistName;
		this.customerName=customerName;
		this.interactionDetails=interactionDetails;
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

	@Column(name = "fieldDealerName",  length = 50)
	public String getFieldDealerName() {
		return fieldDealerName;
	}

	public void setFieldDealerName(String fieldDealerName) {
		this.fieldDealerName = fieldDealerName;
	}

	@Column(name = "fieldAgronomistName",  length = 50)
	public String getFieldAgronomistName() {
		return fieldAgronomistName;
	}

	public void setFieldAgronomistName(String fieldAgronomistName) {
		this.fieldAgronomistName = fieldAgronomistName;
	}

	@Column(name = "customerName",  length = 50)
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Column(name = "interactionDetails",  length = 50)
	public String getInteractionDetails() {
		return interactionDetails;
	}

	public void setInteractionDetails(String interactionDetails) {
		this.interactionDetails = interactionDetails;
	}
	
	
	
	
	
	
	
}
