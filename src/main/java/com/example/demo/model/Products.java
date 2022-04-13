package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	private String productId;
	private String productName;
	private String productType;
	private String productBrand;
	private float productPrice;
	private String range;
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(String productId, String productName, String productType, String productBrand, float productPrice,
			String range) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productBrand = productBrand;
		this.productPrice = productPrice;
		this.range = range;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
}
