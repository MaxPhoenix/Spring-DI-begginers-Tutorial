package com.spring.tutorialspoint.AnotationConfiguration.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppAutowired {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationAutowired.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }

}
