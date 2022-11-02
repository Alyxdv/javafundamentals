package com.fundamentals.java;

public class Condo extends House { //"extends" keyword immediately gives me everything in Superclass
    private String balconyType;

    public Condo() {
        this("Wood", "flat", "Red", 28, "Railed");
    }

    public Condo(String foundationType, String roofStyle, String balconyType) {
        this(foundationType, roofStyle, "red", 28, balconyType);

    }

    public Condo(String foundationType, String roofStyle, String doorColor, int windowSize, String balconyType) {
        super(foundationType, roofStyle, doorColor, windowSize);
        this.balconyType = balconyType;
    }


    public String getBalconyType() {
        return balconyType;
    }

    public void setBalconyType(String balconyType) {
        this.balconyType = balconyType;
    }

    public void maintenance() {
        System.out.println("We will fix any issue!");
    }

    @Override
    public void doorFunction() {
        super.doorFunction(); // can be called in any method. Calls parent function, even after overridden.
        System.out.println("My Condo door slides open and closed.");
    }
}
