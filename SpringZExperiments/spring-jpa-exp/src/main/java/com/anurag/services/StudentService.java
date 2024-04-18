package com.anurag.services;

import com.anurag.models.Student;



public interface StudentService {

   Student getStudent(Long id);

   void addStudent(Student student);
}
