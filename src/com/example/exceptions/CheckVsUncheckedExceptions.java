package com.example.exceptions;

public class CheckVsUncheckedExceptions {
    public static void main(String[] args) throws Exception {
        myMethod();
    }

    public static void myMethod() throws Exception {
        throw new Exception("Fail to load");
    }

    public static void anotherMethod() {
        throw new RuntimeException("Wrong parameter");
    }
}
