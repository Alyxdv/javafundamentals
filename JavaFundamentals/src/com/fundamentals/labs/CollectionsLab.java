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

    public void taskTwo(int numtot) {
        HashSet<Integer> divBy5s = new HashSet<>();


        }

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


   /* Write a method that takes an int parameter. It will have a HashSet return type. The int parameter will
        represent the total capacity of a for loop. The value used should be a minimum of 50. You are going to
        generate a HashSet of Integer values that are divisible by 5 using a for loop. Ensure you create your
        HashSet collection before the for loop. Once you have finished creating it, use the return keyword on
        that collection. Verify your results and include it in your code checkin.

    public ArrayList<House> myHouseList(int count) {
        ArrayList<House> houses = new ArrayList<>();
        for (int i =0; i < count; i++) {               //use this for task 2
            houses.add(i, new House());
        }
        return houses;
    }*/

    /* HashSet */
   /* public void exampleHashSet() {                 // with this one!
        HashSet<String> myHash = new HashSet<>();
        myHash.add("Firecrackers");
        myHash.add("Sparklers");
        myHash.add("Fountains");
        myHash.add("Quarter Stick");
        myHash.add("Smoke Bombs");
        myHash.add("Mortars");

        Iterator<String> init = myHash.iterator();
        while(init.hasNext()) {
            System.out.println(init.next());
        }
        System.out.println();
        for (String fun : myHash) {
            System.out.println(fun.hashCode());
        }
    }*/