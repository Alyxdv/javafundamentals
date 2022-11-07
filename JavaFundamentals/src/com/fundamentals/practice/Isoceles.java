package com.fundamentals.practice;

import java.text.DecimalFormat;

public class Isoceles extends Triangle{
    public Isoceles(double side2, double side1) {
        sideA = side2;
        sideB = side2;
        sideC = side1;
    }

    @Override
    public double getHeight() {
        return refineResult(Math.sqrt(Math.pow(sideA, 2) - (Math.pow(sideC,2)/4)));
    }

    @Override
    protected double area() {
        return refineResult((sideC * getHeight()) / 2);
    }
}
