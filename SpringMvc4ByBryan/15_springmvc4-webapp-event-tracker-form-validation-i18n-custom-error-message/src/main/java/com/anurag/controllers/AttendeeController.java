package com.anurag.controllers;

import com.anurag.models.Attendee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class AttendeeController {

    @RequestMapping(value = "/attendee", method = RequestMethod.GET)
    public String displayAttendeePage(Model model) {

        Attendee attendee = new Attendee();
        model.addAttribute("attendee", attendee);
        return "attendee";
    }

    @RequestMapping(value = "/attendee", method = RequestMethod.POST)
    public String submitAttendee(@Valid @ModelAttribute("attendee") Attendee attendee, BindingResult results){

        if(results.hasErrors()){
            return "attendee";
        }
        System.out.println(attendee);
        return "redirect:index";
    }
}
