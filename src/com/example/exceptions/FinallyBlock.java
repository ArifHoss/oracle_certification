package com.example.exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println(calculate());
    }

    private static int calculate() {
        try {
            return 10/0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Error");
//            System.exit(0); // this can cause unexpected result.
            return 1;
        } finally {
            System.out.println("Finally");
            return 0; // this can cause unexpected result.
        }
    }
}
