package com.fundamentals.labs;

import java.util.Scanner;

public class ConditionsLab {

    public void taskOne(String monkey, String pig) {
        // Please add "monkey" and "pig" to main.
        String option;
        System.out.println("Please type either \"monkey\" or \"pig\"");
        Scanner in = new Scanner(System.in);
        option = in.next();
        if (option.equalsIgnoreCase(monkey)) {
            System.out.println("Hoo Hoo Ah Ah! @(*-*)@ ");
        } else if (option.equalsIgnoreCase(pig)){
            System.out.println("Oink! (^(00)^)");
        } else if (option != pig) {
            System.out.println("Please follow directions. :( ");
        }
    }

    /* Another option for Task One if you want to choose your own values */
    public void taskOneV2(String alpha, String beta) {
        if (alpha.equals(beta)) {
            System.out.println("It's the same!");
        } else {
            System.out.println("Not same.");
        }
    }

    public void taskTwo(char grade) {
        switch (grade) {
            case 'E':
                System.out.println("Excellent Grade");
                break;
            case 'V':
                System.out.println("Very Good Grade");
                break;
            case 'G':
                System.out.println("Good Grade");
                break;
            case 'A':
                System.out.println("Average Grade");
                break;
            case 'F':
                System.out.println("Failed Grade");
                break;
            default:
                System.out.println("Not a valid grade.");
        }
    }

}