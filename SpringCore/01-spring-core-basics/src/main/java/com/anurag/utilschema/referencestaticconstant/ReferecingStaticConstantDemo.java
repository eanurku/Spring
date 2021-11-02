package com.anurag.utilschema.referencestaticconstant;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferecingStaticConstantDemo {
    public static void main(String[] args) {

        ApplicationContext appcontext = new ClassPathXmlApplicationContext("ReferencingStaticConstants.xml");
        Student student1 = appcontext.getBean("student1", Student.class);
        System.out.println(student1);

        Student student2 = appcontext.getBean("student2", Student.class);
        System.out.println(student2);

        Integer SummerIntern = appcontext.getBean("com.utilschema.referencestaticconstant.StudentType.SummerIntern", Integer.class);
        System.out.println(SummerIntern);

    }
}
