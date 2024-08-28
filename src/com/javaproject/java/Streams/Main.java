package com.javaproject.java.Streams;

import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);
        List<Students> studentsList = studentService.getstudents();
        // studentsList.forEach(System.out::println);
        //intermediate Operations
        studentService.filterBygrade(3).forEach(System.out::println);
        studentService.DisplayDetails();
        studentService.getAllnames().forEach(System.out::println);
        try {
            System.out.println(studentService.getStudentsById(111));
            System.out.println(studentService.getNameByid("Alice Smith"));
        }catch (StudentNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

}
