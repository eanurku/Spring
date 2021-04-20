package com.anurag.draw;

import org.springframework.context.ApplicationContext;

import java.util.List;

public class Triangle {

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
}
