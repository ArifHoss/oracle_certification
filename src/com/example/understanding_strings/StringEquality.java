package com.example.understanding_strings;

public class StringEquality {
    public static void main(String[] args) {
        String name = "John";
        String anotherName = "John";
        String john = "Jo" + "hn"; // concat on compile time
        String newName = new String("John");

        System.out.println("name == anothername -> " + (name == anotherName)); // true
        System.out.println("name == john -> " + (name == john)); // true
        System.out.println("name == newName -> " + (name == newName)); // false

        System.out.println("name.equals(anotherName) -> " + name.equals(anotherName));
        System.out.println("name.equals(john) -> " + name.equals(john));
        System.out.println("name.equals(newName) -> " + name.equals(newName));

        System.out.println("name - identityHashCode -> " + System.identityHashCode(name));
        System.out.println("anotherName - identityHashCode -> " + System.identityHashCode(anotherName));
        System.out.println("john - identityHashCode -> " + System.identityHashCode(john));
        System.out.println("newNmae - identityHashCode -> " + System.identityHashCode(newName));

        String str1 = "abc";
        String str2 = "ab";
        String str3 = "ab" + "c"; // concat on compile -time
        String str4 = str2 + "c"; // concat on run-time
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);


        System.out.println("*****************************");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));



    }
}
