package com.fundamentals.labs;

public class LoopingLab {

    public void taskOne() {
        int val = 0;
        while(val <= 15) {
            System.out.println(val);
            val++;
            if (val == 5) {
                System.out.println("five");
                continue;
            }
            if (val == 10) {
                System.out.println("Ten");
                continue;
            }
            if (val == 15) {
                System.out.println("Fifteen");
                break;
            }
        }

    }

    public void taskTwo() {
        for (int i = 0; i < 30; i++) {
            if ((i % 3) == 0 ) {
                System.out.println(i);
            }
        }
    }

}