package com.anurag;


import com.anurag.draw.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        System.out.println(triangle);

        String str = context.getMessage("key1", null, null, null);
        System.out.println("key1="+str);

        String str2 = context.getMessage("key3", new String[]{"arg1","arg2"}, null, null);
        System.out.println("key3="+str2);

    }
}
