package it.objectmethod.RestTutorial.dao;

import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.objectmethod.RestTutorial.model.Employee;
import it.objectmethod.RestTutorial.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {
	
	
	Logger log = org.slf4j.LoggerFactory.getLogger(LoadDatabase.class);
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		return args -> {
			//repository.save(new Employee("Frodo Baggins", "thief"));
			log.info("Preloading "); //repository.save(new Employee("Bilbo Bagginss", "burglar")));
			log.info("Preloading " ); //repository.save(new Employee("Frodo Baggins", "thief")));
		};
	}
}
