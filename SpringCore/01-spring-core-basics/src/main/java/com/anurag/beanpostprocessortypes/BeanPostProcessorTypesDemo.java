package com.anurag.beanpostprocessortypes;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorTypesDemo {
    public static void main(String[] args) {
        ApplicationContext appcxt = new ClassPathXmlApplicationContext("BeanPostProcessorTypes.xml");
        Student st = appcxt.getBean("student", Student.class);
        System.out.println(st);
        ((ClassPathXmlApplicationContext) appcxt).close();
    }
}
