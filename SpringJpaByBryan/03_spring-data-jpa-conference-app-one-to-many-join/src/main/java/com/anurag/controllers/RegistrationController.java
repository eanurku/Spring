package com.anurag.controllers;

import com.anurag.models.Course;
import com.anurag.models.Registration;
import com.anurag.services.CourseService;
import com.anurag.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {


    @Autowired
    RegistrationService registrationService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String displayRegistration(@ModelAttribute("registration") Registration registration) {

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String submitRegistration(@ModelAttribute("registration") Registration registration) {
        registrationService.addRegistration(registration);
        return "redirect:index";
    }

}
