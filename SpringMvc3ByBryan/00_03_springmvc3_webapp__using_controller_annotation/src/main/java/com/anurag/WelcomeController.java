package com.anurag;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
   public ModelAndView test(){

        ModelAndView modelAndView=new ModelAndView("welcome");
        modelAndView.addObject("welcomeMessage","welcome to @controller based mvc");
        return modelAndView;
    }
}
