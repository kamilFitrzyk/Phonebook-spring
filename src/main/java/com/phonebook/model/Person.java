package com.phonebook.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Person{

    @Builder
    public Person(Long id, String firstName, String lastName, String address, String number) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.number = number;
    }

    public Person() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String firstName;


    private String lastName;


    private String address;


    private String number;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
