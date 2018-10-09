package com.psas.pojo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CatalogMaster")

public class CatalogMaster {
	
	private String informationType;	
	private	String values;
	private String sequenceOfDisplay;
	private String status;
	private String backendId;
	
	
	
	public CatalogMaster()
	{
		
	}
	
	
	public CatalogMaster(String informationType, String values, String sequenceOfDisplay,String status  )
	{
		this.informationType=informationType;
		this.values=values;
		this.sequenceOfDisplay=sequenceOfDisplay;
		this.status=status;
	}

	@Column(name = "informationType",  length = 50)
	public String getInformationType() {
		return informationType;
	}


	public void setInformationType(String informationType) {
		this.informationType = informationType;
	}

	@Column(name = "values",  length = 50)
	public String getValues() {
		return values;
	}


	public void setValues(String values) {
		this.values = values;
	}

	@Column(name = "sequenceOfDisplay",  length = 50)
	public String getSequenceOfDisplay() {
		return sequenceOfDisplay;
	}


	public void setSequenceOfDisplay(String sequenceOfDisplay) {
		this.sequenceOfDisplay = sequenceOfDisplay;
	}

	@Column(name = "status",  length = 50)
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "backendId", unique = true, nullable = false)
	public String getBackendId() {
		return backendId;
	}


	public void setBackendId(String backendId) {
		this.backendId = backendId;
	}
	
	
	
	
	
	
	

}
