package com.fundamentals.practice;

public class EquilateralTriangle extends Triangle implements HeightInterface{

    public EquilateralTriangle(double length) {
        sideA = length;
        sideB = length;
        sideC = length;
    }

    @Override
    public double getHeight() {
        return refineResult(Math.sqrt(Math.pow(sideB, 2) - (Math.pow(sideA / 2,2))));
    }

    @Override
    protected double area() {
        System.out.println(super.area());
        return refineResult(.5 * sideA * getHeight());
    }
}
