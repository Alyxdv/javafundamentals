package com.fundamentals.labs;

import com.fundamentals.java.House;

import java.util.*;

public class CollectionsLab {

    public void taskOne() { // Done!
        List<String> pizzaList = new ArrayList<>();
        pizzaList.add("Pepperoni Lovers");
        pizzaList.add("Hamburger");
        pizzaList.add("Hawaiian");
        pizzaList.add("Meat Lover's");
        pizzaList.add("Supreme");
        pizzaList.add("Veggie Lover's");
        pizzaList.add("Backyard BBQ");
        pizzaList.add("Buffalo Chicken");
        pizzaList.add("Cheese lover's");
        pizzaList.add("Mac and Cheese pizza");

        System.out.println(pizzaList.size());

        for (String pizza : pizzaList) {
            System.out.println(pizza);
        }
    }

    public HashSet<Integer> taskTwo(int numtot) {

        HashSet<Integer> divBy5s = new HashSet<>();

        for (int i = 50; i < numtot; i++) {
            if ((i % 5) == 0) {
                divBy5s.add(i);
            }
        }
        return divBy5s;
    }

    /* I tried to use Long for the key, but I kept getting an error
    * saying the Integer was too long. String was the only thing
    * that would run. Do you have a solution to that issue?*/
    public void taskThree() { // Done!
        Map<String, String> myBooks = new HashMap<>();
        myBooks.put("0142419997", "The Lost years of Merlin");
        myBooks.put("0358653037", "The Lord of the Rings");
        myBooks.put("1442426411", "Alanna: The First Adventure");
        myBooks.put("00060853964", "Good Omens");

        for (Map.Entry<String,String> alpha : myBooks.entrySet()) {
            System.out.println(alpha.getKey()+" - "+alpha.getValue());
        }
    }

}


