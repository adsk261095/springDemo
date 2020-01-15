package com.github.aman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class circle implements shape {

    private Point center;

    public Point getCenter() {
        return center;
    }

    @Autowired
    /**
     * Autowired annotation works like autowiring by type
     * therefore we need single beans of that particular type in
     * spring.xml
     */
    public void setCenter(Point center) {
        //will throw error at the time when beans are being initialized
        this.center = center;
    }

    public void draw(){
        System.out.println("center is: " + center.getX() + ", " + center.getY());
    }
}
