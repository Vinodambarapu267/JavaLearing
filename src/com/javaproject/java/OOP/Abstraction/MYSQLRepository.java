package com.javaproject.java.OOP.Abstraction;

public class MYSQLRepository implements Repository{

    @Override
    public void connectToDb() {
        System.out.println("Connection to MYSQL IS success");
    }

    @Override
    public void addCustomerToDb(Customer customer) {
        System.out.println("Customer data is added to MYSQL database is successfully");
    }
}
