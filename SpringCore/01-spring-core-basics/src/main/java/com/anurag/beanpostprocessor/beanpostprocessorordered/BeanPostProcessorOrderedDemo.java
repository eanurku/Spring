package com.anurag.beanpostprocessor.beanpostprocessorordered;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorOrderedDemo {
    public static void main(String[] args) {
        ApplicationContext appcxt = new ClassPathXmlApplicationContext("BeanPostProcessorOrdered.xml");
        Student st = appcxt.getBean("student", Student.class);
        System.out.println(st);
        ((ClassPathXmlApplicationContext) appcxt).close();
    }
}
