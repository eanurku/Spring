package com.anurag;

import com.anurag.dao.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppJDbcDemo {
    public static void main(String[] args) {

        ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");

        StudentDaoImpl daoImpl = cxt.getBean("studentJdbcTemplate", StudentDaoImpl.class);
        System.out.println(daoImpl.getStudent(0L));

    }
}
