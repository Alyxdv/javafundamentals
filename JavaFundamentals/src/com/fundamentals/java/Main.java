package com.fundamentals.java;

import com.fundamentals.practice.MovieGenres;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // lesson16Example();
        // lesson17Example();
        lesson18Example();
    } // end method

    public static void lesson18Example() {
        Lesson18 my18 = new Lesson18();
        // my18.exampleThrows();
        //my18.sampleThrow(10,0);
        // my18.exampleException();
        my18.myArrayException();
    }

    public static void lesson17Example() {
        Lesson17 seventeen = new Lesson17();
        // seventeen.noLambda();
        // seventeen.withLambda();
        // seventeen.multiplesLambda();
        // seventeen.listLambda();
        // seventeen.filterLambda();
       // seventeen.company1000();
       // seventeen.company2000();
        seventeen.queryInfo(Lesson17.getInfo(), (id -> id.getId() >= 2000));
    }

    public static void lesson16Example() {
        // Access enum from class
        Lesson16 lesson16 = new Lesson16();
        Lesson16.IceCreamFlavors ice = Lesson16.IceCreamFlavors.STRAWBERRY;
        System.out.println(ice);
        lesson16.myFavoriteFlavor(Lesson16.IceCreamFlavors.CHOCOLATE);

        // Access enum from file
        Week myDay = Week.MON;
        System.out.println(myDay);
        myDay.someEnumMethod();
        System.out.println(myDay.getDayNum());

        Week[] days = Week.values();
        for(Week day : days) {
            System.out.println("Week number " + day.getDayNum() + " goes with " + day);
        }

        // Access enum from other package
        MovieGenres[] movie = MovieGenres.values();

        for (MovieGenres genres : movie) {
            //System.out.println(genres + " index of " + genres.ordinal());
            System.out.println("This " + genres + " is rated " + genres.getRating() + " for all movies of this genre");
        }
    }

    public static void lesson15Example() {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        HousePhone phone = new HousePhone(5, 1, numbers, "LCD");
        phone.receiveCall();
        phone.sendCall();
        System.out.println(phone.getScreen() + HousePhone.HASH);
        phone.endCall();
        phone.callerID("Spam", 5838382);

        // Using the Abstract class with Upcasting - Don't do it! Probably.
        AbstractTelephone myTele = new HousePhone(7, 2, numbers, "No screen");
        myTele.sendCall();
        myTele.prankCall(phone);

        // Using the phoneInterface with Upcasting can only pull what little is in interface.
        PhoneInterface myPhone2 = new HousePhone(4, 0 , numbers, "what screen");
        myPhone2.endCall();
        myPhone2.callerID("name", 234);
        System.out.println(PhoneInterface.HASH);

    }

    public static void condoInheritance() {
        Condo myCondo = new Condo();
        //myCondo.setBalconyType("Small balcony");
        myCondo.doorFunction();// from House now overridden
        myCondo.maintenance(); // from Condo
        System.out.println(myCondo.getBalconyType());
        System.out.println(myCondo.getDoorColor());
    }

    public static void encapsulateHouse() {
        House house1 = new House();
        System.out.println(house1.getDoorColor());
        System.out.println(house1.getWindowSize());
        System.out.println(house1.getFoundationType());
        System.out.println(house1.getRoofStyle());

        System.out.println();

        House house2 = new House("Concrete", "Shingle");
        System.out.println(house2.getDoorColor());
        System.out.println(house2.getWindowSize());
        System.out.println(house2.getFoundationType());
        System.out.println(house2.getRoofStyle());

        System.out.println();

        House house3 = new House("Dirt", "Bamboo", "Tan", 30);
        System.out.println(house3.getFoundationType());
        System.out.println(house3.getRoofStyle());
        System.out.println(house3.getDoorColor());
        System.out.println(house3.getWindowSize());
        house3.doorFunction();
        house3.doorFunction("My door opens short and its color is ");

    }

    public static void lesson11Examples() {
        System.out.println(Lesson11.fahrenheitToCelcius(58));
        System.out.println(Lesson11.celciusToFahrenheit(14));
        System.out.println(Lesson11.celsiusToKelvin(30));
        System.out.println(Lesson11.kelvinToCelsius(286.64));
        System.out.println(Lesson11.fahrenheitToKelvin(56));
        System.out.println(Lesson11.kelvinToFahrenheit(335.648));
    }

    public static void companyExample() {
        CompanyInfo info = new CompanyInfo(10101, "Peter Parker");
        //info.id = 10101;
        //info.name = "Peter Parker";
        info.display();
        CompanyInfo.company = "Daily Bugle";
        info.display();
    }

    public static void lesson10Examples() {
        Lesson10 lesson10 = new Lesson10();
        //lesson10.stringArrayList();

        ArrayList<House> houseList = lesson10.myHouseList(5);
        for (House house : houseList) {
            house.doorFunction();
        }

        //lesson10.exampleHashSet();
        //lesson10.exampleHashMap();
        // lesson10.exampleLinkedList();
    }

    public static void lesson9Example() {
        Lesson9 lesson9 = new Lesson9();
        // lesson9.basicIntArray();
        // lesson9.basicStringArray();
        // lesson9.enhancedForArray();
        // lesson9.basicTwoDimensionalArray();
        // lesson9.basicThreeDimensionalArray();
        lesson9.basicJaggedArray();
    }

    public static void lesson8Example() {
        Lesson8 lesson8 = new Lesson8();
        //lesson8.basicWhileLoop();
       // lesson8.countdown();
        lesson8.basicDoWhileLoop(10);
        lesson8.basicForLoop(6);
        lesson8.multiLoop(4, 8);
        lesson8.forLoopStringExample();
        lesson8.basicBranchExample();
    }

    public static void lesson7Example() {
        Lesson7 lesson7 = new Lesson7();
        //lesson7.basicIfStatement(11,11);
        //lesson7.basicIfElseStatement(10, 15);
        //lesson7.mathAndIf(5,20,12);
        //String result = lesson7.basicIfElseChain(15);
        //System.out.println(result); // needed to print the String return.
        //lesson7.basicIfAndExample(19);
        //lesson7.basicIfOrExample(180);
        //lesson7.basicSwitch(3);
        //lesson7.otherSwitch("Friday");
        //System.out.println(lesson7.patternSwitch(3));
    }

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
        //myHouse.doorColor = "Red";
        myHouse.setDoorColor("Red");
        myHouse.doorFunction();

        House otherHouse = new House();
        //otherHouse.doorColor = "Yellow";
        otherHouse.setDoorColor("Yellow");

        //System.out.println(myHouse.doorColor);
        System.out.println(myHouse.getDoorColor());
        //System.out.println(otherHouse.doorColor);
        System.out.println(otherHouse.getDoorColor());

        House thirdHouse = otherHouse;
        //thirdHouse.doorColor = "Blue";
        thirdHouse.setDoorColor("Blue");

        //System.out.println(thirdHouse.doorColor);
        System.out.println(thirdHouse.getDoorColor());
        // System.out.println(otherHouse.doorColor);
        System.out.println(otherHouse.getDoorColor());

            }
    private static void basicLab() {

        System.out.println("This is my first statement.");
        System.out.println("I am new to Java.");
        System.out.println("This Java course is cool.");
        System.out.println("I am learning new stuff every day.");

    }

} // end class
