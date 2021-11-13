package com.anurag.controllers;

import com.anurag.models.Course;
import com.anurag.models.Registration;
import com.anurag.models.RegistrationReport;
import com.anurag.services.CourseService;
import com.anurag.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RegistrationController {


    @Autowired
    RegistrationService registrationService;

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/registration",method = RequestMethod.GET)
    public String displayRegistration(@ModelAttribute("registration") Registration registration){

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String submitRegistration(@ModelAttribute("registration") Registration registration) {


        registrationService.addRegistration(registration);


        return "redirect:index";
    }

    @RequestMapping(value = "/registrations", method = RequestMethod.GET)
    public @ResponseBody
    List<Registration> getRegistration() {

        List<Registration> registrations = registrationService.findAll();
        return registrations;
    }

    @RequestMapping(value = "/registration/{id}",method = RequestMethod.GET)
    public @ResponseBody Registration getRegistration(@PathVariable("id") Long id){

        Registration registration=registrationService.getRegistration(id);
        return registration;
    }


    @RequestMapping(value = "/registrationReports",method = RequestMethod.GET)
    public @ResponseBody List<RegistrationReport> getAllRegistrationReposts(){

        return registrationService.findAllReports();

    }

    @GetMapping(value = "registrationReports2")
    public @ResponseBody List<RegistrationReport> getAllRegistrationRepostsByNamedQuery(){

        return registrationService.findAllReportsByNamedQuery();

    }

    @PostMapping(value = "registrationUpdate")
    public @ResponseBody Registration updateRegistration(@RequestBody Registration registration){

        registration=registrationService.updateRegistration(registration);

        return registration;
    }


}
