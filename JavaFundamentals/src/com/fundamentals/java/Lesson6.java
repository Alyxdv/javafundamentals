package com.fundamentals.java;

import java.util.Scanner;

/* Using Operators */
public class Lesson6 {

    int value1 = 23, value2 =45;

    public void basicMath() {
        System.out.println(value1 + value2);
        System.out.println(value2 - value1);
        System.out.println(value1 * value2);
        System.out.println(value2 / value1);
    }

    public void exampleModulus() {
        int modulusTotal = value1 % value2;
        System.out.println(modulusTotal);
    }

    public void mathOrder() {
        int total = 256 + 365 / 10 + 89 -16;
        System.out.println(total);
    }

    public void addTwoNumbers() {
        int sum1, sum2, total;
        System.out.println("Enter two integers to calculate their sum.");
        Scanner in = new Scanner(System.in);
        sum1 = in.nextInt();
        sum2 = in.nextInt();
        total = sum1 + sum2;
        System.out.println(total);
    }

    /* Assignment Operators assign new value back to initial value
    * example:
    * value1 = 10; value2 = 9
    * value1 += value2 ( is the same as value1 = value1 + value2)
    * assigns new total back to first value.*/

    public void exampleAssignment() {
        int able = 10, may =15;
        able += may;
        System.out.println(able);
        may -= able;
        System.out.println(may);
        able *= may;
        System.out.println(able);
        able /= may;
        System.out.println(able);
        able %= may;
        System.out.println(able);
    }

    /*Relational Operators*/
    public void exampleRelationalEquals(int echo, int foxtrot) /*values assigned in Main*/ {
        boolean isSample1 = echo == foxtrot;
        boolean isSample2 = echo != foxtrot;
        System.out.println(isSample1);
        System.out.println(isSample2);
    }

    public void exampleRelationalGreater(int golf, int hotel) /*values assigned in Main*/ {
        boolean isActual = golf > hotel;
        boolean isActual2 = golf <= hotel;
        System.out.println(isActual);
        System.out.println(isActual2);
    }

    /*
    * The logical operator && (and) means that both conditions must be true. If the first one is false,
    * the second one is not checked. If the first is false then the second is false, if the second is false,
    * the whole statement is false. Only if both are true, will statement be true.*/
    public void exampleLogicalAnd(int value1, int value2, int value3) {
        boolean logic = value1 != value2 && value3 > value2;
        System.out.println(logic);
    }

    /*The logical operator || (or) means that only 1 condition must be
    * true. If the first condition is true, the second one is not checked. If both are true,
    * Java will never know and will go with first option.*/

    public void exampleLogicalOr(int value1, int value2, int value3) {
        boolean logic = value1 != value2 || value3 > value2;
        System.out.println(logic);
    }

    /* ! = Not: if inside parentheses is true, it will change it to false,
    if it is false, it will flip it to true.*/
    public void exampleLogicalNot(int value1, int value2) {
        boolean answer = !(value1 > value2);
        System.out.println(answer);
    }

    /*Increment means +1 is added.
    * a++ Post-Increment means +1 is added before computation.
    * ++a Pre-Increment means +1 added after computation.
    * Only applied to variables
    * Constants cannot use.
    * Cannot nest both operators.
    * Cannot be applied to variables marked with 'final' keyword.
    * Cannot be applied to boolean.*/
    public void exampleIncrement() {
        int home = 10, jump, car;

        jump = home++;
        System.out.println(jump);

        car = ++home;
        System.out.println(car);
    }

    /*Decrement means -1 is added.
     * a-- Post-decrement means -1 is added before computation.
     * --a Pre-decrement means -1 added after computation.
     * Only applied to variables
     * Constants cannot use.
     * Cannot nest both operators.
     * Cannot be applied to variables marked with 'final' keyword.
     * Cannot be applied to boolean.*/
    public void exampleDecrement() {
        int tom = 10, joe, jerry;

        joe = tom--;
        System.out.println(joe);

        jerry = --tom;
        System.out.println(jerry);
    } // try out 5*10 ++a vs a++ theory
}
