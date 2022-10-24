package com.fundamentals.labs;

import java.util.Scanner;

public class OperatorsLab {

    public void taskOne() {
        int totalOne = 10 + 32 * 12 / 3;
        int totalTwo = (10 + 32) * 12 / 3;

        System.out.println(totalOne);
        System.out.println(totalTwo);
    }

    public void taskTwo(int alpha, int beta) {

        alpha += beta;
        System.out.println(alpha);
        beta *= alpha;
        System.out.println(beta);
        beta %= alpha;
        System.out.println(beta);

    }

    public void taskThree() {
        int local = 5, numIn, total;

        System.out.println("Enter one integer to calculate modulus value.");
        Scanner in = new Scanner(System.in);
        numIn = in.nextInt();
        total = numIn % local;
        System.out.println(total);

    }

}
