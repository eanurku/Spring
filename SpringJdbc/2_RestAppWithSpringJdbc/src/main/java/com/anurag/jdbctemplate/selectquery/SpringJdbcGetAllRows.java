package com.anurag.jdbctemplate.selectquery;

import com.anurag.dao.StudentJdbcTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcGetAllRows {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dispatch-servlet.xml");
        StudentJdbcTemplate studentJdbcTemplate = context.getBean("studentJdbcTemplate", StudentJdbcTemplate.class);

        System.out.println(studentJdbcTemplate.getAllStudents());

    }
}
