package com.github.aman;

import org.springframework.beans.factory.annotation.Required;

public class circle implements shape {

    private Point center;

    public Point getCenter() {
        return center;
    }
    @Required
    public void setCenter(Point center) {
        //will throw error at the time when beans are being initialized
        this.center = center;
    }

    public void draw(){
        System.out.println("center is: " + center.getX() + ", " + center.getY());
    }
}
