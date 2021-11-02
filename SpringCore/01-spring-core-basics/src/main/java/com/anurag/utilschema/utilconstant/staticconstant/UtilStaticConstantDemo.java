package com.anurag.utilschema.utilconstant.staticconstant;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UtilStaticConstantDemo {
    public static void main(String[] args) {

        ApplicationContext appcontext = new ClassPathXmlApplicationContext("UtilStaticConstant.xml");
        Student student = appcontext.getBean("student", Student.class);
        System.out.println(student);
    }
}
