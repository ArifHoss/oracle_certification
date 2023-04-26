package com.example.understanding_strings;

public class ImportantStringBuilderMethod {
    public static void main(String[] args) {
        // chartAt(), indexOf(), length(), substring() /same as string
        //0 1 2 3 4 5 6 7 8 9 10
        //p r o g r a m m i n g
        StringBuilder sb = new StringBuilder("programming");
        // gram
        String sub = sb.substring(sb.indexOf("g"),sb.indexOf("mi"));
        int len = sb.length(); // 11
        char ch = sb.charAt(5); // a
        System.out.println(sub + " " + len + " " + ch);

        // append()
        StringBuilder b = new StringBuilder().append(1).append("L");
        b.append("-").append(true);

        //insert()
        StringBuilder sb1 = new StringBuilder("animals");
        sb1.insert(7, "-"); // animals-
        sb1.insert(2, 2); // a2nimals-
        System.out.println(sb1); // a2nimals-

        //delete() and deleteCharAt()

        StringBuilder sb2 = new StringBuilder("abcdef");
        sb2.delete(1, 3); // acdef
        sb2.delete(1,1); // acdef // no change
        System.out.println(sb2);// acdef
        sb2.deleteCharAt(5); // acde
        System.out.println(sb2);// acde

        //reverse()
        StringBuilder sb3 = new StringBuilder("ABC");
        sb3.reverse(); // CBA
        System.out.println(sb3); // CBA

        //toString()
        String toString = sb3.toString();// CBA
        System.out.println(toString); // CBA

        //capacity()
        StringBuilder sb4 = new StringBuilder();
        System.out.println(sb4.capacity()); // 16
        sb4.append("Hello World");
        System.out.println(sb4.capacity()); // 16
        sb4.append("Hello World");
        System.out.println(sb4.capacity()); // 34
        StringBuilder sb5 = new StringBuilder(100);
        System.out.println(sb5.capacity()); // 100

    }
}
