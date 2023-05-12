package com.example.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListArrayConversion {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");
//        for (int i = 0; i < dryFruits.size(); i++) {
//            if (i == 0) {
//                dryFruits.remove(new StringBuilder("Walnut"));
//            }
//        }

        for (String fruit : dryFruits) {
            if (fruit== "Walnut") {
                dryFruits.remove("Almond");
            }
        }
        System.out.println(dryFruits);
    }
}
