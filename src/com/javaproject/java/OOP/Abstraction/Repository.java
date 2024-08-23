package com.javaproject.java.OOP.Abstraction;

public abstract class Repository {
    abstract void connectToDb();
    abstract void addCustomerToDb(Customer customer);
}
