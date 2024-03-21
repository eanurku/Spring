package com.anurag.draw;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware {

    List<Point> points;
    ApplicationContext applicationContext;


    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "points=" + points +
                '}';
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setting application context in triangle");
        this.applicationContext=applicationContext;

        Triangle triangle = (Triangle) this.applicationContext.getBean("triangle");
        System.out.println(triangle);
    }
}
