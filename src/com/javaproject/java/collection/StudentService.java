package com.javaproject.java.collection;

public class StudentService {
    void displayDetails(Students students){
        System.out.println("id :" + students.getId());
        System.out.println("name : " + students.getName());
        System.out.println("Email : " + students.getEmail());
        System.out.println("Mother tongue : " + students.getLanguage());
    }
}
