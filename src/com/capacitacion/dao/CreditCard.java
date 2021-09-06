package com.capacitacion.dao;

public class CreditCard {

	private String name;
	private Long number;
	private String dateFrom;
	private String dateTo;
	private short security;
	private Double limit;

	public CreditCard(String name, Long number, String dateFrom, String dateTo, short security, Double limit) {
		super();
		this.name = name;
		this.number = number;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.security = security;
		this.limit = limit;
	}
	
	public CreditCard() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public short getSecurity() {
		return security;
	}

	public void setSecurity(short security) {
		this.security = security;
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", number=" + number + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo
				+ ", security=" + security + ", limit=" + limit + "]";
	}

}
