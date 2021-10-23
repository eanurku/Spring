package com.anurag.controllers;

import com.anurag.models.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@SessionAttributes("goal")
public class GoalController {


    @RequestMapping(value = "/addGoal",method = RequestMethod.GET)
    public String addGoal(Model model){
        Goal goal=new Goal();
        goal.setMinutes(100);
        model.addAttribute("goal",goal);
        return "addGoal";
    }

    @RequestMapping(value = "/addGoal",method = RequestMethod.POST)
    public String submitGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result){

        System.out.println("result:"+result);
        if(result.hasErrors()){
            return "addGoal";
        }
        System.out.println("goal:"+goal);
        return "redirect:addMinutes";
    }
}
