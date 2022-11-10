package com.fundamentals.java;
/* Enumerations */
public class Lesson16 {
    public enum IceCreamFlavors {VANILLA, CHOCOLATE, STRAWBERRY, ROCKYROAD};

    public void myFavoriteFlavor(IceCreamFlavors flavor) {
        String msg = "My favorite flavor is ";
        switch (flavor) {
            case VANILLA:;
                msg += IceCreamFlavors.VANILLA.toString().toLowerCase();
                break;
            case CHOCOLATE:
                msg += IceCreamFlavors.CHOCOLATE.toString().toLowerCase();
                break;
            case STRAWBERRY:
                msg += IceCreamFlavors.STRAWBERRY.toString().toLowerCase();
                break;
            default:
                msg += IceCreamFlavors.ROCKYROAD.toString().toLowerCase();
                break;
        }
        System.out.println(msg);


    }
}
