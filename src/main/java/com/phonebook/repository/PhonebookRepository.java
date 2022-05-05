package com.phonebook.repository;

import com.phonebook.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhonebookRepository extends CrudRepository<Person, Long> {

    Optional<Person> findByFirstName(String firstName);

    Optional<Person> findByLastName(String lastName);

    Optional<Person> findByNumber(String number);
}
