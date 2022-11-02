package com.fundamentals.practice;

public class Ukulele extends Guitar{
    private int bodySize;
    private int stringQuantity;

    public Ukulele() {
        this("Wood", "Nylon", 22, 50, 4);
    }

    public Ukulele(String bodyMaterial, String stringType, int neckLength, int bodySize, int stringQuantity) {
        super(bodyMaterial, stringType, neckLength);
        this.bodySize = bodySize;
        this.stringQuantity = stringQuantity;
    }

    public int getBodySize() {
        return bodySize;
    }

    public void setBodySize(int bodySize) {
        this.bodySize = bodySize;
    }

    public int getStringQuantity() {
        return stringQuantity;
    }

    public void setStringQuantity(int stringQuantity) {
        this.stringQuantity = stringQuantity;
    }

    public void noteRange(String range) {
        System.out.println(range);
    }

    @Override
    public void tuning() {
        System.out.println("GCEA");
    }
}
