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

        return "index";
    }


}
