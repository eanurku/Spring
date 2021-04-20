package com.anurag.draw;

import java.util.List;

public class Circle {
    List<Point> points;

    public Circle(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
