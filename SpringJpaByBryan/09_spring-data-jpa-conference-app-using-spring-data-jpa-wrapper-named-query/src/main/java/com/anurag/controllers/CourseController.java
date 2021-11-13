package com.anurag.controllers;

import com.anurag.models.Course;
import com.anurag.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping(value = "course")
    public @ResponseBody Course addCourse(@RequestBody Course course){

        System.out.println(course);
        return courseService.addCourse(course);

    }
}
