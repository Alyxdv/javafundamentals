package com.fundamentals.practice;

import java.text.DecimalFormat;

public abstract class Triangle extends Polygon{

    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle() {
        super(3);
    }

    @Override
    protected double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public abstract double getHeight();

    protected static double refineResult(double value) {
        DecimalFormat decForm = new DecimalFormat("0.00");
        String update = decForm.format(value);
        return Double.parseDouble(update);
    }

}
