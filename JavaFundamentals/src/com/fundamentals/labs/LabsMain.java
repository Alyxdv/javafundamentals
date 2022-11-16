package com.fundamentals.labs;

public class LabsMain {

    public static void main(String[] args) {

        // call things here
        // StringsExamples();
        // NumbersExamples();
        // OperatorsExamples();
        // conditionExamples();
        // loopLab();
        // arrays();
        // collections();
        // tvLab();
        lambdaLab();
    }

    public static void lambdaLab() {
        LambdaLab trial = new LambdaLab();
        trial.daLambda();
    }

    public static void tvLab() {
        Television trials = new Television(42, 580.99);
        trials.turnOn();
    }

    public static void collections() {
        CollectionsLab examples = new CollectionsLab();
        //examples.taskOne();
        examples.taskTwo(100);
        //examples.taskThree();
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

