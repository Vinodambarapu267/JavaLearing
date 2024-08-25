package com.javaproject.java.OOP.Abstraction;

public abstract class CustomerService {
     abstract void addCustomertoDb(Customer customer);
     void displayDetails(Customer customer){
          System.out.println("id  : " + customer.id);
          System.out.println("Name : " + customer.name);
          System.out.println("Salery : "  + customer.salary);
          System.out.println("Phone Number : " + customer.PhoneNO);
          System.out.println("Grade : " + customer.grade);
          System.out.println("Email : " + customer.email);
          System.out.println("Roll Number : " + customer.rollNo);
     }
}
