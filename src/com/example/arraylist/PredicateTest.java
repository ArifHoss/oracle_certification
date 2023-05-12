package com.example.arraylist;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {

        String[] arr = {"*", "**", "***", "****", "*****", "******", "*******", "********", "*********", "**********"};

        Predicate<String> stringPredicate = a -> a.length() < 5;

        print(arr, stringPredicate);
    }

    private static void print(String [] arr, Predicate<String> predicate) {
        for (String str : arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
