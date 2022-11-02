package com.fundamentals.practice;

public class Motorboat extends Boat{
    private String engineType;

    public Motorboat() {
        this("Steel", "Grey", 40, "Hydrolic");
    }

    public Motorboat(String materialType, String hullColor, int anchorWeight, String engineType) {
        super(materialType, hullColor, anchorWeight);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void motorMaintenance() {
        System.out.println("Gotta change that oil stuff or something.");
    }

    @Override
    public void anchorFunction() {
        super.anchorFunction();
        System.out.println("It's stuck!! AAAH!");
    }
}