package com.spring.tutorialspoint.XMLConfiguration.lifecyclecallbacks;

import com.spring.tutorialspoint.XMLConfiguration.helloworld.HelloWorld;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppLifeCycleCallbacks {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycleCallbacks.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
