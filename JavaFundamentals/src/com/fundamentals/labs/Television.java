package com.fundamentals.labs;

public class Television {
    private int screenSize;
    private double price;
    private int numPorts;
    private boolean isMountable;

    public Television(int screenSize, double price, int numPorts, boolean isMountable) {
        this.screenSize = screenSize;
        this.price = price;
        this.numPorts = numPorts;
        this.isMountable = isMountable;
    }

    public Television(int screenSize, double price) {
        this(screenSize, price, 4, true);

    }


    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumPorts() {
        return numPorts;
    }

    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }

    public boolean isMountable() {
        return isMountable;
    }

    public void setMountable(boolean mountable) {
        isMountable = mountable;
    }

    public void turnOn() {
        System.out.println("The" + screenSize + "TV is on.");
    }
}
