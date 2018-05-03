package com.spring.tutorialspoint.XMLConfiguration.autowiring.byconstructor;

import com.spring.tutorialspoint.XMLConfiguration.DI.constructorBasedDI.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppAutowiringByConstructor {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringByConstructor.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
