package com.fundamentals.java;

/* Primitive Data Types */
/* Primitive data types don't share state like objects. */

public class Lesson4 {

    /* This primitive type has a value range of
    * -128 to 127 */
    byte myByte = 9;

    /* This primitive type has a value range of
    * -32768 to 32767 */
    short myShort = 235;

    /* (Default) This primitive type has a value range of
    * -2,147,483,648 to 2,147,483,647 */
    int myInt = 2354;

    /* This primitive type has a value range of
    * -9,223,372,036,854,774,808 to 9,223,372,036,854,775,807 */
    long myLong = 56864L;

    /* This primitive type has a value range of
    * 3.4E-38 to 3.4E+38*/
    float myFloat = 34.53f;

    /* (Default) This primitive type has a value range of
    * 1.7E-308 to 1.7E+308 */
    double myDouble = 84.98d;
    double myOther = 36.43; // can be used without the d on the end because is default.

    /* Numeric Systems*/

    // Decimal value of 26
    int myDecimal = 26;

    // Hexadecimal value of 26
    int myHexadecimal = 0x1a;

    // Binary value of 26
    int myBinary = 0b11010;

    // Octal value of 26
    int myOctal = 032;

    public void numericExamples() {
        System.out.println("Decimal "+myDecimal);
        System.out.println("Hexadecimal "+myHexadecimal);
        System.out.println("Binary "+myBinary);
        System.out.println("Octal "+myOctal);
    }

    // Scientific notation
    double myExponent = 23.65E8;
    double myOtherExponent = 10E-3;

    public void exponentExample() {
        System.out.println(myExponent);
    }

    // using underscores to make the number readable
    long usingUnderscores = 4_568_987_367L;

    // This method shows method scope
    public void showLocalExample() {
        int able = 20;
        System.out.println(able);
    }

    /* Data Type Conversion is the concept of converting
    * between different primitive data types
    * when going from a floating point to an integer,
    * there is no rounding. The value is truncated*/

    /* Implicit or Widening type conversion is done when
    * two data types automatically convert.*/
    public void exampleImplicit() {
        long sample = myInt;
        float sampleFloat = myLong;
        System.out.println("Sample = " + sample);
        System.out.println("SampleFloat = "+sampleFloat);
    }

    /* Explicit or Narrowing type conversion is done when two
    * data types concert, but require direct boxing effect. This is because
    * a larger data type is converted to a smaller one, which will
    * have precision loss.
    * */

    public void exampleExplicit() {
        long sample2 = (long)myDouble;
        int sample3 = (int)usingUnderscores;
        System.out.println(sample2);
        System.out.println(sample3);
    }

    public void sampleMethods() {
        int able = 5;

        int something = Integer.parseInt("32");
        System.out.println(something);
        byte max = Byte.MAX_VALUE;
        System.out.println(max);
    }



} // end class
