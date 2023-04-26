package com.example.understanding_strings;
//String is secunce of characters
// String is immutable
public class StringMethods {
    public static void main(String[] args) {
        //0 1 2 3 4 5 6 7 8 9 10
        //j a v a   i s   f u n
        String str = "java is fun";

        // length
        System.out.println("length = "+str.length());

        // char at
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(10));
//        System.out.println(str.charAt(12)); // StringIndexOutOfBoundsException

        // index of
        System.out.println(str.indexOf("a")); // 1
        System.out.println(str.indexOf("a", 2)); // 3
        System.out.println(str.indexOf("fun")); // 8
        System.out.println(str.indexOf("fun", 10)); // -1 means match not found

        // substring
//        str = str.substring(8);
        System.out.println(str.substring(8));
        System.out.println(str.substring(0,5)); //
        System.out.println(str.substring(4,4)); // empty string
//        System.out.println(str.substring(4,2)); // StringIndexOutOfBoundsException / out of range
//        System.out.println(str.substring(8,14)); //// StringIndexOutOfBoundsException / out of range

        // to lower case
        // to upper case
        System.out.println("AbCd".toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);
        String dog = "Lucky";
//        dog.toUpperCase();
        dog = dog.toUpperCase();
        System.out.println(dog);

    }
}
