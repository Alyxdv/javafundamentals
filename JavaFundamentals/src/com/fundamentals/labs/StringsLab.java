package com.fundamentals.labs;

public class StringsLab {

    String gonnaBeSmall = "THIS WILL BE LOWERCASE!";
    String howLongCanUGo = "This is a long fun thing I'm typing just for no good reason" +
            "yaaaaay!!!!!";

    public void labStrings() {

        String attempt = gonnaBeSmall.toLowerCase();
        char choice = '\u00E6';
        char oneCh = 'A';

        System.out.println(attempt);
        System.out.println(choice);
        System.out.println(oneCh);
        System.out.println(howLongCanUGo.length());

    }
}