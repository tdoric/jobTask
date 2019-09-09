package task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import task.service.CSVUtils;
import task.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	CSVUtils csvUtils;
	@Autowired
	PersonService personService;
	
	@GetMapping("/persons")
	public String setLocations(Model model) {
		return "index";
	}
	
	@GetMapping("/getPersons")
	public String getPersons(Model model) {
		model.addAttribute("persons", csvUtils.getPersonsFromCSV("D:/Workspaces/task/src/main/resources/convertcsv.csv"));
		return "index";
	}	
	

	

}
