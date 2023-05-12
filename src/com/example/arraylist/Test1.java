package com.example.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();

        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        for (int i = 0; i < dryFruits.size(); i++) {

            if (dryFruits.get(2).equals("Almond")) {
//                dryFruits.remove(new StringBuilder("Almond"));// do nothing
//                dryFruits.remove(new String("Almond")); // remove Almond from list
//                dryFruits.remove("Almond"); // remove Almond
                dryFruits.remove(3);
            }
        }

        dryFruits.forEach(System.out::println);

    }
}
