package com.fundamentals.java;

public class Main {

    public static void main(String[] args) {
        //lesson5Example();
        // System.out.println("Hello Java");
        // houseExample();
        // lesson3Example();
        // lesson4Example();
        // modifierExample();
        lesson6Example();
    } // end method

    public static void lesson6Example() {
        Lesson6 lesson6 = new Lesson6();
       // lesson6.basicMath();
       // lesson6.exampleModulus();
        lesson6.mathOrder();
       // lesson6.addTwoNumbers();
       // lesson6.exampleAssignment();
       // lesson6.exampleRelationalEquals(12, 13);
       // lesson6.exampleRelationalGreater(11,11);
       // lesson6.exampleLogicalAnd(5, 7, 9);
       // lesson6.exampleLogicalOr(10,10,5);
        // lesson6.exampleLogicalNot(10, 15);
       // lesson6.exampleIncrement();
       // lesson6.exampleDecrement();
    }

    public static void lesson5Example() {
        //Lesson5 lesson5 = new Lesson5();
       // lesson5.localDateTimeExample();
       // lesson5.localEpochExample();
        //lesson5.localDateParseExample();
       // lesson5.localDateExample();
        // lesson5.epochDateExample();
        //lesson5.epochBDayTrial();
       // lesson5.localTimeExample();
        // lesson5.bornDateFormatter();
        //lesson5.timePeriodExample();
    }

    public static void modifierExample() {
        //practice.exampleProtected("Matt"); // cannot access because of protected modifer
    }


    public static void lesson4Example() {
        // Lesson4 myLesson4 = new Lesson4();
        //myLesson4.numericExamples();
        //myLesson4.exponentExample();
        // myLesson4.exampleImplicit();
        // myLesson4.exampleExplicit();
        // myLesson4.sampleMethods();
    }

    public static void lesson3Example() {
        //Lesson3 myLesson3 = new Lesson3();
        //myLesson3.exampleString();
        // myLesson3.exampleCharAt();
        // myLesson3.exampleConcat();
        // myLesson3.exampleEquals();
        //myLesson3.exampleLower();
        //myLesson3.exampleUpper();
        //myLesson3.exampleLength();
        //System.out.println(myLesson3.exampleReplace());
        //myLesson3.exampleBuilder("Ravioli", 18);
        //myLesson3.exampleChar();
        //myLesson3.exampleEscape();
    } // end method

    /*
    * This is just me trying out the multi-lined comment.
    * */
    public static void houseExample() {
        House myHouse = new House();
        myHouse.doorColor = "Red";
        myHouse.doorFunction();

        House otherHouse = new House();
        otherHouse.doorColor = "Yellow";

        System.out.println(myHouse.doorColor);
        System.out.println(otherHouse.doorColor);

        House thirdHouse = otherHouse;
        thirdHouse.doorColor = "Blue";

        System.out.println(thirdHouse.doorColor);
        System.out.println(otherHouse.doorColor);

            }
    private static void basicLab() {

        System.out.println("This is my first statement.");
        System.out.println("I am new to Java.");
        System.out.println("This Java course is cool.");
        System.out.println("I am learning new stuff every day.");

    }

} // end class
