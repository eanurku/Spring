package com.anurag.controllers;

import com.anurag.dao.Ride;
import com.anurag.services.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RideController {

    @Autowired
    RideService rideService;

    @RequestMapping(value = "/rides", method = RequestMethod.GET)
    public @ResponseBody List<Ride> rides() {

        return rideService.getRides();
    }

}
