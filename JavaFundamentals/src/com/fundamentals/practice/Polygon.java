package com.fundamentals.practice;

import java.text.DecimalFormat;

public abstract class Polygon {
    // many sides
    protected static int DEGREES = 180;
    protected int numberOfSides;
    protected double perimeter = 0;


    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    protected double area() {
     double sideLength = (getPerimeter() / numberOfSides);
     double iRadius = .5 * sideLength * (1 / Math.tan(Math.PI / numberOfSides));

     return refineResult(.5 * getPerimeter() * iRadius);
    }

    protected double getPerimeter() {
        return refineResult(perimeter);
    }

    protected double interiorAngleCalc() {
        return (numberOfSides - 2) * DEGREES;
    }

    protected double exteriorAngleCalc() {
        return DEGREES - interiorAngleCalc();
    }

    protected static double refineResult(double value) {
        DecimalFormat decForm = new DecimalFormat("0.00");
        String update = decForm.format(value);
        return Double.parseDouble(update);
    }



}
