package com.spring.tutorialspoint.autowiring;

public class TextEditor {

    private SpellChecker spellChecker;
    private SpellChecker spellChecker1;
    private Printer printer;
    private String name;

    public void setSpellChecker( SpellChecker spellChecker ){ this.spellChecker = spellChecker; }
    public SpellChecker getSpellChecker() { return spellChecker; }

    public void setSpellChecker1( SpellChecker spellChecker ){ this.spellChecker1 = spellChecker; }
    public SpellChecker getSpellChecker1() { return spellChecker1; }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void spellCheck() { spellChecker.checkSpelling(); }
    public void spellCheck1() { spellChecker1.checkSpelling(); }

    public Printer getPrinter() { return printer; }
    public void setPrinter(Printer printer) { this.printer = printer; }
}
