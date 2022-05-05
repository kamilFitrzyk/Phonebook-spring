package com.phonebook.service;

import com.phonebook.model.Person;
import com.phonebook.repository.PhonebookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookServiceImplTest {

    PhonebookServiceImpl phonebookService;

    @Mock
    PhonebookRepository phonebookRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        phonebookService = new PhonebookServiceImpl(phonebookRepository);

    }



    @Test
    void save() throws Exception{
/*
        //Person personToSave = Person.builder().id(1L).firstName("David").lastName("Nopper").address("Cracow 14A").number("543678543").build();
        Person personToSave = new Person(1L,"David", "Nopper", "Cracow", "123123123");

        //Person savePerson = phonebookService.savePerson(personToSave);

        Person person = new Person();

        Mockito.when(phonebookService.savePerson(personToSave)).thenReturn(person);
        phonebookService.savePerson(personToSave);
        Optional<Person> optional = phonebookRepository.findById(1L);


        assertNotNull(optional);
        assertEquals(personToSave.getId(), optional.get().getId());
*/


    }
}