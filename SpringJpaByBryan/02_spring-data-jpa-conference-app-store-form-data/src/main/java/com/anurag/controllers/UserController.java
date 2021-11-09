package com.anurag.controllers;

import com.anurag.models.User;
import com.anurag.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String displayUser(@ModelAttribute("user") User user) {

        return "user";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String submitUser(@ModelAttribute("user") User user) {

        System.out.println(user);
        userService.addUser(user);
        return "redirect:index";
    }
}
