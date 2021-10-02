package com.anurag.jdbctemplate.setup;

import com.anurag.dao.Student;
import com.anurag.dao.StudentJdbcTemplate;
import com.anurag.dao.StudentMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringJdbcTemplateSetup {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dispatch-servlet.xml");
        StudentJdbcTemplate studentjdbcTemplate = context.getBean("studentJdbcTemplate", StudentJdbcTemplate.class);

        List<Student> students = studentjdbcTemplate.getJdbctemplateObj().query("select * from student", new StudentMapper());
        System.out.println(students);


    }
}
