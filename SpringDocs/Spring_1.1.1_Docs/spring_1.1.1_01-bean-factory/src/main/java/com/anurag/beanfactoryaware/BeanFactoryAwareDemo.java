package com.anurag.beanfactoryaware;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryAwareDemo {

    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans_4.xml"));

        Student student = factory.getBean("studentbean", Student.class);
        System.out.println("bean name="+student.getBeanNameValue());
        System.out.println(student.getName());

        Department dept = student.getFactory().getBean("dept", Department.class);
        System.out.println(dept.getName());

        //TO DO
        //FactoryBean factoryBean = factory.getBean("&dept", FactoryBean.class);

    }
}
