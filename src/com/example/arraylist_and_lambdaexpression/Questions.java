package com.example.arraylist_and_lambdaexpression;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Questions {
    public static void main(String[] args) {

        // Question 46:
        System.out.println("Question 46");
        String[] arr01 = {"A", "ab", "bab", "Ab", "bb", "baba", "aba", "Abab"};

//        Predicate<String> p = s ->
        processStringArray(arr01, a -> true);
        processStringArray(arr01, a -> !false);
        processStringArray(arr01, a -> a.length() >= 1);
        processStringArray(arr01, a -> a.length() < 10);


        // Question 47:
        System.out.println("Question 47");
        String[] arr = {"A", "ab", "bab", "Ab", "bb", "baba", "aba", "Abab"};
        processStringArray(arr, a -> true);
        processStringArray(arr, a -> !false);
        processStringArray(arr, a -> a.length() >= 1);
        processStringArray(arr, a -> a.length() < 10);

        // Question 48:
        System.out.println("Question 48");
        List<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(7);
        list.add(50);
        list.add(17);
        list.add(10);
        list.add(5);

        list.removeIf(a -> a % 10 == 0);
        System.out.println(list); // print [7, 17, 5]


        // Question 49:
        System.out.println("Question 49");
        String str = "Sumon";
        Predicate<String> predicate = s -> s.startsWith("S");
        if (predicate.test(str)) {
            System.out.println(str);
        }

        // Question 50:
        System.out.println("Question 50");

        List<LocalDate> dates1 = new ArrayList<>();

        dates1.add(LocalDate.parse("2018-07-11")); // will throw DateTimeParseException,
        dates1.add(LocalDate.parse("1991-10-25"));
        dates1.add(LocalDate.of(2020, 4, 8));
        dates1.add(LocalDate.of(1980, Month.DECEMBER, 31));

        dates1.removeIf(x -> x.getYear() < 2000);
        System.out.println(dates1);


        // Question 51:
        System.out.println("Question 51");
        List<LocalDate> dates = new ArrayList<>();

//        dates.add(LocalDate.parse("2018-7-11")); // will throw DateTimeParseException,
        dates.add(LocalDate.parse("1991-10-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

        dates.removeIf(x -> x.getYear() < 2000);
        System.out.println(dates);


    }

    // question 47 method
    private static void processStringArray(String[] arr, Predicate<String> predicate) {
        for (String str : arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
