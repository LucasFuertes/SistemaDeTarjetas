package com.capacitacion.service;

import com.capacitacion.dao.DebitCard;

public interface DebitCardService {
	
	public DebitCard loadDebitCard(DebitCard debit);
	public DebitCard loadDebitCardWithCreditCard(DebitCard debit);
	public void showDebitCard(DebitCard debit);
}
