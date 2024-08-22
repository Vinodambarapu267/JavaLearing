package com.javaproject.java.Inheritance;

public class EceStudents extends Students{
    String languages;
    public EceStudents(){
        super();
        System.out.println("Ecestudnets...");
    }

    public EceStudents(int grade, String name, String rollNo, String phoneNo, byte age, byte marks, String languages) {
        super(grade, name, rollNo, phoneNo, age, marks);
        this.languages = languages;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Language : "+languages);
    }
}
