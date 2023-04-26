package com.example.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {

    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}
public class Test {

    static Double d1 = 0.0;
    static int x = d1.intValue();

    public static void main(String[] args) {

        try {
            System.out.println(1);
        } catch (NullPointerException e) {
            System.out.println("One");
//        } catch (FileNotFoundException e) {
//            System.out.println("Two");
        }
        System.out.println("Three");
//        try {
//            main(args);
//        } catch (Exception e) {
//            System.out.println("CATCH-");
//        }
//        System.out.println("OUT");
//    Super s = new Sub();
//        try {
//            s.m1();
//        } catch (FileNotFoundException e) {
//            System.out.println("M");
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            System.out.println("N");
//        }

    }

}
