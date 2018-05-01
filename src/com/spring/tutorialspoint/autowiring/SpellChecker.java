package com.spring.tutorialspoint.autowiring;

public class SpellChecker {

    private static int spellCheckerCounter = 0;
    public SpellChecker() {
        System.out.println("Inside SpellChecker constructor. " + spellCheckerCounter++);
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }
}
