package com.spring.tutorialspoint.autowiring.bytype;

import com.spring.tutorialspoint.autowiring.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppAutowiringByType {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringByType.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
        te.spellCheck1();
    }
}
