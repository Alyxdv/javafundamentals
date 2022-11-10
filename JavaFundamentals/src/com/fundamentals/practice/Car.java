package com.fundamentals.practice;

public abstract class Car {
    private int numberOfDoors;
    private int wheelSize;
    private int horsePower;
    private String exteriorColor;

    public Car() {
        this(4, 17, 300, "Wood panels");
    }

    public Car(int numberOfDoors, int wheelSize, int horsePower, String exteriorColor) {
        this.numberOfDoors = numberOfDoors;
        this.wheelSize = wheelSize;
        this.horsePower = horsePower;
        this.exteriorColor = exteriorColor;
    }

    public void motion() {
        System.out.println("I move");
    }

    public void motion(int speed) {
        System.out.println(this + " is moving at " + speed + "mph");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public static int verifyNumber(int min, int max, int value) throws Exception {
        if (value >= min && value <= max) {
            return value;
        } else {
            throw new Exception("The value is not within our specs");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
