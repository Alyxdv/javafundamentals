package com.fundamentals.java;

public class Lesson18 {

    House ranch;

    public void exampleThrows() throws NullPointerException {
        System.out.println(ranch.getWindowSize());
    }

    public void sampleThrow(int value1, int value2) {
        if(value2 != 0) {
            System.out.println(value1 / value2);
        } else {
            throw new ArithmeticException("Can't divide by zero");
        }
    }

    public void exampleException() {
        try {
            System.out.println(ranch.getWindowSize());
        } catch (NullPointerException ex) {
            System.out.println("A null pointer was called " + ex.getMessage());
        } finally {
            System.out.println("The finally block was called.");
        }
    }

    public void myArrayException() {
        String[] names = {"David", "Jody", "Kate"};
        String[] values = {"243", "424", " 542"};
        try {
            byte b = Byte.parseByte(values[1]);
            System.out.println(b);
        } catch(IndexOutOfBoundsException ex) {
            System.out.println("Please provide at least 1 argument");
        } catch(NumberFormatException ed) {
            System.out.println("That is not a number"); // Answer to round 1
        } catch(StackOverflowError e) {
            System.out.println("You have given me more than a byte");
        } catch(Exception ea) {
            System.out.println("I dunno what you did " + ea.getMessage());
        }
    }

}
