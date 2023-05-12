package com.example.arraylist_and_lambdaexpression;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
