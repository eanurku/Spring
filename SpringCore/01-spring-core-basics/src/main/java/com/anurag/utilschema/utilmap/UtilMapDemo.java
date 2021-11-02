package com.anurag.utilschema.utilmap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class UtilMapDemo {
    public static void main(String[] args) {

        ApplicationContext appcxt = new ClassPathXmlApplicationContext("UtilMap.xml");

        Map map1 = appcxt.getBean("map1", Map.class);
        System.out.println(map1);

        Map map2 = appcxt.getBean("map2", Map.class);
        System.out.println(map2);

        Map map3 = appcxt.getBean("map3", Map.class);
        System.out.println(map3);

        Map map4 = appcxt.getBean("map4", Map.class);
        System.out.println(map4);
    }
}
