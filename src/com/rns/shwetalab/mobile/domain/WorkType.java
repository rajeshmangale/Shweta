package com.rns.shwetalab.mobile.domain;

import java.math.BigDecimal;

public class WorkType {
	
	private Integer id;
	private String name;
	private BigDecimal defaultPrice;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getDefaultPrice() {
		return defaultPrice;
	}
	public void setDefaultPrice(BigDecimal defaultPrice) {
		this.defaultPrice = defaultPrice;
	}
		
}
