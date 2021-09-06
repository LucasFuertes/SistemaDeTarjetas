package com.capacitacion.main;

import com.capacitacion.dao.CreditCard;
import com.capacitacion.dao.DebitCard;

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		DebitCard debit = cargarDebitCard();
		DebitCard debit2 = new DebitCard("Sara", 182346142L, "02/04/06", "04/06/08", (short) 723, cargarCreditCard());
		showCard(debit);
		showCard(debit2);

		in.close();
	}

	public static DebitCard cargarDebitCard() {
		DebitCard debit = new DebitCard();

		System.out.println("ingrese nombre del titular");
		debit.setName(in.nextLine());
		System.out.println("ingrese numero de la tarjeta");
		debit.setNumber(in.nextLong());
		/* la siguiente linea se uso para la limpieza del buffer */
		in.nextLine();
		System.out.println("ingrese fecha desde");
		debit.setDateFrom(in.nextLine());
		System.out.println("ingrese fecha hasta");
		debit.setDateTo(in.nextLine());
		System.out.println("ingrese codigo de seguridad");
		debit.setSecurity(in.nextShort());
		debit.setCredit(cargarCreditCard());

		return debit;
	}

	public static CreditCard cargarCreditCard() {
		CreditCard credit = new CreditCard("pedro", 1768249124467918L, "12/12/12", "30/12/12", (short) 352, 20.000);
//		credit.setName("pedro");
//		credit.setNumber(1768249124467918L);		
//		credit.setDateFrom("12/12/12");
//		credit.setDateTo("30/12/12");
//		credit.setSecurity((short) 352);
//		credit.setLimit(20.000);

		return credit;
	}

	public static void showCard(DebitCard debit) {
		System.out.println("Los datos de la tarjeta son los siguientes: \n" + debit.toString());
	}
}
