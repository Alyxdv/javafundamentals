package com.fundamentals.labs;

public class LambdaLab {
    public void daLambda() {
        SimpleMultiplicationInterface task2 = (num1, num2, num3) -> (num1 * num2 * num3);
        System.out.println(task2.multiplyThree(5, 9, 13));
    }
    }
