package com.javaproject.java.OOP.Abstraction;

public class PostGreSQLRepository  implements Repository{
    @Override
    public void connectToDb() {
        System.out.println("Connect to PostGreSQL is successfully");
    }
    @Override
    public void addCustomerToDb(Customer customer) {
        System.out.println("Customer data is added to PostGreSQL database is successfully");
    }


}
