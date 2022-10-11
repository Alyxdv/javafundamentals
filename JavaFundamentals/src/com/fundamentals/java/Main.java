package com.fundamentals.java;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello Java");
        //houseExample();
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

    public static void basicLab() {



    }
} // end class
