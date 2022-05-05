package com.phonebook.service;

import com.phonebook.model.Person;
import com.phonebook.repository.PhonebookRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class PhonebookServiceImpl implements PhonebookService {


    private final PhonebookRepository phonebookRepository;

    public PhonebookServiceImpl(PhonebookRepository phonebookRepository) {
        this.phonebookRepository = phonebookRepository;
    }

    @Override
    public Set<Person> getPeople() {
        Set<Person> personSet = new HashSet<>();
        phonebookRepository.findAll().iterator().forEachRemaining(personSet::add);
        return personSet;
    }

    @Override
    public Person findById(Long id) {
        return phonebookRepository.findById(id).orElseThrow();
    }

    @Override
    public Person findByFirstName(String firstName) {
        return phonebookRepository.findByFirstName(firstName).orElseThrow();
    }

    @Override
    public Person findByLastName(String lastName) {
        return phonebookRepository.findByLastName(lastName).orElseThrow();
    }

    @Override
    public Person findByNumber(String number) {
        Optional<Person> optionalPerson = phonebookRepository.findByNumber(number);
        return optionalPerson.get();
    }


    @Override
    public Person savePerson(Person newPerson) {
        Person savePerson = phonebookRepository.save(newPerson);
        System.out.println("Service savePerson " + savePerson);
        System.out.println("newPerson " + newPerson);
        return savePerson;
    }

    @Override
    public void deleteById(Long id) {
        phonebookRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        phonebookRepository.deleteAll();
    }
}
