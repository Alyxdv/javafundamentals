package com.fundamentals.java;

import java.util.Scanner;

//Conditional Statement
public class Lesson7 {

    public void basicIfStatement(int value1, int value2) {

        System.out.println("Before if statement");
        if (value1 == value2)  { //Can use any relational operators
            System.out.println("Values are equal");
        } //end if
        System.out.println("After if statement");
    }

    public void basicIfElseStatement(int alpha, int beta) {

        System.out.println("Before if statement");
        if (alpha >= beta) {
            System.out.println("Alpha is greater or equal to beta");
        } else { //else is placed directly after the if last bracket.
            System.out.println("Alpha is less than Beta");
        } //end if/else
        System.out.println("After if statement");
    } // end method

    public void mathAndIf(int num1, int num2, int num3) {
        int total = 0;
        if ((num1 > num2) || (num1 > num3) || (num2 > num3) || (num1 == num3) || (num2 == num3)) {
            total = num1 * num2;
        } else {
            total = num1 * num3;
        }
        System.out.println("Total = " +total);
    }

    public String basicIfElseChain(int score) {
        String message = "";
        if(score < 20) {
            message = "Score is less than 20.";
        } else if (score < 30) {
            message = "Score is less than 30 but greater than 19.";
        } else if (score < 40) {
            message = "Score is less than 40 but greater than 29.";
        } else {
            message = "Score is greater than 39.";
        } //end if/else chain

        return message;
    } // end entire chain block method

    public void basicIfAndExample(int value) {
        if (value % 2 == 0&& value <= 30) {
            System.out.println("The value is even and less than or equal to 30.");
        } else {
            System.out.println("The value is odd or more than 30.");
        }
    }

    public void basicIfOrExample(int value) {
        if (value > 100 || value < 50) {
            System.out.println("Value is not between 50 and 100.");
        } else {
            System.out.println("Value is less than 100 and greater than 50.");
        }
    }

    public void basicSwitch(int day) {
        switch (day) {

            case 1:
                System.out.println("Day = 1");
                break;
            case 2:
                System.out.println("Day = 2");
                break;
            case 3:
                System.out.println("Day = 3");
                break;
            case 4:
                System.out.println("Day = 4");
                break;
            default:
                System.out.println("Day is greater than 4");
                break;

        } // end switch
    } // end method

    public void otherSwitch(String day) {
        switch (day) {

            case "Monday":
            case "Tuesday":
                System.out.println("Beginning of the week");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Weekend");
                break;

        } // end switch
    } // end method

    public void anotherSwitch(int day) { /* not a statement but an expression.
    * Updated version, not part of exam.
    * Hover over "switch" to get, or type as normal.*/
        switch (day) {
            case 1, 2 -> System.out.println("Day = 1 or 2");
            case 3, 4 -> System.out.println("Day = 3 or 4");
            default -> System.out.println("Day is greater than 4");
        } // end switch
    } // end method

    public String patternSwitch(int day) {
        return switch(day) {
            case 1, 2 -> "Day is 1 or 2";
            case 3, 4 -> "Day is 3 or 4";
            default -> "Day is greater than 4";
        };

        // Ternary Operator
        //String value = numbers > 10 ? "greater" : "lesser";
        // variable = (condition) ? true : false
    }

}
