package com.fundamentals.practice;

public class Boat {
    private String materialType;
    private String hullColor;
    private int anchorWeight;

    public Boat() {
        // Default constructor
        this("Rubber", "Orange", 10);
    }

    public Boat(String hullColor, int anchorWeight) {
        this("Steel", hullColor, anchorWeight);
    }

    public Boat(String materialType, String hullColor, int anchorWeight) {
        this.materialType = materialType;
        this.hullColor = hullColor;
        this.anchorWeight = anchorWeight;
    }


    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getHullColor() {
        return hullColor;
    }

    public void setHullColor(String hullColor) {
        this.hullColor = hullColor;
    }

    public int getAnchorWeight() {
        return anchorWeight;
    }

    public void setAnchorWeight(int anchorWeight) {
        this.anchorWeight = anchorWeight;
    }

    public void anchorFunction() {
        System.out.println("Weigh anchor!");
    }


}
