package task;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import task.model.Person;
import task.service.CSVUtils;
import task.service.PersonService;

@SpringBootApplication
public class Application  implements ApplicationRunner  {
	
	@Autowired
	CSVUtils csv;
	@Autowired
	PersonService ps;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		SpringApplication.run(Application.class, args);
    }

	@Override
	public void run(ApplicationArguments args) throws Exception {
		 String csvFile = "D:/Workspaces/task/src/main/resources/convertcsv.csv";
		 List<Person> persons =  csv.getPersonsFromCSV(csvFile);
		 ps.insertInDatabase(persons);
		
	}

		
	

}
