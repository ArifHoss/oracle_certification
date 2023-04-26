package com.example.understanding_strings;

public class StringMethods2 {
    public static void main(String[] args) {
        String str = "java";
        String str2 = "Java";
        String str3 = "ja";

        // equals ignore case /return value boolean
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println("abc".equalsIgnoreCase("ABC")); // TRUE

        // startsWith and endsWith /return value boolean
        System.out.println(str.startsWith("j"));
        System.out.println(str.startsWith(str3));
        System.out.println(str.startsWith("J"));
        System.out.println(str.endsWith("va"));

        //contains
        System.out.println(str.contains(str3));
        System.out.println(str.contains("av"));
        System.out.println("Java".contains("j".toUpperCase()));

        // replace
        String myString = "java" +" " + "is" +" "+ "cool";
        System.out.println(myString.replace('a', 'A'));
        System.out.println(myString.replace(" ", "_"));
        System.out.println(myString.replace("is", "_"));
        System.out.println(myString);

        // trim
        System.out.println("Java".trim());
        System.out.println(" Java is cool ".trim());
        System.out.println("Java is cool ".trim());

    }
}
