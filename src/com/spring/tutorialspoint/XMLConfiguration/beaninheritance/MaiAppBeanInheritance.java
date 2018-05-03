package com.spring.tutorialspoint.XMLConfiguration.beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MaiAppBeanInheritance {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanInheritance.xml");

        HelloWorldParent objA = (HelloWorldParent) context.getBean("helloWorldParent");
        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }
}
