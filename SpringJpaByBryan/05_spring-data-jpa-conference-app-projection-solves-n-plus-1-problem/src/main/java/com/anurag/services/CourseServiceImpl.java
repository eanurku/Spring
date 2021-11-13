package com.anurag.services;

import com.anurag.models.Course;
import com.anurag.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    @Transactional
    public Course addCourse(Course course){

        return courseRepository.save(course);
    }
}
