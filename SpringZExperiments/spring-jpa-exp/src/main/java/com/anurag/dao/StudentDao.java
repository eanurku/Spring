package com.anurag.dao;

import com.anurag.models.Student;

public interface StudentDao {

     Student getStudent(Long id);
     Integer addStudent(Student student);
}
