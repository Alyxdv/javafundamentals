package com.fundamentals.java;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello Java");
        // houseExample();
        basicLab();
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
