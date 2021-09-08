package com.capacitacion.service.impl;

import com.capacitacion.dao.Card;
import com.capacitacion.service.CardService;

public class CardServiceImpl implements CardService{

	@Override
	public void showName(Card card) {
		System.out.println(card.getName());
	}

	@Override
	public void showDates(Card card) {
		System.out.println(card.getDateFrom() + "\n" + card.getDateTo());
	}

	@Override
	public void showDataCard(Card card) {
		System.out.println("Nombre: " + card.getName() + "\nNumero de tarjeta: " + card.getNumber() + "\nFecha desde: "
				+ card.getDateFrom() + "\nFecha hasta: " + card.getDateTo() + "\nCodigo de seguridad: " + card.getSecurity());
	}
	
	
}
