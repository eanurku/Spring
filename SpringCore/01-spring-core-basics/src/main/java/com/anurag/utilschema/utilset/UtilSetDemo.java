package com.anurag.utilschema.utilset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

public class UtilSetDemo {
    public static void main(String[] args) {
        ApplicationContext appcxt = new ClassPathXmlApplicationContext("UtilSet.xml");

        Set set1 = appcxt.getBean("set1", Set.class);
        System.out.println(set1);

        Set set2 = appcxt.getBean("set2", Set.class);
        System.out.println(set2);

        Set set3 = appcxt.getBean("set3", Set.class);
        System.out.println(set3);

        Set set4 = appcxt.getBean("set4", Set.class);
        System.out.println(set4);
    }
}
