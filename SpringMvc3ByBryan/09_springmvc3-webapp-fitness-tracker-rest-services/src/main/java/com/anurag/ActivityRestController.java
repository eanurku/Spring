package com.anurag;

import com.anurag.models.Activity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ActivityRestController {

@RequestMapping(value = "/activities",method = RequestMethod.GET)
    public @ResponseBody List<Activity> getActivities(){

    List<Activity> activities=new ArrayList<>();
    activities.add(new Activity(123,"cycling"));
    activities.add(new Activity(123,"biking"));
    activities.add(new Activity(123,"running"));

    return activities;

}


}
