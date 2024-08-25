package com.javaproject.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkImpl {
    public static void main(String[] args) {
        LinkedList<Students> studentsArrayList = new LinkedList<>();
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
        students2.setId(333);
        students2.setName("ramkrishna");
        students2.setLanguage("Tamil");
        students2.setEmail("ramu@gmail.com");

        studentsArrayList.add(students);
        studentsArrayList.add(students1);
        studentsArrayList.add(students2);
        System.out.println(studentsArrayList);
        System.out.println(studentsArrayList.size());
        Students first = studentsArrayList.get(0);
        System.out.println("Second Person : " + studentsArrayList.get(1));
        System.out.println("Third Person : " + studentsArrayList.get(2));
        System.out.println("first Person : " + first );
        StudentService studentService = new StudentService();
        // System.out.println(student);
        for (Students student : studentsArrayList) studentService.displayDetails(student);
    }
}
