package com.anurag.beanloading.preloading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PreLoadingDemo {
    public static void main(String[] args) {

        ApplicationContext appcxt = new ClassPathXmlApplicationContext("BeanLoading.xml");

    }
}
