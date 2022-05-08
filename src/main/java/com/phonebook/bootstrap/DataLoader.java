package com.phonebook.bootstrap;

import com.phonebook.model.Person;
import com.phonebook.service.PhonebookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PhonebookService phonebookService;


    public DataLoader(PhonebookService phonebookService) {
        this.phonebookService = phonebookService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = phonebookService.getPeople().size();

        if (count == 0 ) {
            loadData();
        }
    }

    private void loadData() {

        Person person1 = phonebookService.savePerson(Person.builder().id(1L).firstName("Dawid").lastName("Laskowski").address("Krakow 14").number("463262371").build());
        Person person2 = phonebookService.savePerson(Person.builder().id(2L).firstName("Magda").lastName("Korum").address("Krakow 14").number("463262371").build());
        Person person3 = phonebookService.savePerson(Person.builder().id(3L).firstName("Katarzyna").lastName("Tera").address("Krakow 14").number("463262371").build());
        Person person4 = phonebookService.savePerson(Person.builder().id(4L).firstName("Grzegorz").lastName("Zborski").address("Krakow 14").number("463262371").build());
        Person person5 = phonebookService.savePerson(Person.builder().id(5L).firstName("Jerzy").lastName("Laskowski").address("Krakow 14").number("463262371").build());

        phonebookService.savePerson(person1);
        phonebookService.savePerson(person2);
        phonebookService.savePerson(person3);
        phonebookService.savePerson(person4);
        phonebookService.savePerson(person5);
    }



}
