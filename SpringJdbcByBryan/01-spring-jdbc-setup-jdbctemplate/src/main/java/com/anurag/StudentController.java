package com.anurag;

import com.anurag.dao.Student;
import com.anurag.dao.StudentRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("getStudent/{id}")
    public Student getStudent(@PathVariable("id") int studentId){

        return jdbcTemplate.queryForObject("select * from student where id=?",new Object[]{studentId}, new StudentRowMapper());

    }

}
