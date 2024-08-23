package com.javaproject.java.OOP.Abstraction;

public class MYSQLRepository extends Repository{
    @Override
    void connectToDb() {
        System.out.println("Connect to MySQL is successfully");
    }

    @Override
    void addCustomerToDb(Customer customer) {
        System.out.println("Customer data is added to MYSQL database is successfully");
    }
}
