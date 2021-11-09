package com.anurag.controllers;

import com.anurag.models.Registration;
import com.anurag.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {


    @Autowired
    RegistrationService registrationService;

    @RequestMapping(value = "/registration",method = RequestMethod.GET)
    public String displayRegistration(@ModelAttribute("registration") Registration registration){

        return "registration";
    }
    @RequestMapping(value = "/registration",method = RequestMethod.POST)
    public String submitRegistration(@ModelAttribute("registration") Registration registration){

        System.out.println(registration);
        registrationService.addRegistration(registration);
        return "redirect:index";
    }
}
