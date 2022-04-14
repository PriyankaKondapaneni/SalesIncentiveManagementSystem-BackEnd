package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name="directSalesPerson")
public class SalesPerson {

	@Id
	private String salesPersonId;
	private String password;
	private String name;
	private String role;
	private String location;
	private int quota;
	private String reportingId;
	private int level;
	private int twoWheelerSold;
	private int threeWheelerSold;
	private int fourWheelerSold;
	private int commercialSold;
	private int totalSales;
	private float uptoDateCommission;
	
//	@OneToOne(mappedBy = "salesPersonId")
//	private SalesLine salesLine;
	
	
	
	
	public SalesPerson(String salesPersonId, String password, String name, String role, String location,
			int quota, String reportingId, int level, int twoWheelerSold, int threeWheelerSold, int fourWheelerSold,
			int commercialSold, int totalSales, float uptoDateCommission) {
		super();
		this.salesPersonId = salesPersonId;
		this.password = password;
		this.name = name;
		this.role = role;
		this.location = location;
		this.quota = quota;
		this.reportingId = reportingId;
		this.level = level;
		this.twoWheelerSold = twoWheelerSold;
		this.threeWheelerSold = threeWheelerSold;
		this.fourWheelerSold = fourWheelerSold;
		this.commercialSold = commercialSold;
		this.totalSales = totalSales;
		this.uptoDateCommission = uptoDateCommission;

	}
	public SalesPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
//	public SalesLine getSalesLine() {
//		return salesLine;
//	}
//	public void setSalesLine(SalesLine salesLine) {
//		this.salesLine = salesLine;
//	}
	public String getSalesPersonId() {
		return salesPersonId;
	}
	public void setSalesPersonId(String salesPersonId) {
		this.salesPersonId = salesPersonId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getQuota() {
		return quota;
	}
	public void setQuota(int quota) {
		this.quota = quota;
	}
	public String getReportingId() {
		return reportingId;
	}
	public void setReportingId(String reportingId) {
		this.reportingId = reportingId;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getTwoWheelerSold() {
		return twoWheelerSold;
	}
	public void setTwoWheelerSold(int twoWheelerSold) {
		this.twoWheelerSold = twoWheelerSold;
	}
	public int getThreeWheelerSold() {
		return threeWheelerSold;
	}
	public void setThreeWheelerSold(int threeWheelerSold) {
		this.threeWheelerSold = threeWheelerSold;
	}
	public int getFourWheelerSold() {
		return fourWheelerSold;
	}
	public void setFourWheelerSold(int fourWheelerSold) {
		this.fourWheelerSold = fourWheelerSold;
	}
	public int getCommercialSold() {
		return commercialSold;
	}
	public void setCommercialSold(int commercialSold) {
		this.commercialSold = commercialSold;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	public float getUptoDateCommission() {
		return uptoDateCommission;
	}
	public void setUptoDateCommission(float uptoDateCommission) {
		this.uptoDateCommission = uptoDateCommission;
	}
	
	
}
