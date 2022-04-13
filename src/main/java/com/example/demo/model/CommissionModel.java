package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CommissionModel {
	@Id
	private String range;
	private int commission;
	
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public CommissionModel(String range, int commission) {
		this.range = range;
		this.commission = commission;
	}
	public CommissionModel() {
	}
	
	
	
}
