package com.fundamentals.practice;

public class ElectricGuitar extends Guitar{
    private String jackType;
    private String bodyShape;

    public ElectricGuitar() {
        this("Wood and metal", "nickle", 26, "stereo", "Mockingbird");
    }

    public ElectricGuitar(String bodyMaterial, String stringType, int neckLength, String jackType, String bodyShape) {
        super(bodyMaterial, stringType, neckLength);
        this.jackType = jackType;
        this.bodyShape = bodyShape;
    }

    public String getJackType() {
        return jackType;
    }

    public void setJackType(String jackType) {
        this.jackType = jackType;
    }

    public String getBodyShape() {
        return bodyShape;
    }

    public void setBodyShape(String bodyShape) {
        this.bodyShape = bodyShape;
    }

    @Override
    public void sound() {
        System.out.println("reverb");
    }
}
