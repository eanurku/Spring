package com.anurag.factorymethod;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanCreationByFactoryMethodsDemo {

    public static void main(String[] args) {

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans_2.xml"));
        Department dept1 = factory.getBean("dept1", Department.class);
        System.out.println(dept1);

        Department dept2 = factory.getBean("dept2", Department.class);
        System.out.println(dept2);
    }

}
