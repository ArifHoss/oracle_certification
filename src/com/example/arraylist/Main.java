package com.example.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Arif", 31));
        students.add(new Student("Jacob", 25));
        students.add(new Student("Arif", 30));
        students.add(new Student("Arif", 30));

//        students.remove("Arif", 30);// error
//        students.remove("Arif"); // will not remove anything
//        students.remove(new Student("Arif", 30)); // will remove first match of this object
        for (Student student : students) {
            // students.remove(student); //  ConcurrentModificationException
            if (student.equals(new Student("Arif", 30))) {
                students.remove(student);
            }
            System.out.println(student);
        }
    }
}
