package com.anurag;

import com.anurag.draw.Point;
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
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        Point pointA = (Point) context.getBean("pointA");
        System.out.println(pointA.toString());

        Triangle triangleParent = (Triangle) context.getBean("triangle-parent");
        System.out.println(triangleParent.toString());

        Triangle triangle = (Triangle) context.getBean("triangle");
        System.out.println(triangle.toString());
    }
}
