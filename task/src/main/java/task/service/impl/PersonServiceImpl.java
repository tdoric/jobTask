package task.service.impl;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import task.dao.PersonDao;
import task.model.Person;
import task.service.PersonService;

@Component
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonDao personDao;
	private static Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);
	
	@Override
	public void insertInDatabase(List<Person> persons) {
		try {
			for (Iterator<Person> iterator = persons.iterator(); iterator.hasNext();) {
				Person person = (Person) iterator.next();
				personDao.insertPerson(person);
				
			}
		} catch (DataIntegrityViolationException  e) {
			logger.info("Duplicates not allowed in database");
		}
		
	}

}
