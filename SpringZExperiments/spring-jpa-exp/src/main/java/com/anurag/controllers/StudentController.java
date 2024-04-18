package com.anurag.controllers;

import com.anurag.models.Student;
import com.anurag.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    @Autowired
    StudentService studentservice;


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){

        return "Welcome to Student";
    }

    @RequestMapping(value = "/getStudent/{id}",method = RequestMethod.GET)
    public Student getStudent(@PathVariable("id") Long id){

        Student obj = studentservice.getStudent(id);

        return obj;
    }

    @RequestMapping(value = "/addStudent",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> addStudent(@RequestBody Student student){

        System.out.println(student);
         studentservice.addStudent(student);
        return new ResponseEntity<>(true, HttpStatus.CREATED);
    }
}
