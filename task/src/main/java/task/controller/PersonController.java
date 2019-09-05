package task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import task.service.CSVUtils;

@Controller
public class PersonController {
	
	@Autowired
	CSVUtils csvUtils;
	
	@GetMapping("/persons")
	public String setLocations(Model model) {
		model.addAttribute("persons", csvUtils.getPersonsFromCSV("D:/Workspaces/task/src/main/resources/convertcsv.csv"));
		return "index";
	}
	
	//TODO redirect na get i popuniti osobe
	@PostMapping("/persons")
	public String getPersons(Model model) {
		model.addAttribute("persons", csvUtils.getPersonsFromCSV("D:/Workspaces/task/src/main/resources/convertcsv.csv"));
		return "index";
	}	

}
