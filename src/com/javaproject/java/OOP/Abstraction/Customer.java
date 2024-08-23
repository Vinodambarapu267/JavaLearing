package com.javaproject.java.OOP.Abstraction;

public class Customer {
    int id;
    public   String name;
    String rollNo;
    String PhoneNO;
    String email;
    int salary;
    byte grade;
    public Customer (){
        id = 11;
        name = "reddy";
        email = "reddy@gmail.com";
        rollNo = "21HM1A0410";
        PhoneNO = "9646864954";
        grade = 8;
        salary = 20002;
        System.out.println("constructor is called..");
    }
    public Customer(int id, String name, String rollNo, String PhoneNO, String email, int salary, byte grade) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.PhoneNO = PhoneNO;
        this.email = email;
        this.salary = salary;
        this.grade = grade;
    }
}
