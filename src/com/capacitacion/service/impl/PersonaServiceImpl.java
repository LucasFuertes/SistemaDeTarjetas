package com.capacitacion.service.impl;

import com.capacitacion.dao.Person;
import com.capacitacion.service.PersonaService;

public class PersonaServiceImpl implements PersonaService {

	@Override
	public void showNamePerson(Person person) {
		System.out.println(person.getName());

	}

	/*
	 * Este metodo debe ser resuelto luego de haber cambiado los tipos de datos de
	 * las fechas, de String a Date
	 */
	@Override
	public Boolean isOlder(Person person) {
		return null;
	}

	@Override
	public void showDataPerson(Person person) {
		System.out.println("Nombre: " + person.getName() + "\nApellido: " + person.getLastName() + "\nDni: "
				+ person.getDni() + "\nFecha de Nacimiento: " + person.getDateOfBirth());

	}

}
