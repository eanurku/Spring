package com.anurag;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String submitMinutes(@ModelAttribute("exercise") Excercise excercise) {
        System.out.println(excercise);
        return "addMinutes";
    }
}
