package com.phonebook.service;

import com.phonebook.model.Person;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface PhonebookService {

    Set<Person> getPeople();

    Person findById(Long id);

    Person findByFirstName(String firstName);

    Person findByLastName(String lastName);

    Person findByNumber(String number);

    Person savePerson(Person newPerson);

    void deleteById(Long id);

    void deleteAll();
}
