package com.capacitacion.service.impl;

import com.capacitacion.dao.CreditCard;
import com.capacitacion.service.CreditCardService;

public class CreditCardServiceImpl implements CreditCardService {

	@Override
	public CreditCard loadCreditCard(CreditCard credit) {
		credit.setName("Itau");
		credit.setNumber(8742368743123L);
		credit.setDateFrom("01/03/05");
		credit.setDateTo("02/04/06");
		credit.setSecurity((short) 357);
		credit.setLimit(8.392745);
		return credit;
	}

	@Override
	public void showCreditCard(CreditCard credit) {
		System.out.println("Nombre de Banco: " + credit.getName() + "\nNumero de tarjeta: " + credit.getNumber()
				+ "\nFecha desde: " + credit.getDateFrom() + "\nFecha Hasta: " + credit.getDateTo()
				+ "\nCodigo de Seguridad: " + credit.getSecurity() + "\nLimite crediticio: " + credit.getLimit());
	}

}
