package com.anurag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping("greeting")
    public String test(Model model){

        model.addAttribute("welcomeMessage","welcome to spring jdbc");

        return "welcome";
    }

}
