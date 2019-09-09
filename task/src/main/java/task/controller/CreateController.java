package task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import task.config.AppProperties;
import task.service.CSVUtils;
import task.service.PersonService;

@RestController
public class CreateController {
	

	@Autowired
	CSVUtils csvUtils;
	@Autowired
	PersonService personService;
	@Autowired
	private AppProperties appProperties;
	
	
	@PostMapping("/savePersons")
	public void start(){
		personService.insertInDatabase(csvUtils.getPersonsFromCSV(appProperties.getPathFile()));
	
	}
}
