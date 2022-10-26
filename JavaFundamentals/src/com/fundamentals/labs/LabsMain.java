package com.fundamentals.labs;

public class LabsMain {

    public static void main(String[] args) {

        // call things here
        // StringsExamples();
        //bNumbersExamples();
        //bOperatorsExamples();
        // conditionExamples();
        //loopLab();
        arrays();
    }

    public static void arrays() {
        ArraysLab examples = new ArraysLab();
        //examples.taskOne();
        examples.taskTwo();
    }

    public static void loopLab() {
        LoopingLab examples = new LoopingLab();
        examples.taskOne();
        //examples.taskTwo();
    }

    public static void conditionExamples() {
        ConditionsLab examples = new ConditionsLab();
        //examples.taskOne("monkey", "pig");
        examples.taskTwo('a');


    }

    public static void OperatorsExamples() {
        OperatorsLab examples = new OperatorsLab();
        //examples.taskOne();
        //examples.taskTwo();
        examples.taskThree();
    }

    public static void NumbersExamples() {

        NumbersLab examples = new NumbersLab();
        examples.numbersOne();
        examples.numbersTwo();
        examples.numbersThree();

    }


}


    //public static void StringsExamples() {
        //StringsLab examples = new StringsLab();
        //examples.labStrings();
        //examples.secondMethod();
    //}

