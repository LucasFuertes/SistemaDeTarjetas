package com.capacitacion.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.capacitacion.dao.AttachedPerson;
import com.capacitacion.dao.Card;
import com.capacitacion.dao.CreditCard;
import com.capacitacion.dao.DebitCard;
import com.capacitacion.dao.Person;
import com.capacitacion.service.impl.AttachedPersonServiceImpl;

public class Main {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		/* PROBANDO LOS METODOS DE LA CLASE SERVICIO PersonaServiceImpl */
//		Person person = loadPersonHardcode();
//		
//		PersonaServiceImpl personaServiceImpl = new PersonaServiceImpl();
//		personaServiceImpl.showNamePerson(person);
//		personaServiceImpl.showDataPerson(person);
//		/* Fin de la prueba, todo bien */
//
//		/* PROBANDO LOS METODOS DE LA CLASE SERVICIO CardServiceImpl */
//		Card card = loadCardHarcode();
//		CardServiceImpl cardServiceImpl = new CardServiceImpl();
//		cardServiceImpl.showDataCard(card);
//		System.out.println("");
//		cardServiceImpl.showDates(card);
//		System.out.println("");
//		cardServiceImpl.showName(card);
//		/* Fin de la prueba, todo bien */
//
//		/* PROBANDO LOS METODOS DE LA CLASE SERVICIO CreditCardServiceImp */
//		CreditCardServiceImpl creditCardServiceImpl = new CreditCardServiceImpl();
//		CreditCard credit = new CreditCard();
//		credit = creditCardServiceImpl.loadCreditCard(credit);
//		creditCardServiceImpl.showCreditCard(credit);
		/* Fin de la prueba, todo bien */

		/* PROBANDO LOS METODOS DE LA CLASE SERVICIO AttachedPersonServiceImpl */
		
		ArrayList<AttachedPerson> listAttachedPerson = loadListAttachedPersonHardcodeado();
		AttachedPerson attachedPerson = listAttachedPerson.get(1);

		// Se crea el objeto attachedPersonService para utilizar los metodos de la clase
		// AttachedPersonServiceImpl
		AttachedPersonServiceImpl attachedPersonServiceImpl = new AttachedPersonServiceImpl();
		ArrayList<Card> cards = attachedPersonServiceImpl.findAllCardsOfAttachedPerson(attachedPerson);
		attachedPersonServiceImpl.showAllCardsOfAttachedPerson(cards);
		in.close();
	}

	// Metodo para devolver una lista de tarjetas de credito Santander hardcodeadas
	public static ArrayList<CreditCard> loadListCreditCardSantanderHardcodeado() {
		CreditCard creditCardsSantander1 = new CreditCard("Santander Rio", 2189376548273L, "01/03", "02/08",
				(short) 135, 50.000);
		CreditCard creditCardsSantander2 = new CreditCard("Santander Rio", 2182176548273L, "01/03", "02/08",
				(short) 998, 100.000);

		ArrayList<CreditCard> creditsSantander = new ArrayList<>();
		creditsSantander.add(creditCardsSantander1);
		creditsSantander.add(creditCardsSantander2);

		return creditsSantander;
	}

	// Metodo para devolver una lista de tarjetas de credito Itau hardcodeadas
	public static ArrayList<CreditCard> loadListCreditCardItauHardcodeado() {
		CreditCard creditCardsItau1 = new CreditCard("Itau", 5189376548273L, "01/03", "02/08", (short) 333, 70.000);
		CreditCard creditCardsItau2 = new CreditCard("Itau", 5182176123473L, "08/11", "02/12", (short) 888, 150.000);

		ArrayList<CreditCard> creditsItau = new ArrayList<>();
		creditsItau.add(creditCardsItau1);
		creditsItau.add(creditCardsItau2);

		return creditsItau;
	}

	// Metodo para devolver una lista de tarjetas hardcodeadas de Alejandro
	public static ArrayList<Card> loadCardsHardcodeado() {

		ArrayList<Card> cards = new ArrayList<>();
		cards.add(loadCardSantander());
		cards.add(loadCardItau());
		return cards;
	}

	// Metodo para devolver una lista de tarjetas hardcodeadas de Lucas, estas son
	// debitos que no poseen tarjetas de credito adheridas a ellas
	public static ArrayList<Card> loadCardsHardcodeado2() {
		ArrayList<Card> cards = new ArrayList<>();
		Card cardDebito1 = new DebitCard("Santander Rio", 987654313456789L, "02/10", "02/12", (short) 824);
		Card cardDebito2 = new DebitCard("BBVA", 1763452789120456L, "01/03", "01/12", (short) 254);
		
		cards.add(cardDebito1);
		cards.add(cardDebito2);
		return cards;
	}

	public static ArrayList<AttachedPerson> loadListAttachedPersonHardcodeado() {

		AttachedPerson attachedPerson1 = new AttachedPerson(12345678L, "Alejandro", "Gonzales", "15/04/1996",
				1234567887654321L, "CUERVO.PROGRAMADOR", loadCardsHardcodeado());
		AttachedPerson attachedPerson2 = new AttachedPerson(98765432L, "Lucas", "Fernandez", "12/09/2002", 3334422255555555L, "DODO.SANDIA", loadCardsHardcodeado2());
		
		ArrayList<AttachedPerson> attachedPerson = new ArrayList<>();
		attachedPerson.add(attachedPerson1);
		attachedPerson.add(attachedPerson2);
				
		return attachedPerson;
	}

	// Metodo para devolver una tarjeta Santander hardcodeada con sus respectivas tarjetas de credito
	public static Card loadCardSantander() {

		Card card = new DebitCard("Santander Rio", 2189376548273L, "01/03", "02/08", (short) 947,
				loadListCreditCardSantanderHardcodeado());
		return card;
	}

	// Metodo para devolver una tarjeta Itau hardcodeada
	public static Card loadCardItau() {
		Card card = new DebitCard("Itau", 2181238273L, "01/03", "02/08", (short) 123,
				loadListCreditCardItauHardcodeado());
		return card;
	}
	
	public static Person loadPersonHardcode() {
		Person person = new Person(39493768L, "Alejandro", "Fuertes", "10/03/1996");
		return person;
	}
	
	public static Card loadCardHarcode() {
		Card card = new Card("Santander Rio", 2189376548273L, "01/03", "02/08", (short) 947);
		return card;
	}

}
