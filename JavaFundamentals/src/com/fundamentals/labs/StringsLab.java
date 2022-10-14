package com.fundamentals.labs;

public class StringsLab {

    String gonnaBeSmall = "THIS WILL BE LOWERCASE!";
    String howLongCanUGo = "This is a long fun thing I'm typing just for no good reason" +
            "yaaaaay!!!!!";
    String jackAndJill = "Jack and Jill went up the hill\n to fetch a pail of water.\nJack fell down and " +
            "broke his crown\nAnd Jill came tumbling after.";

    public void labStrings() {

        myMethod("This is for the lab:");


    }

    public void myMethod(String task1) {
        String attempt = gonnaBeSmall.toLowerCase();
        char choice = '\u00E6';
        char oneCh = 'A';
        System.out.println(task1 + attempt);
        System.out.println(task1 + howLongCanUGo.length());
        System.out.println(task1 + choice);
        System.out.println(task1 + oneCh);

    }

    public void secondMethod() {
        String song = jackAndJill;
        System.out.println(song);

    }

}