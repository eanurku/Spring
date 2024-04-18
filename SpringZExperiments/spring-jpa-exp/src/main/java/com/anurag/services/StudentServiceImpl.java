package com.anurag.services;

import com.anurag.models.Student;
import com.anurag.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepo;


    @Override
    public Student getStudent(Long id) {
        Optional<Student> val = studentRepo.findById(id);
        return val.orElse(new Student());
    }

    @Override
    @Transactional
    public void addStudent(Student student) {
        studentRepo.save(student);
    }
}
