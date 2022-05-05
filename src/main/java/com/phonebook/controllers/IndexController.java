package com.phonebook.controllers;

import com.phonebook.model.Person;
import com.phonebook.service.PhonebookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    private final PhonebookService phonebookService;

    public IndexController(PhonebookService phonebookService) {
        this.phonebookService = phonebookService;
    }

    @GetMapping({"","/","/index"})
    public String getIndexPage(Model model){

        Person person = phonebookService.savePerson(Person.builder().id(1L).firstName("ads").build());

        Person byId = phonebookService.findById(1L);
        System.out.println(byId);
        return "index";
    }
}
