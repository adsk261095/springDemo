package com.github.aman;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
    public static void main(String[] args) {
//        Triangle triangle = new Triangle();

        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        /**
         * spring bean factory will give
         * me triangle object
         * this object is present in spring container
         * its lifecycle is managed by spring IOC
         */
        Triangle triangle = (Triangle) factory.getBean("triangle");

        triangle.draw();
    }
}
