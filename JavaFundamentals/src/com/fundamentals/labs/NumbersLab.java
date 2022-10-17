package com.fundamentals.labs;

public class NumbersLab {

    int taskBinary = 0b11101;
    int taskHex = 0x1D;
    int taskOct = 035;

    byte taskByte = 17;
    short taskShort = 8732;
    int taskInt = 29284853;

    double taskDouble = 23.2342;
    float taskFloat = 3234235;
    long taskLong = 233938477;



    public void numbersOne() {

        System.out.println("Binary = " + taskBinary);
        System.out.println("Hexadecimal = " + taskHex);
        System.out.println("Octal = " + taskOct);

    }

    public void numbersTwo() {
        int widening1 = taskByte;
        long widening2 = taskShort;
        float widening3 = taskInt;
        System.out.println("byte to int: " + widening1);
        System.out.println("short to long: " + widening2);
        System.out.println("int to float: " + widening3);
    }

    public void numbersThree() {
        long narrowing1 = (long)taskDouble;
        int narrowing2 = (int)taskFloat;
        short narrowing3 = (short)taskLong;
        System.out.println("double to long: " + narrowing1);
        System.out.println("float to int: " + narrowing2);
        System.out.println("long to short: " + narrowing3);
    }

}