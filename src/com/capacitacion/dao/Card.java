package com.capacitacion.dao;

public class Card {

	protected String name;
	protected Long number;
	protected String dateFrom;
	protected String dateTo;
	protected short security;

	public Card(String name, Long number, String dateFrom, String dateTo, short security) {
		super();
		this.name = name;
		this.number = number;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.security = security;
	}

	public Card() {
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

}
