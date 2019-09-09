package task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import task.config.AppProperties;
import task.service.CSVUtils;
import task.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	CSVUtils csvUtils;
	@Autowired
	PersonService personService;
	@Autowired
	private AppProperties appProperties;
	
	@GetMapping("/persons")
	public String setLocations(Model model) {
		return "index";
	}
	
	@GetMapping("/getPersons")
	public String getPersons(Model model) {
		model.addAttribute("persons", csvUtils.getPersonsFromCSV(appProperties.getPathFile()));
		return "index";
	}	
	

	

}
