package com.anurag.injectingcollectioninbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectingCollectionDemo {

    public static void main(String[] args) {
        ApplicationContext appcontext = new ClassPathXmlApplicationContext("InjectingCollection.xml");
        Student student = appcontext.getBean("student", Student.class);
        System.out.println(student);
        Student student1 = appcontext.getBean("student1", Student.class);
        System.out.println(student1);

    }
}
