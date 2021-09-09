package com.anurag;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class GreetingController {
    @RequestMapping("/greet")
    public String getGreeting(Map<String,Object> model){

        model.put("msg","this is message froom controller");

        return "greeting";
    }
}
