package com.fundamentals.practice;

import com.fundamentals.java.Lesson4;

public class PracticeMain {

    public static void main(String[] args) {

        // modifiers();
        // lessonsReference();
        exampleVarargs();
    }

    public static void modifiers() {
        ModifierPractice practice = new ModifierPractice();
        practice.exampleDefault();
        System.out.println(practice.message);

        practice.exampleProtected("Matt");
        System.out.println(practice.letter);
    }

    public static void lessonsReference() {
        Lesson4 lesson4 = new Lesson4();
        lesson4.sampleMethods();
    }

    public static void exampleVarargs() {
        singleVararg("Happy", "Thursday", "Weekend");
        singleVararg("Try me");
        singleVararg();
    }

    public static void singleVararg(String... value) {
        //System.out.println(value[0]);
        for(String s : value) { // how to get the output for vararg | ":" = "in"
            System.out.println(s);
        } // end for
    } // end method

}
