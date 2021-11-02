package com.anurag.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanPostProcessorDemo {
    public static void main(String[] args) {
        ApplicationContext appcxt = new ClassPathXmlApplicationContext("BeanPostProcessor.xml");
        Student st = appcxt.getBean("student", Student.class);
        System.out.println(st);
        ((ClassPathXmlApplicationContext) appcxt).close();
    }
}
