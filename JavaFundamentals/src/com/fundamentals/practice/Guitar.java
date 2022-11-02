package com.fundamentals.practice;

public class Guitar {
    private String bodyMaterial;
    private String stringType;
    private int neckLength;

    public Guitar() {
        this("Wood", "Steel", 25);
    }

    public Guitar(String bodyMaterial, String stringType, int neckLength) {
        this.bodyMaterial = bodyMaterial;
        this.stringType = stringType;
        this.neckLength = neckLength;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public String getStringType() {
        return stringType;
    }

    public void setStringType(String stringType) {
        this.stringType = stringType;
    }

    public int getNeckLength() {
        return neckLength;
    }

    public void setNeckLength(int neckLength) {
        this.neckLength = neckLength;
    }

    public void tuning() {
        System.out.println("EADGB");
    }

    public void tuning(String alternate) {
        System.out.println(alternate);
    }

    public void sound() {
        System.out.println("Acoustic twang");
    }

    public void sound(String retune) {
        System.out.println(retune);
    }
}
