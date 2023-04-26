package com.example.understanding_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcatenation {
    public static void main(String[] args) {
        String text = "hello";
        String anotherText = new String("hello");

        System.out.println(2 + 3); //5
        System.out.println("a" + "b");//ab

        System.out.println(1 + 2 + "d");// 3d

        int three = 3;
        String  four = "4";
        System.out.println(1 + 2 + three + four);// 64

        int number = 10;
        int anotherNumber = 20;
        System.out.println("result = " + number + anotherNumber); // result = 1020
        System.out.println("result = " + (number + anotherNumber)); // result =  30

        String str = "";
        for (int i = 0; i < 10; i++) {
            str += i + " ";
        }
        System.out.println(str); // 1 2 3 4 5 6 7 8 9

        int num = 0;
        for (int i = 0; i < 10; i++) {
            num += i;
        }
        System.out.println(num); // 45

        String hello = "hello";
        String world = "world";
        String helloWorld = hello + world;
        System.out.println(hello);


    }
}
