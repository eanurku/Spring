package com.anurag.controllers;

import com.anurag.models.Activity;
import com.anurag.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ActivityRestController {

    @Autowired
    private ActivityService activityService;

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody
    List<Activity> getActivities() {
        return activityService.findAllActivities();

    }


}
