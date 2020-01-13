package com.github.aman;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle{
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

    public void cleanUp() throws Exception {
        System.out.println("called after bean is initialized");
    }

    public void myInit() throws Exception {
        System.out.println("called before bean is initialized");
    }
}
