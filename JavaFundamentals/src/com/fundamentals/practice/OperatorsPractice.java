package com.fundamentals.practice;

import java.util.Scanner;

public class OperatorsPractice {

    /*
    * Assigning the below math problem to multiple variables (duplicate it).
    * Use PEMDAS to get the below output.
    * 256 + 365 / 10 + 89 -16
    *
    * answers
    * 243.63
    * 332.65
    * */





    public void mathOrder() {

        float sum1 = 256 + 365 / (10 + 89) - 16;
        double sum2 = 256 + (365 / 10 + 89 - 16);

        System.out.println(sum1);
        System.out.println(sum2);
    }



}
