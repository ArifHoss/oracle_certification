package com.example.understanding_strings;

public class StringImmutability {
    public static void main(String[] args) {
        String hello = "hello";
        String hi = hello + "world";// hi="helloworld"
        hi = hello; //hi = "hello"
        System.out.println(hi + hello);// hellohello

        hello.toUpperCase();
        System.out.println(hello);//hellohello

        hello =  hello.toUpperCase();
        System.out.println(hello);//HELLOHELLO

        //concat

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s1); //1
        System.out.println(s2);//12
    }
}
