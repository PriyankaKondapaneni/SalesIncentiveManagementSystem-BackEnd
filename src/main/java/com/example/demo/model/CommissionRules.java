package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class CommissionRules {
	@Id
	private int Id;
	private float level1;
	private float level2;
	private float level3;
	
	
	
	public CommissionRules() {
	}
	public CommissionRules(float level1, float level2, float level3) {
		super();
		this.level1 = level1;
		this.level2 = level2;
		this.level3 = level3;
	}
	public float getLevel1() {
		return level1;
	}
	public void setLevel1(float level1) {
		this.level1 = level1;
	}
	public float getLevel2() {
		return level2;
	}
	public void setLevel2(float level2) {
		this.level2 = level2;
	}
	public float getLevel3() {
		return level3;
	}
	public void setLevel3(float level3) {
		this.level3 = level3;
	}
	
	
}
