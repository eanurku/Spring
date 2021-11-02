package com.anurag.dependencyinjection.constructorbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorBasedDIDemo {
    public static void main(String[] args) {

        ApplicationContext appcxt = new ClassPathXmlApplicationContext("ConstructorBasedDI.xml");
        Student student = (Student) appcxt.getBean("student");
        System.out.println(student.toString());


    }
}
