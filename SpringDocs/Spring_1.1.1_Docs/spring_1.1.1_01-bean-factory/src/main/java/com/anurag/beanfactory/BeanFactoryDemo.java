package com.anurag.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryDemo {

    public static void main(String[] args) {

        ClassPathResource inputBeans = new ClassPathResource("Beans_1.xml");
        BeanFactory factory = new XmlBeanFactory(inputBeans);
        Student student = factory.getBean("student", Student.class);
        System.out.println(student);

    }

}
