package com.javaproject.java.Inheritance;

public class CseStudents extends Students {
String languages;

    public CseStudents(int grade, String name, String rollNo, String phoneNo, byte age, byte marks, String languages) {
        super(grade, name, rollNo, phoneNo, age, marks);
        this.languages = languages;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Language : " + languages);
    }
}
