package com.anurag.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping("/greeting")
    public String welcome(Model model) {

        model.addAttribute("greeting","Welcome to Mvc 4");
        return "welcome";
    }

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public  String index(){

        return "forward:index.jsp";
    }

}
