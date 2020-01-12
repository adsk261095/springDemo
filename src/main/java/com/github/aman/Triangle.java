package com.github.aman;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware {
    private List<Point> points;
    private ApplicationContext context;

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

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public void setBeanName(String beanName) {
        System.out.println("Bean name is : " + beanName);
    }
}
