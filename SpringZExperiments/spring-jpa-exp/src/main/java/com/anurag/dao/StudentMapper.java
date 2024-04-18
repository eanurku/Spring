package com.anurag.dao;

import com.anurag.models.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet res, int i) throws SQLException {

        Student student = new Student();
        student.setId(res.getLong("id"));
        student.setName(res.getString("name"));
        student.setContact(res.getString("contact"));

        return student;
    }
}
