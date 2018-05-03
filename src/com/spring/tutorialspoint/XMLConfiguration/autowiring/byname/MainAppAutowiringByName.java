package com.spring.tutorialspoint.XMLConfiguration.autowiring.byname;

import com.spring.tutorialspoint.XMLConfiguration.autowiring.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppAutowiringByName {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringByName.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
        te.spellCheck1();
    }
}
