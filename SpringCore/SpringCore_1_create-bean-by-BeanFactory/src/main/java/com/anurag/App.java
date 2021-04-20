package com.anurag;

import com.anurag.draw.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class App 
{
    public static void main( String[] args )
    {
        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
        Triangle triangle = (Triangle) beanFactory.getBean("triangle");
        System.out.println(triangle);

    }
}
