package com.capacitacion.service.impl;

import java.util.ArrayList;

import com.capacitacion.dao.AttachedPerson;
import com.capacitacion.dao.Card;
import com.capacitacion.service.AttachedPersonService;

public class AttachedPersonServiceImpl implements AttachedPersonService {

	@Override
	public void showAttachedPerson(AttachedPerson attachedPerson) {
		/* Mostrar todos los datos */
		System.out.println("Nombre: " + attachedPerson.getName() + "\nApellido: " + attachedPerson.getLastName()
				+ "\nDni: " + attachedPerson.getDni() + "\nFecha de nacimiento: " + attachedPerson.getDateOfBirth()
				+ "\nAlias: " + attachedPerson.getAlias() + "\nCVU: " + attachedPerson.getCvu());
	}

	@Override
	public ArrayList<Card> findAllCardsOfAttachedPerson(AttachedPerson attachedPerson) {

		ArrayList<Card> cards = attachedPerson.getCards();
		return cards;
	}

	@Override
	public void showAllCardsOfAttachedPerson(ArrayList<Card> cards) {

		for (Card card : cards) {
			System.out.println(card);
		}

	}

}
