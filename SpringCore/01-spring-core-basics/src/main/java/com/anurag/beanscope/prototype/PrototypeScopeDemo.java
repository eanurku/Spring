package com.anurag.beanscope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeScopeDemo {

    public static void main(String[] args) {
        ApplicationContext appcxt = new ClassPathXmlApplicationContext("BeanScope.xml");

        Student st1 = appcxt.getBean("pstudent", Student.class);
        System.out.println(st1.hashCode());

        Student st2 = appcxt.getBean("pstudent", Student.class);
        System.out.println(st2.hashCode());
    }
}
