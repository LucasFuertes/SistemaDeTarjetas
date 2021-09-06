package com.capacitacion.dao;

public class DebitCard {
	
	public String name;
	public long number;
	public String dateFrom;
	public String dateTo;
	public short security;
	public CreditCard credit;
	@Override
	public String toString() {
		return "DebitCard: Name=" + name + ", Number=" + number + ", Date From=" + dateFrom + ", Date To=" + dateTo
				+ ", Security=" + security + ", Credit=" + credit;
	}
	
	
	
}
