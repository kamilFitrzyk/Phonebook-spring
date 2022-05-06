package com.phonebook.controllers;

import com.phonebook.service.PhonebookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhonebookController {

    private final PhonebookService phonebookService;

    public PhonebookController(PhonebookService phonebookService) {
        this.phonebookService = phonebookService;
    }

    @GetMapping({"/phonebook"})
    public String getPhonebook() {

        phonebookService.getPeople();
        return "phonebook";
    }
}
