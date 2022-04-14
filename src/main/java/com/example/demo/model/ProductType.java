package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductType {
	@Id
	private int id;
	private String twowheeler;
	private String threewheeler;
	private String fourwheeler;
	private String commrcial;
	public ProductType(int id, String twowheeler, String threewheeler, String fourwheeler, String commrcial) {
		super();
		this.id = id;
		this.twowheeler = twowheeler;
		this.threewheeler = threewheeler;
		this.fourwheeler = fourwheeler;
		this.commrcial = commrcial;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTwowheeler() {
		return twowheeler;
	}
	public void setTwowheeler(String twowheeler) {
		this.twowheeler = twowheeler;
	}
	public String getThreewheeler() {
		return threewheeler;
	}
	public void setThreewheeler(String threewheeler) {
		this.threewheeler = threewheeler;
	}
	public String getFourwheeler() {
		return fourwheeler;
	}
	public void setFourwheeler(String fourwheeler) {
		this.fourwheeler = fourwheeler;
	}
	public String getCommrcial() {
		return commrcial;
	}
	public void setCommrcial(String commrcial) {
		this.commrcial = commrcial;
	}
}
