package com.javaproject.java.String;

public class marks {
    int id;
    public   String name;
    String rollNo;
    String PhoneNO;
    String email;
    int salary;
    byte grade;
    int c = 12;
    int a = 10;
    int b = 2;
    public void displayDetails(){
//        System.out.println("id  : " + id);
//        System.out.println("Name : " + name);
//        System.out.println("Salery : "  + salary);
//        System.out.println("Phone Number : " + PhoneNO);
//        System.out.println("Grade : " + grade);
//        System.out.println("Email : " + email);
//        System.out.println("Roll Number : " + rollNo);
        System.out.println("Sum :" + (a+b));
        System.out.println("Mul : " + a*b);
        System.out.println("div : " + a/b);
        System.out.println("compond conditions : " + a*(b+c));
    }



    int sum(int a ,int b){
        return a+b;
    }
    void mul(byte z){
        System.out.println("Single value : " + z);
    }


}
