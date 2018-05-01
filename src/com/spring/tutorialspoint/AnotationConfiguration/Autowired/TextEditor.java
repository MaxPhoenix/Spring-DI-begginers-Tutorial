package com.spring.tutorialspoint.AnotationConfiguration.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

    //autowiring on properties (setter methods not necessary)
    @Autowired
    private SpellChecker spellChecker;

    //autowiring constructors (ensures that the constructor should be autowired when creating the bean)
//    @Autowired
//    public TextEditor(SpellChecker spellChecker){
//        System.out.println("Inside TextEditor constructor." );
//        this.spellChecker = spellChecker;
//    }

    //Autowiring methods (property tags on xml not necessary)
//    @Autowired
//    public void setSpellChecker( SpellChecker spellChecker ){
//        this.spellChecker = spellChecker;
//    }

    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
