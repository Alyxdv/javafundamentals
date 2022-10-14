package com.fundamentals.practice;

/* Access Modifiers specify accessibility scope.
 *
 * Public means everyone can see it.*/

public class ModifierPractice {

    private int value1 = 345;
    String message = "Hello";
    protected char letter = 'C';

    private void examplePrivate() {
        System.out.println(value1);
    } // end method

    void exampleDefault() {
        System.out.println(value1 + " is private");
    }

    protected void exampleProtected(String name) {
        System.out.println(name);
    }

}
