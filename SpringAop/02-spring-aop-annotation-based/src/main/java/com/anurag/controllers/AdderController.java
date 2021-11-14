package com.anurag.controllers;

import com.anurag.businessclasses.SampleAdder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdderController {

    @Autowired
    SampleAdder adder;

    @GetMapping("add/{num1}/{num2}")
    public @ResponseBody Integer addterTest(@PathVariable("num1") Integer num1,@PathVariable("num2") Integer num2){

        Integer result=adder.add(num1,num2);
        return result;
    }

}
