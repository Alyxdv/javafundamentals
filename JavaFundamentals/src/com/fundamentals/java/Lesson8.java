package com.fundamentals.java;
// Looping Statements
public class Lesson8 {

    public void basicWhileLoop() {
        //initialized value
        int able = 0;
        //condition / expression
        while(able < 10) {
            //block of code
            System.out.print(able + ", ");
            // increment
            able++;
        } // end while
    } // end method

    public void countdown() {
        int beta = 10;
        while (beta > 0) {
            System.out.print(beta +", ");
            beta--;
        }
    }

    /* Do while loop*/
    public void basicDoWhileLoop(int total) {

        int charlie = 0;
        do {
            if (charlie % 2 == 0) {
                System.out.print(charlie + " ");
            }
            charlie++;
        } while (charlie < total);
        System.out.println(); // keeps it from printing all on one line.
    }

    // For loop
    public void basicForLoop(int total) {
        for (int i = 0; i < total; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public void multiLoop(int totalA, int totalB) {
        for (int i = 0; i < totalA; i++) {
            for (int j = 0; j < totalB; j++) {
                System.out.print(i + "," + j);
            } // end inner loop
        } // end outer loop
    } // end method

    public void forLoopStringExample() {
        System.out.println();
        String delta = "Something";
        for(int i = 0; i < delta.length(); i++) {
            System.out.print(delta.charAt(i) + " ");
        }
        System.out.println();
    }

    public void basicBranchExample() {
        for (int i =0; i < 10; i++) {
            if (i == 2) {
                continue;
            }

            if (i == 4) {
                System.out.println("loop breaks");
                break;
            }

            System.out.println(i);
        }
    }


}
