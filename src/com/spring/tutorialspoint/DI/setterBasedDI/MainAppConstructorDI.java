package com.spring.tutorialspoint.DI.setterBasedDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppConstructorDI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SetterBasedDI.xml");

        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
