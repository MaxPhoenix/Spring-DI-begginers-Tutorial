package com.spring.tutorialspoint.autowiring.byname;

import com.spring.tutorialspoint.autowiring.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppAutowiringByName {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringByName.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
