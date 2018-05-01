package com.spring.tutorialspoint.DI.constructorBasedDI;

public class TextEditor {

    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker3) {
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker3;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
