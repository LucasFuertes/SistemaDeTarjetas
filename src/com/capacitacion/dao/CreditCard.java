package com.capacitacion.dao;

public class CreditCard {
	
	public String name;
	public Long number;
	public String dateFrom;
	public String dateTo;
	public short security;
	public Double limit;
	
	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", number=" + number + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo
				+ ", security=" + security + ", limit=" + limit + "]";
	}
	
	
	
}
