package com.anurag.beanloading.lazyloading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyLoadingDemo {
    public static void main(String[] args) {
        ApplicationContext appcxt = new ClassPathXmlApplicationContext("BeanLoading.xml");


        Student st1 = appcxt.getBean("lazystudent1", Student.class);
        Student st2 = appcxt.getBean("lazystudent2", Student.class);
        Student st3 = appcxt.getBean("lazystudent3", Student.class);
        Student st4 = appcxt.getBean("lazystudent4", Student.class);


    }
}
