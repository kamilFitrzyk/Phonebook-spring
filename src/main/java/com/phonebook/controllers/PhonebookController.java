package com.phonebook.controllers;

import com.phonebook.model.Person;
import com.phonebook.service.PhonebookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PhonebookController {

    private final PhonebookService phonebookService;

    public PhonebookController(PhonebookService phonebookService) {
        this.phonebookService = phonebookService;
    }

    @GetMapping({"/phonebook"})
    public String getPhonebook(Model model) {
        model.addAttribute("phonebook", phonebookService.getPeople());

        return "phonebook";
    }



}
