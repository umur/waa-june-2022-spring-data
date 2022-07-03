package com.waa.lab3.controller;

import com.waa.lab3.entity.Person;
import com.waa.lab3.repo.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class PersonController {

    private final PersonRepository personRepository;

    @GetMapping("/persons")
    public Persons getAll() {
        return new Persons(personRepository.findAll());
    }

    record Persons(List<Person> personList){}
}
