package com.fundamentals.practice;

import com.fundamentals.java.Lesson4;

public class PracticeMain {

    public static void main(String[] args) {

        // modifiers();
        // lessonsReference();
        //exampleVarargs();
        //operators();
        // loopPractice();
        // beer();
        // boat();
        // dogRecord();
        // motorboatBaby();
        // polyShapes();
        carStuff();

    }
    // inheritance demo
    public static void carStuff() {
        SportsCar theCar = new SportsCar();
        theCar.carShape();
        theCar.setExteriorColor("White");
        theCar.setHorsePower(300);
        theCar.setWheelSize(17);

        MuscleCar myCar = new MuscleCar();
        myCar.carShape(); // parent
        myCar.motion(); // grand parent
        myCar.setExteriorColor("Black");
        myCar.setHorsePower(500);
        myCar.setWheelSize(20);

    }

    public static void polyShapes() {
        Pentagon pent1 = new Pentagon();
        double angle1 = pent1.interiorAngleCalc();
        System.out.println(angle1);

        Hexagon hex1 = new Hexagon();
        double angle2 = hex1.interiorAngleCalc();
        System.out.println(angle2);

        Polygon poly1 = new Pentagon(); // type casting
        double angle3 = poly1.interiorAngleCalc();
        System.out.println(angle3);
    }

    public static void motorboatBaby() {
        Motorboat myMotorboat = new Motorboat();
        myMotorboat.motorMaintenance();
        myMotorboat.setEngineType("Hydrolic");
        System.out.println(myMotorboat.getEngineType());
    }

    public static void dogRecord() {
        Dog myDog = new Dog(3, "Lab", 8);
        System.out.println(myDog.breed());
        myDog.move();
    }

    public static void boat() {
        Boat firstBoat = new Boat();
        System.out.println("First Boat");
        firstBoat.anchorFunction();
        System.out.println("Material Type: " +firstBoat.getMaterialType());
        System.out.println("Hull Color: " +firstBoat.getHullColor());
        System.out.println("Anchor Weight: " +firstBoat.getAnchorWeight());

        System.out.println();

        Boat secondBoat = new Boat("Blue", 75);
        System.out.println("Second Boat");
        secondBoat.anchorFunction();
        System.out.println("Material Type: " +secondBoat.getMaterialType());
        System.out.println("Hull Color: " +secondBoat.getHullColor());
        System.out.println("Anchor Weight: " +secondBoat.getAnchorWeight());

        System.out.println();

        Boat myBoat = new Boat("Wood", "Red", 50);
        System.out.println("My Boat");
        myBoat.anchorFunction();
        System.out.println("Material Type: " +myBoat.getMaterialType());
        System.out.println("Hull Color: " +myBoat.getHullColor());
        System.out.println("Anchor Weight: " +myBoat.getAnchorWeight());
    }

    public static void beer() {
        BottlesOfBeer beer = new BottlesOfBeer();
        beer.beerSong();
    }

    public static void loopPractice() {
        LoopingPractice practice = new LoopingPractice();
       // practice.divBy5(100);
       // practice.loopPrime();
       // practice.fib();

    }

    public static void operators() {
        OperatorsPractice practice = new OperatorsPractice();
      practice.mathOrder();
    }

    //public static void modifiers() {
       // ModifierPractice practice = new ModifierPractice();
       // practice.exampleDefault();
       // System.out.println(practice.message);

        //practice.exampleProtected("Matt");
       // System.out.println(practice.letter);


   // public static void lessonsReference() {
       // Lesson4 lesson4 = new Lesson4();
        //lesson4.sampleMethods();
    }


