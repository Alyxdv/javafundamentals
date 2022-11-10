package com.fundamentals.practice;

public class Parallelogram extends Quadrilaterals  implements HeightInterface{


    public Parallelogram(double length, double width) {
        this.setLengthA(length);
        this.setLengthB(length);
        this.setLengthC(width);
        this.setLengthD(width);
    }

    @Override
    protected double area() {
        // TODO Base * Height;
        // a b sin A = b a sin B
        //A = 45 B = 135
        return refineResult(getLengthA() * getLengthC() * Math.sin(45));
    }

    @Override
    public double getPerimeter() {
        return refineResult(2 * (getLengthA() + getLengthC()));
    }

    @Override
    public double getHeight() {
        return refineResult(area() / getLengthC());
    }
}
