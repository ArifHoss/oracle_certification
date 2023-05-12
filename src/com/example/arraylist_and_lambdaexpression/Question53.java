package com.example.arraylist_and_lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class Question53 {
    public static void main(String[] args) {
        Integer i = 10;

        List<Integer> list = new ArrayList<>();

        list.add(i);
        list.add(new Integer(i));
        list.add(i);
//        list.removeIf(i -> i == 1);
        // will throw error: java: variable i is already defined in method main(java.lang.String[])

        System.out.println(list);

    }
}
