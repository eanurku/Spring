package com.anurag;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ActivityController {

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    List<Activity> getAllActivity(){


        List<Activity> list = new ArrayList<>();
        list.add(new Activity("hockey",12));
        list.add(new Activity("football",13));
        return list;
    }

}
