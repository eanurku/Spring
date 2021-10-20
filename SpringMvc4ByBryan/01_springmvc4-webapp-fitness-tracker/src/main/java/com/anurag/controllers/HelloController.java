package com.anurag.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/greeting")
    public String welcome(Model model) {

        model.addAttribute("welcomeMessage", "Welcome to fitness tracker App");
        return "welcome";
    }


}
