package com.anurag.draw;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements BeanNameAware {

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
    public void setBeanName(String beanName) {

        System.out.println("bean name is-"+beanName);
    }
}
