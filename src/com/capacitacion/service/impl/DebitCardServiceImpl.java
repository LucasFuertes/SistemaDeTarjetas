package com.capacitacion.service.impl;

import java.util.ArrayList;

import com.capacitacion.dao.CreditCard;
import com.capacitacion.dao.DebitCard;
import com.capacitacion.service.DebitCardService;

public class DebitCardServiceImpl implements DebitCardService {

	@Override
	public DebitCard loadDebitCard(DebitCard debit) {
		debit.setName("MercadoPago");
		debit.setNumber(3232894834786L);
		debit.setDateFrom("10/02/02");
		debit.setDateTo("30/04/03");
		debit.setSecurity((short) 672);
		return debit;
	}

	@Override
	public DebitCard loadDebitCardWithCreditCard(DebitCard debit) {
		debit.setName("Naranja");
		debit.setNumber(7265923563493L);
		debit.setDateFrom("25/12/07");
		debit.setDateTo("07/04/09");
		debit.setSecurity((short) 190);

		CreditCard card1 = new CreditCard();
		card1.setName("Itau");
		card1.setNumber(8742368743123L);
		card1.setDateFrom("01/03/05");
		card1.setDateTo("02/04/06");
		card1.setSecurity((short) 357);
		card1.setLimit(8.392745);
		CreditCard card2 = new CreditCard("Banco Nacion", 2876345892323L, "28/06/11", "21/04/12", (short) 863, 73.700);

		ArrayList<CreditCard> credit = new ArrayList<>();
		credit.add(card1);
		credit.add(card2);

		debit.setCredit(credit);
		return debit;
	}

	@Override
	public void showDebitCard(DebitCard debit) {
		System.out.println(debit.getName() + " " + debit.getNumber() + " " + debit.getDateFrom() + " "
				+ debit.getDateTo() + " " + debit.getSecurity());
		
		if (debit.getCredit() != null) {
			for (CreditCard credit : debit.getCredit()) {
				System.out.println(credit);
			}
		}
		else 
		{
			System.out.println("No posee tarjeta/s de crédito");
		}
	}

}
