//package com.anurag.repository;
//
//import com.anurag.models.Course;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//
//@Repository
//public class CourseRepositoryImpl implements CourseRepository {
//
//
//    @Autowired
//    EntityManager entityManager;
//
//    @Override
//    public Course save(Course course) {
//
//        if (course.getId() == null) {
//            entityManager.persist(course);
//        } else {
//            course = entityManager.merge(course);
//
//        }
//
//        return course;
//    }
//}
