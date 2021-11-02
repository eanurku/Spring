package com.anurag.beanlifecycle.initanddestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitAndDestroyOfSingletonDemo {
    public static void main(String[] args) {

        ApplicationContext appcxt = new ClassPathXmlApplicationContext("BeanLifecycleOfSingleton.xml");

        ((ClassPathXmlApplicationContext) appcxt).close();


    }
}
