package com.anurag.controllers;

import com.anurag.dao.StudentDaoImpl;
import com.anurag.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

//    @Autowired
//    StudentDaoImpl studentDao;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){

        return "Welcome to Rest";
    }

//    @RequestMapping(value = "/getStudent/{id}",method = RequestMethod.GET)
//    public Student getStudent(@PathVariable("id") Long id){
//
//        Student obj = studentDao.getStudent(id);
//
//        return obj;
//    }
//
//    @RequestMapping(value = "/addStudent",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Integer> hello(@RequestBody Student student){
//
//        System.out.println(student);
//        Integer count = studentDao.addStudent(student);
//        return new ResponseEntity<>(count,HttpStatus.CREATED);
//    }
}
