package com.anurag.dependencyinjection.propertybased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyBasedDIDemo {

    public static void main(String[] args) {

        ApplicationContext appcxt = new ClassPathXmlApplicationContext("PropertyBasedDI.xml");

        Address addr = appcxt.getBean("addr",Address.class);
        System.out.println(addr);

        Student st = appcxt.getBean("student",Student.class);
        System.out.println(st);
    }

}
