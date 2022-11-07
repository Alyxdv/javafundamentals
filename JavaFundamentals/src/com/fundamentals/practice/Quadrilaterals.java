package com.fundamentals.practice;

import java.text.DecimalFormat;

public abstract class Quadrilaterals extends Polygon{
    private double lengthA;
    private double lengthB;
    private double lengthC;
    private double lengthD;

    public Quadrilaterals() {
        super(4);
    }

    public double getLengthA() {
        return lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public double getLengthC() {
        return lengthC;
    }

    public double getLengthD() {
        return lengthD;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }

    public void setLengthD(double lengthD) {
        this.lengthD = lengthD;
    }

    @Override
    public double getPerimeter() {
        return refineResult(numberOfSides * lengthA);

    }

    protected static double refineResult(double value) {
        DecimalFormat decForm = new DecimalFormat("0.00");
        String update = decForm.format(value);
        return Double.parseDouble(update);
    }
}
