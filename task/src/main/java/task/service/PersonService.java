package task.service;

import java.util.List;

import task.model.Person;


public interface PersonService {
	
	public void insertInDatabase(List<Person> persons);

}
