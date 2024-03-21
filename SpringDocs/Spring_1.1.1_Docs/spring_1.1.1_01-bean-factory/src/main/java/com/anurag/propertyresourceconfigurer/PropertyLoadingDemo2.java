package com.anurag.propertyresourceconfigurer;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class PropertyLoadingDemo2 {

    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans_6.xml"));

        //create bean factory post processor
        PropertyPlaceholderConfigurer propertyConfigurer = new PropertyPlaceholderConfigurer();
        propertyConfigurer.setLocation(new ClassPathResource("studentProperty.properties"));

        //set beanfactory
        propertyConfigurer.postProcessBeanFactory(factory);

        Student student = factory.getBean("student", Student.class);
        System.out.println("student" + student);

    }

}
