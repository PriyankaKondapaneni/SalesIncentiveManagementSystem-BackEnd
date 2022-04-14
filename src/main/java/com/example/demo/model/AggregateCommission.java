package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AggregateCommission implements Serializable {
	@Id
	private String salesPersonId;
	private String month;
	private float commission;
	public AggregateCommission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AggregateCommission(String salesPersonId, String month, float commission) {
		super();
		this.salesPersonId = salesPersonId;
		this.month = month;
		this.commission = commission;
	}
	public String getSalesPersonId() {
		return salesPersonId;
	}
	public void setSalesPersonId(String salesPersonId) {
		this.salesPersonId = salesPersonId;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public float getCommission() {
		return commission;
	}
	public void setCommission(float commission) {
		this.commission = commission;
	}

}
