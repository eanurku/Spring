package com.anurag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/greeting")
    public String welcome(Model model) {

        model.addAttribute("greeting","Welcome to Mvc 4");
        return "welcome";
    }

}
