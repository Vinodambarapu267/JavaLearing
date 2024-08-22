package com.javaproject.java.Inheritance;

public class Students {
    int grade;
    String name;
    String rollNo;
    String phoneNo;
    byte marks;
    byte age;
 public  Students(){
     System.out.println("Students is called...");

 }
    public Students(int grade, String name, String rollNo, String phoneNo,byte age, byte marks) {
        System.out.println("(int grade, String name, String rollNo, String phoneNo, byte marks)");
        this.grade = grade;
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNo = phoneNo;
        this.marks = marks;
        this.age = age;
    }

   void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Age : "  + age);
        System.out.println("Phone Number : " + phoneNo);
        System.out.println("Grade : " + grade);
        System.out.println("Marks : " + marks);
        System.out.println("Roll Number : " + rollNo);
    }
}
