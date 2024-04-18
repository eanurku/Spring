package com.anurag.dao;

import com.anurag.models.Student;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.sql.DataSource;


public class StudentDaoImpl implements StudentDao {


    private DataSource dataSource;
    private JdbcTemplate jdbctemplate;

    public StudentDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbctemplate=new JdbcTemplate(this.dataSource);
    }

    @Override
    public Student getStudent(Long id) {


        Student obj = jdbctemplate.queryForObject("select * from student where id=" + id, new StudentMapper());

        return obj;

    }

    @Override
    public Integer addStudent(Student student) {
        String SQL="insert into student(id,name,contact) values(?,?,?)";
        int count = jdbctemplate.update(SQL, student.getId(), student.getName(), student.getContact());

        return count;

    }
}
