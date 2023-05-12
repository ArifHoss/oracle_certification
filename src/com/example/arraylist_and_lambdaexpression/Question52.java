package com.example.arraylist_and_lambdaexpression;


import java.util.ArrayList;
import java.util.List;
public class Question52 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(110);
        list.add(new Integer(110));
        list.add(110);

        list.removeIf(i -> i == 110); // will remove all value

        System.out.println(list);

    }
}
