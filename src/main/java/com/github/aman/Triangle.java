package com.github.aman;

import java.util.List;

public class Triangle {
    private List<Point> points;

    public void draw(){
        System.out.println("Drawing Triangle");
        for (Point point: points){
            System.out.println(point.getX() + " " + point.getY());
        }
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
