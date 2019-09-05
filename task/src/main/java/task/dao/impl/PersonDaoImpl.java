package task.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import task.dao.PersonDao;
import task.dao.Statements;
import task.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void insertPerson(Person person) {
		jdbcTemplate.update(Statements.Person.INSERT, new Object[] {person.getName(),person.getSurname(),
				person.getZipCode(),person.getCity(),person.getContactNumber()});

	}

}
