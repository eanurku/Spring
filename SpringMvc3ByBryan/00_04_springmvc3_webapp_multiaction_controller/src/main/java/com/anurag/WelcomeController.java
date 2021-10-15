package com.anurag;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public ModelAndView welcome() {

        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("welcomeMessage", "this is welcome message");

        return modelAndView;

    }

    @RequestMapping("/thanks")
    public ModelAndView thanks() {
        ModelAndView modelAndView = new ModelAndView("thanks");
        modelAndView.addObject("thanksMessage", "thanks for visit.");

        return modelAndView;
    }

}
