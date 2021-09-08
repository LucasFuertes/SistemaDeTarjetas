package com.capacitacion.dao;

import java.util.ArrayList;

public class AttachedPerson extends Person {

	/*
	 * para crear un sistema mas complejo se podria haber creado una nueva entidad
	 * llamada Cuenta que tenga el CVU y alias, pero para simplificar un poco las
	 * cosas opte por agregarlas directamente a una persona adherida
	 */
	private Long cvu;
	private String alias;
	private ArrayList<Card> cards;

	public AttachedPerson(Long dni, String name, String lastName, String dateOfBirth, Long cvu, String alias,
			ArrayList<Card> cards) {
		super(dni, name, lastName, dateOfBirth);
		this.cvu = cvu;
		this.alias = alias;
		this.cards = cards;
	}

	public AttachedPerson() {
		super();
	}

	public Long getCvu() {
		return cvu;
	}

	public void setCvu(Long cvu) {
		this.cvu = cvu;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

}
