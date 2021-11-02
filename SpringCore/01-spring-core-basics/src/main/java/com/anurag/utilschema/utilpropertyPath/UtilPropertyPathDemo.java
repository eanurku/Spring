package com.anurag.utilschema.utilpropertyPath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UtilPropertyPathDemo {
    public static void main(String[] args) {
        ApplicationContext appcxt = new ClassPathXmlApplicationContext("UtilPropertyPath.xml");

        Student st = appcxt.getBean("student", Student.class);
        System.out.println(st);

        Integer age = appcxt.getBean("studentage", Integer.class);
        System.out.println(age);

        Employee emp = appcxt.getBean("emp", Employee.class);
        System.out.println(emp);
    }
}
