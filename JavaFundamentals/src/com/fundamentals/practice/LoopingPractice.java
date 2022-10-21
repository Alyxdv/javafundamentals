package com.fundamentals.practice;

public class LoopingPractice {

    /*
    * Write a loop with a total amount of 100.
    * Print out all the numbers divisible by 5.*/

    public void divBy5(int total) {

        int divby = 0;
        do {
            if (divby % 5 == 0) {
                System.out.print(divby + " ");
            }
            divby++;
        } while (divby < total);
    }

    public void loopPrime() {
        System.out.println();
        int counter;
        for (int i = 0; i <= 100; i++) {
            counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(i+ " ");
            }
        }
    }

}
