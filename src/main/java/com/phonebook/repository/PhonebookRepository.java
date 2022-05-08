package com.phonebook.repository;

import com.phonebook.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhonebookRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByFirstName(String firstName);

    Optional<Person> findByLastName(String lastName);

    Optional<Person> findByNumber(String number);
}
