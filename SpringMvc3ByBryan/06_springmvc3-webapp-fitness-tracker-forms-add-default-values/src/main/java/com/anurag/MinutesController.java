package com.anurag;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

    @RequestMapping(value = "/forward")
    public String addMinutesThenForward(@ModelAttribute("exercise") Excercise excercise) {
        System.out.println("excercise:"+excercise);
        return "forward:addMoreMinutes";
    }

    @RequestMapping(value = "/redirect")
    public String addMinutesThenRedirect(@ModelAttribute("exercise") Excercise excercise) {
        System.out.println("excercise:"+excercise);
        return "redirect:addMoreMinutes";
    }

    @RequestMapping(value = "/addMoreMinutes")
    public String addMoreMinutes(@ModelAttribute("exercise") Excercise excercise) {
        System.out.println("exercising :"+excercise);
        return "addMinutes";
    }

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Excercise excercise) {
        System.out.println(excercise);
        return "addMinutes";
    }



}
