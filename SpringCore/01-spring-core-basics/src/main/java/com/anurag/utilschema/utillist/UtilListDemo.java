package com.anurag.utilschema.utillist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UtilListDemo {
    public static void main(String[] args) {
        ApplicationContext appcxt = new ClassPathXmlApplicationContext("UtilList.xml");


        List<String> list1=appcxt.getBean("list1", List.class);
        System.out.println(list1);

        List<Integer> list2=appcxt.getBean("list2", List.class);
        System.out.println(list2);


        List<Integer> list3=appcxt.getBean("list3", List.class);
        System.out.println(list3);

        List<Integer> list4=appcxt.getBean("list4", List.class);
        System.out.println(list4);
    }
}
