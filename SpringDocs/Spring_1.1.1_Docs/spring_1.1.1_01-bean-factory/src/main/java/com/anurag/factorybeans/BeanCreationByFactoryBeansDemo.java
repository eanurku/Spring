package com.anurag.factorybeans;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanCreationByFactoryBeansDemo {

    public static void main(String[] args) {

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans_3.xml"));
        Department dept1 = factory.getBean("dept", Department.class);
        System.out.println(dept1);

    }

}
