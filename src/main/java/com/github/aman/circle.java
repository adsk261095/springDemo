package com.github.aman;

public class circle implements shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw(){
        System.out.println("center is: " + center.getX() + ", " + center.getY());
    }
}
