package com.example.exceptions;


import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

class SpecialString {
    String str;
    SpecialString(String str) {
        this.str = str;
    }
}


public class Test1 {
    public static void main(String[] args) throws Exception{

        String text = "RISE";
        text = text + (text = "ABOVE");
        System.out.println(text);

        StringBuilder sts = new StringBuilder("B");
        sts.append(sts.append("A"));
        System.out.println(sts);
        String st = "java";
        StringBuilder stringBuilder = new StringBuilder(st);
        System.out.println(st.contentEquals(stringBuilder));
        System.out.println(stringBuilder);
        Object [] arr = new Object[4];
        for(int i = 0; i <=3; i++) {
            switch(i) {
                case 0:
                    arr[i] = new String("Java");
                    break;
                case 1:
                    arr[i] = new StringBuilder("Java");
                    break;
                case 2:
                    arr[i] = new SpecialString("Java");
                    break;
            }
        }
        for(Object obj : arr) {
            System.out.println(obj);
        }

        System.out.println("============================");
        System.out.println("============================");
//        StringBuilder stringBuilder = new StringBuilder("Good");
        change(stringBuilder);
        System.out.println(stringBuilder);
        String s = "ABC";
        String B = "ABC"+"";
        System.out.println(s.equals(B));
        final int i1 = 1;
        final Integer i2 = 1;
        final String i3 = ":ONE";
        String str = i1 + i3;
        String str1 = i2 + i3;

        System.out.println(str == "1:ONE");
        System.out.println(str1 == "1:ONE");
        StringBuilder sb = new StringBuilder("hello world");
        sb.delete(0, 100);
        System.out.println(sb.length());
        StringBuilder ssb = new StringBuilder();
        String s1 = "ICICINBBRT4";
        System.out.println(s1.substring(4, 6));
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.remove(new String("Y"));
        System.out.println(list);
        String s2 = " ";
        boolean s3 = s2.isEmpty();
        System.out.println(s3);
        s2 = s2.trim();
        s3 = s2.isEmpty();
        System.out.println(s3);


    }

    private static void change(StringBuilder stringBuilder) {
        stringBuilder.append("_Morning");

    }
}
