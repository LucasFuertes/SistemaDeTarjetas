package com.capacitacion.dao;

public class Person {

	protected Long dni;
	protected String name;
	protected String lastName;
	protected String dateOfBirth;

	public Person(Long dni, String name, String lastName, String dateOfBirth) {
		super();
		this.dni = dni;
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public Person() {
		super();
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
