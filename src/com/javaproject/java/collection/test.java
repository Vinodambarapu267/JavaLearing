package com.javaproject.java.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        Students students = new Students();
        students.setId(111);
        students.setName("Vinod Ambarapu");
        students.setLanguage("Telugu");
        students.setEmail("ambarapuvinod@gmail.com");

        Students students1 = new Students();
        students1.setId(222);
        students1.setName("Mallika edula");
        students1.setLanguage("Telugu");
        students1.setEmail("ambarapumalli@gmail.com");

        Students students2 = new Students();
        students2.setId(222);
        students2.setName("Mallika edula");
        students2.setLanguage("Telugu");
        students2.setEmail("ambarapumalli@gmail.com");

       /* TreeSet <String>Set = new TreeSet<>();
        Set.add("vinod");
        Set.add("1233");
        Set.add("Adim");
        Set.add("Java Developer");
        System.out.println(Set.size());
        System.out.println(Set);
        for (String string : Set){
            System.out.println(string);
        }*/
        TreeSet<Students> studentSet = new TreeSet<>();
        studentSet.add(students);
        studentSet.add(students1);
        studentSet.add(students2);
        System.out.println(studentSet);
        System.out.println(studentSet.size());
    }
}
