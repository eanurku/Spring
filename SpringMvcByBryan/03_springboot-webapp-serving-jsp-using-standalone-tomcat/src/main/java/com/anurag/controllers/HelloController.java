package com.anurag.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HelloController {

    @GetMapping("greeting")
    public String welcome(Map<String, Object> model) {
        model.put("welcomeMessage", "welcome to spring boot world !!");
        return "welcome";
    }

}
