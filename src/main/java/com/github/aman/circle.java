package com.github.aman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class circle implements shape {

    /**
     * Autowired annotation works like:
     * first look for autowiring by type
     * if multiple beans of same type then do autowiring by name
     */
    @Autowired
    @Qualifier("point1")
    private Point center;

    public Point getCenter() {
        return center;
    }


    public void setCenter(Point center) {
        //will throw error at the time when beans are being initialized
        this.center = center;
    }

    public void draw(){
        System.out.println("center is: " + center.getX() + ", " + center.getY());
    }
}
