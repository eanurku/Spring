package com.anurag;

import com.anurag.draw.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        System.out.println(triangle);

    }
}
