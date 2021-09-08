package com.capacitacion.service;

import java.util.ArrayList;

import com.capacitacion.dao.AttachedPerson;
import com.capacitacion.dao.Card;

public interface AttachedPersonService {

	public void showAttachedPerson(AttachedPerson attachedPerson);
	public ArrayList<Card> findAllCardsOfAttachedPerson(AttachedPerson attachedPerson);
	public void showAllCardsOfAttachedPerson(ArrayList<Card> cards);
}
