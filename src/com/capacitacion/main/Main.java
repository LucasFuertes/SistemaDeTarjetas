package com.capacitacion.main;

import com.capacitacion.dao.CreditCard;
import com.capacitacion.dao.DebitCard;

import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {	
		
		DebitCard debit = cargarDebitCard();
		showCard(debit);
		
		in.close();
	}
	
	public static DebitCard cargarDebitCard() 
	{
		DebitCard debit = new DebitCard();
		
		System.out.println("ingrese nombre del titular");
		debit.name = in.nextLine();
		System.out.println("ingrese numero de la tarjeta");
		debit.number = in.nextLong();
		/*la siguiente linea se uso para la limpieza del buffer*/
		in.nextLine();
		System.out.println("ingrese fecha desde");
		debit.dateFrom = in.nextLine();
		System.out.println("ingrese fecha hasta");
		debit.dateTo = in.nextLine();
		System.out.println("ingrese codigo de seguridad");
		debit.security = in.nextShort();	
    	debit.credit = cargarCreditCard();
    	
    	return debit;
	}
	
	public static CreditCard cargarCreditCard() 
	{
		CreditCard credit = new CreditCard();
		
		credit.name = "pedro";
		credit.number = 1768249124467918L;
		credit.dateFrom = "12/12/12";
		credit.dateTo = "30/12/12";
		credit.security = 926;
		credit.limit = 20.000;
		
		return credit;
	}
	
	public static void showCard(DebitCard debit) 
	{
		System.out.println("Los datos de la tarjeta son los siguientes: \n" + debit.toString());
	}
}
