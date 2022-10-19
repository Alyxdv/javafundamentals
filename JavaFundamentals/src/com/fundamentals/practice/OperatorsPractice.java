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
  /*  public void mathOrder() {
        int total = 10 / (3 + 2) * 4 + 5 * 10 + 6 - 9;
        System.out.println(total);
    }

    public void addTwoNumbers() {
        int sum1, sum2, total;
        System.out.println("Enter two integers to calculate their sum.");
        Scanner in = new Scanner(System.in);
        sum1 = in.nextInt();
        sum2 = in.nextInt();
        total = sum1 + sum2;
        System.out.println(total); */