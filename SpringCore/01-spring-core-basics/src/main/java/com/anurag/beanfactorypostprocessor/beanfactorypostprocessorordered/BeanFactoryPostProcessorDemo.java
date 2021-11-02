package com.anurag.beanfactorypostprocessor.beanfactorypostprocessorordered;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryPostProcessorDemo {
    public static void main(String[] args) {
        ApplicationContext appcxt = new ClassPathXmlApplicationContext("BeanFactoryPostProcessorOrdered.xml");
        Student st = appcxt.getBean("student", Student.class);
        System.out.println(st);
        ((ClassPathXmlApplicationContext) appcxt).close();
    }
}
