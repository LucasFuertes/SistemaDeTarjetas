package com.capacitacion.dao;

import java.util.ArrayList;

public class DebitCard extends Card{

	private ArrayList<CreditCard> credit;

	public DebitCard(String name, long number, String dateFrom, String dateTo, short security,
			ArrayList<CreditCard> credit) {
		super();
		this.name = name;
		this.number = number;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.security = security;
		this.credit = credit;
	}

	public DebitCard() {
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

	public ArrayList<CreditCard> getCredit() {
		return credit;
	}

	public void setCredit(ArrayList<CreditCard> credit) {
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "DebitCard [name=" + name + ", number=" + number + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo
				+ ", security=" + security + ", credit=" + credit + "]";
	}

}
