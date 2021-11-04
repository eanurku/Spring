package com.anurag.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {

        Student student=new Student();
        student.setName(resultSet.getString(1));
        student.setContact(resultSet.getLong(2));
        student.setId(resultSet.getInt(3));
        return student;
    }
}
