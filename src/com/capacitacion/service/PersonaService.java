package com.capacitacion.service;

import com.capacitacion.dao.Person;

public interface PersonaService {

	public void showNamePerson(Person person);
	public Boolean isOlder(Person person);
	public void showDataPerson(Person person);
}
