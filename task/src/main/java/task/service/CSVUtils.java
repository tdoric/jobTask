package task.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import task.model.Person;

@Component
public class CSVUtils {
	
	public List<Person> getPersonsFromCSV(String pathFile) {
		BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";
        List<Person> persons = new ArrayList<Person>();

        try {

            br = new BufferedReader(new FileReader(pathFile));
            while ((line = br.readLine()) != null) {
                String[] personAttr = line.split(cvsSplitBy);
                Person person = new Person(personAttr[0], personAttr[1], personAttr[2], personAttr[3], personAttr[4]);
                if(!StringUtils.isNumeric(personAttr[2])) {
                	person.setError(true);
                }
               
                persons.add(person);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		return persons;
	}

}
