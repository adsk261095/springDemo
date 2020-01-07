package com.github.aman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
//        Triangle triangle = new Triangle();


//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//        /**
//         * spring bean factory will give
//         * me triangle object
//         * this object is present in spring container
//         * its lifecycle is managed by spring IOC
//         */
//        Triangle triangle = (Triangle) factory.getBean("triangle");

        /**
         * we need to move spring.xml to the class path
         * in resorces in case of maven project
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");

        triangle.draw();
    }
}
