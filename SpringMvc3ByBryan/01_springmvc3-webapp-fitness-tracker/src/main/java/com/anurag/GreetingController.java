package com.anurag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {

    @RequestMapping(value = "/greeting")
    public String test(Model model){

        model.addAttribute("greeting","welcome back Anurag!");
        return "hello";

    }

}
