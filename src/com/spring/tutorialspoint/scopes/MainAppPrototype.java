package com.spring.tutorialspoint.scopes;

import com.spring.tutorialspoint.helloworld.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppPrototype {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ScopePrototype.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.setMessage("I'm object A");
        objA.getMessage();

        //Creates another instance of the HelloWorld class, since it has a protoype scope
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        //default message "Hello World!
        objB.getMessage();

        objB.setMessage("OBJB I'm object B");

        //Different messages as they are diferent instances of the HelloWolrd class

        objB.getMessage();
        objA.getMessage();
    }

}
