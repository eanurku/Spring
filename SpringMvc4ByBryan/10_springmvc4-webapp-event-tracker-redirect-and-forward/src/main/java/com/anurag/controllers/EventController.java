package com.anurag.controllers;

import com.anurag.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public String displayEventPage(Model model) {
        Event event = new Event();
        event.setEventName("Java User Group Event");
        model.addAttribute("event", event);
        return "event";
    }

    @RequestMapping(value = "/event",method = RequestMethod.POST)
    public String submitEvent(@ModelAttribute("event") Event event){

        System.out.println(event);
        return "redirect:index";
    }
}
