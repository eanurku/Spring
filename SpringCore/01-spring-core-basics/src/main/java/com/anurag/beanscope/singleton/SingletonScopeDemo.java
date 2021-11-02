package com.anurag.beanscope.singleton;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonScopeDemo {
    public static void main(String[] args) {
        ApplicationContext appcxt = new ClassPathXmlApplicationContext("BeanScope.xml");

        Student st1 = appcxt.getBean("sstudent1", Student.class);
        System.out.println(st1.hashCode());
        Student st2 = appcxt.getBean("sstudent1", Student.class);
        System.out.println(st2.hashCode());

        Student st3 = appcxt.getBean("sstudent2", Student.class);
        System.out.println(st3.hashCode());
        Student st4 = appcxt.getBean("sstudent2", Student.class);
        System.out.println(st4.hashCode());
    }
}
