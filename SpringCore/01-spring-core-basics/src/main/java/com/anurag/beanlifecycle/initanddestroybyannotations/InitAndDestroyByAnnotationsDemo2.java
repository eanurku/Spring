package com.anurag.beanlifecycle.initanddestroybyannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitAndDestroyByAnnotationsDemo2 {
    public static void main(String[] args) {

        ApplicationContext appcxt = new ClassPathXmlApplicationContext("BeanLifecycleAnnotations2.xml");
        Student st = appcxt.getBean("student", Student.class);
        System.out.println(st);
        ((ClassPathXmlApplicationContext) appcxt).close();

    }
}
