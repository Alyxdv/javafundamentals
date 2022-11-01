package com.fundamentals.practice;

public class Motorboat extends Boat{
    private String engineType;


    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void motorMaintenance() {
        System.out.println("Gotta change that oil stuff or something.");
    }

}