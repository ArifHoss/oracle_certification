package com.example.arraylist_and_lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Arif", 25));
        list.add(new Person("Arif", 27));
        list.add(new Person("Arif", 24));
        list.add(new Person("Arif", 25));
        list.add(new Person("Arif", 25));
        list.forEach(System.out::println);
        System.out.println(list.size());
        list.remove(new Person("Arif", 25));
        try {
            list.remove(-1);
//            list.get(100);
            throw new RuntimeException("Runtime exception");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cant remove index -1");
            System.out.println("Catch Index out of bounds");
            System.out.println(e.getMessage());
//            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Runtime exception");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally");
        }
        list.forEach(System.out::println);
        System.out.println(list.size());
    }
}
