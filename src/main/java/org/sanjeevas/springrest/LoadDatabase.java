package org.sanjeevas.springrest;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static  final Logger logger = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    public CommandLineRunner initDatabase(EmployeeRepository employeeRepository){
        return args -> {
            logger.info("Preloading " + employeeRepository.save(new Employee("John Doe", "Thief")));
            logger.info("Preloading " + employeeRepository.save(new Employee("Jake Dunn", "accomplice")));

        };
    }

}
