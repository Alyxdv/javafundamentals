package com.fundamentals.java;

public class Condo extends House { //"extends" keyword immediately gives me everything in Superclass
    private String balconyType;


    public String getBalconyType() {
        return balconyType;
    }

    public void setBalconyType(String balconyType) {
        this.balconyType = balconyType;
    }

    public void maintenance() {
        System.out.println("We will fix any issue!");
    }
}
