package com.spring.tutorialspoint.XMLConfiguration.scopes;

import com.spring.tutorialspoint.XMLConfiguration.helloworld.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppSingleton {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ScopeSingleton.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.setMessage("I'm object A");
        objA.getMessage();

        //Catches the objA cached object
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        //Since it's the same instance of the HelloWorld class as objA (singleton), it has the same message as objA
        objB.getMessage();

        objB.setMessage("OBJB I'm object B");

        //Now both objects have the same message as they are the same instance of the HelloWorld class
        objB.getMessage();
        objA.getMessage();
    }
}