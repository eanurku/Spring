package com.anurag.propertyresourceconfigurer;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PropertyLoadingDemo1 {

    public static void main(String[] args) {
        System.out.println("loading props....");

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans_5.xml"));

        PropertyPlaceholderConfigurer propertyConfigLoader = factory.getBean("properyLoader", PropertyPlaceholderConfigurer.class);

        propertyConfigLoader.postProcessBeanFactory(factory);


        Student student = factory.getBean("student", Student.class);
        System.out.println("student::" + student);

    }

}
