package com.fundamentals.practice;

public class SportsCar extends Car {

    private final String headlightType;

    public SportsCar() throws Exception {
        this("flip up");
    }

    public SportsCar(String headlightType) throws Exception {
        this(2, 20, 450, "Red", headlightType);

    }
     //  this constructor is needed to pass Super from Car to MuscleCar
    public SportsCar(int numberOfDoors, int wheelSize, int horsePower, String exteriorColor, String headlightType) throws Exception {
        super(numberOfDoors, wheelSize, horsePower, exteriorColor);
        this.headlightType = headlightType;
    }

    public void carShape() {
        System.out.println("Sits lower than normal car");
    }

    public String getHeadlightType() {
        return headlightType;
    }
}
