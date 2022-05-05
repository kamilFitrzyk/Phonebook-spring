package com.phonebook.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person();
    }

    @Test
    void getId() {
        Long idValue=1L;
        person.setId(idValue);

        assertEquals(idValue, person.getId());
    }

    @Test
    void getFirstName() {
        String firstName = "David";
        person.setFirstName(firstName);

        assertEquals(firstName, person.getFirstName());
    }

    @Test
    void getLastName() {
        String lastName = "Strike";
        person.setFirstName(lastName);

        assertEquals(lastName, person.getFirstName());
    }

    @Test
    void getAddress() {
        String address = "Sunflower 12";
        person.setAddress(address);

        assertEquals(address, person.getAddress());
    }

    @Test
    void getNumber() {
        String number = "6431246432";
        person.setNumber(number);

        assertEquals(number, person.getNumber());
    }
}