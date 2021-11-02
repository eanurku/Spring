package com.anurag.beanlifecycle.initializableanddisposable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitializeAndDisposableDemo {
    public static void main(String[] args) {
        ApplicationContext appcxt = new ClassPathXmlApplicationContext("BeanLifecycleInterfaces.xml");

        ((ClassPathXmlApplicationContext) appcxt).close();
    }

}
