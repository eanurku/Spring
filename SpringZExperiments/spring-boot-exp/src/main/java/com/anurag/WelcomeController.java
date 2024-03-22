package com.anurag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public String welcomeMethod(Model model){
        model.addAttribute("welcomeMessage","welcome to boot boot 2");
        return "welcome";
    }
}
