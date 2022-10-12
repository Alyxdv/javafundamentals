package com.fundamentals.java;

/*
* All about Strings
* Strings are objects that make them immutable.
* Immutable means that once a string object is created,
* its data and state cannot be change.
* A new oject will be created instead.
 */

public class Lesson3 {

    // String class fields (attributes)
    String myString = "LaMars";
    String myOther = "LaMars";
    String javaNote = "Java is a programming language. Java is everywhere.";

    /* both strings above point to the same reference in the memory heap
    * instead of being two different objects.
    **/
    String sampleString = new String("LaMars");


    public void exampleString() {
        // Assign a new reference to the class field.
        String beta = myString;

        // A new string object is created to combine these below
        myString = myString + " Donuts";
        System.out.println(myString);
        System.out.println(beta);
    }

    /*
    * String methods that can be accessed through the reference variable.
     */

    /* The charAt method returns the char value based on the index position*/

    public void exampleCharAt() {
        char myChar = javaNote.charAt(3);
        char example2 = javaNote.charAt(4);
        char example3 = javaNote.charAt(5);
        System.out.println("First "+ myChar);
        System.out.println("Second "+ example2);
        System.out.println("Third " + example3);
    } // end method

    /* The concat method joins two strings together based on concatenation*/
    public void exampleConcat() {
        String myDonut = myString.concat(" Donuts");
        System.out.println(myDonut);
    } // end method

    /* The equals method compares a string to a specified object. */
    public void exampleEquals() {
        boolean myBool = myString.equals("LaMars");
        System.out.println(myBool);

        boolean otherBool = myString.equals(sampleString);
        System.out.println(otherBool);
    } // end method

    /* The toLower and toUpper will change the whole string
    * to either upper or lower case.
     */

    public void exampleLower() {
        String able = javaNote.toLowerCase();
        System.out.println(able);
    } //end method

    public void exampleUpper() {
        String beta = javaNote.toUpperCase();
        System.out.println();
    } //end method

    /* The length method will return the size of the string
    * Including any empty spaces*/

    public void exampleLength() {
        System.out.println(javaNote.length());
    } //end method

    /* The replace method will replace all instances of
    * a set of characters to another set of characters */

    public String exampleReplace() {
        return javaNote.replace("Java", "Lava");
    } // end method

    /*
    * String Builder allows you to join objects or primitives together
    * into a kind of list, which you can change back to a string object
    * using the toString method */
    public void exampleBuilder(String food, int quantity) {
        StringBuilder builder = new StringBuilder();
        builder.append("My favorite food is ");
        builder.append(food).append(" and I ate ")
                .append(quantity).append(" plates of it");
        String fav = builder.toString();
        System.out.println(fav);
    } //end method

    /*
    * A Char is a single character primitive data type
    * */
    public void exampleChar() {
        char letter = 't';
        char uniCharacter = '\u00C6';
        String test = "Something " + uniCharacter;
        System.out.println(letter);
        System.out.println(uniCharacter);
        System.out.println(test);
    } //end method

    /*
    * Escape sequences allow you to escape characters that are used in code
    * (such as apostrophes, slashes, etc)*/
    public void exampleEscape() {
        System.out.println("My teacher's name is Roger O\'Dell. \tHis birthday\n was last week.");
        System.out.println("I like to write\\ code. Happy\b day\"s are here.");
    } // end method



} // end class
