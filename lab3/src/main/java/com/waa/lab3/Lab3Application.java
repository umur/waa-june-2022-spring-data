package com.waa.lab3;

import com.waa.lab3.entity.Person;
import com.waa.lab3.repo.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class Lab3Application {

	private final PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab3Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return (args) -> {
			personRepository.save(new Person(null, "fname1", "lname1", "zip1"));
			personRepository.save(new Person(null, "fname2", "lname2", "zip2"));
			personRepository.save(new Person(null, "fname3", "lname3", "zip3"));
		};
	}

}
