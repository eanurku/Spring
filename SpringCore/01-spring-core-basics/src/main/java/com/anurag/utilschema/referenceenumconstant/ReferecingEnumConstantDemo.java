package com.anurag.utilschema.referenceenumconstant;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferecingEnumConstantDemo {
    public static void main(String[] args) {

        ApplicationContext appcontext = new ClassPathXmlApplicationContext("EnumConstants.xml");
        Student student1 = appcontext.getBean("student1", Student.class);
        System.out.println(student1);

        Student student2 = appcontext.getBean("student2", Student.class);
        System.out.println(student2);


    }
}
