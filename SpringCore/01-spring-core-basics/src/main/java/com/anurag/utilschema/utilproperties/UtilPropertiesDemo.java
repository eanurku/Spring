package com.anurag.utilschema.utilproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class UtilPropertiesDemo {
    public static void main(String[] args) {
        ApplicationContext appcxt = new ClassPathXmlApplicationContext("UtilProperties.xml");

        Properties jdbcconfig1 = appcxt.getBean("jdbcconfig1", Properties.class);
        System.out.println(jdbcconfig1);

        Properties jdbcconfig2 = appcxt.getBean("jdbcconfig2", Properties.class);
        System.out.println(jdbcconfig2);
    }
}
