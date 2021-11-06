package com.anurag.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String welcome(Model model) {
        model.addAttribute("welcomeMessage", "this is welcome message");
        return "welcome";
    }
}
