package com.anurag;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome/{userName}/{userId}")
    public ModelAndView welcome(@PathVariable("userName") String name, @PathVariable("userId") String id) {
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("name", name);
        modelAndView.addObject("id", id);
        return modelAndView;
    }
}
