package com.javaproject.java.OOP.ObjectsCreation;

public class ConstructorTest {
    public static void main(String[] args) {
        Customer customer1;
        customer1 = new  Customer();
        customer1.displayDetails();
        Customer customer3 = new Customer(222,"bhanu","+91932449494","21mg10303","sfsgdg@gmail.com",21000,(byte)23);
        customer3.displayDetails();
        Customer customer4 =new Customer(223,"redu","21hm1a0401","942042944", "Ambara@gmail.com",24000,(byte) 3);
        customer4.displayDetails();

    }
}
