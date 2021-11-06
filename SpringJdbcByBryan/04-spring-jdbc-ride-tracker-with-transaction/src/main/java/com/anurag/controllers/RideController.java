package com.anurag.controllers;

import com.anurag.dao.Ride;
import com.anurag.errors.ServiceError;
import com.anurag.services.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RideController {

    @Autowired
    RideService rideService;

    @RequestMapping(value = "/rides", method = RequestMethod.GET)
    public @ResponseBody
    List<Ride> rides() {

        return rideService.getRides();
    }


    @RequestMapping(value = "/ride", method = RequestMethod.POST)
    public @ResponseBody Ride rides(@RequestBody Ride ride) {

        return rideService.addRide(ride);
    }



    @RequestMapping(value = "/checkerror", method = RequestMethod.GET)
    public @ResponseBody
    Object error() {
        throw new DataAccessException("exception occured while fetching from ride table") {
        };
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ServiceError> handle(RuntimeException ex) {

        ServiceError serviceError = new ServiceError();
        serviceError.setCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
        serviceError.setMessage(ex.getMessage());
        return new ResponseEntity<>(serviceError, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
