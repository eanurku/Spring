package com.anurag.utilschema.referenceBeanFields;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class referenceBeanFieldsDemo {

    public static void main(String[] args) {

        ApplicationContext appcxt = new ClassPathXmlApplicationContext("ReferenceBeanFields.xml");
        Student st = appcxt.getBean("student", Student.class);
        System.out.println(st);

        Integer age1 = appcxt.getBean("studentage1", Integer.class);
        System.out.println(age1);

        Integer age2 = appcxt.getBean("studentage2", Integer.class);
        System.out.println(age2);

        Integer age3 = appcxt.getBean("student.age", Integer.class);
        System.out.println(age3);

        Integer age4 = appcxt.getBean("studentAge", Integer.class);
        System.out.println(age4);

        Employee employee1 = appcxt.getBean("emp1", Employee.class);
        System.out.println(employee1);
        Employee employee2 = appcxt.getBean("emp2", Employee.class);
        System.out.println(employee2);
        Employee employee3 = appcxt.getBean("emp3", Employee.class);
        System.out.println(employee3);
        Employee employee4 = appcxt.getBean("emp4", Employee.class);
        System.out.println(employee4);

    }
}
