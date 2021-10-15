package com.anurag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

    @RequestMapping("/addMinutes")
    public String addMinutes(Model model) {
        model.addAttribute("");
        return "addMinutes";
    }
}
