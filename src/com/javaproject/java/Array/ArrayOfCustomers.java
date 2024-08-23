package com.javaproject.java.Array;

import com.javaproject.java.OOP.Customer;

public class ArrayOfCustomers {
    public static void main(String[] args) {
        Customer[] customers = {new Customer(),
                new Customer(222, "   bhanu   ", "+91932449494", "21mg10303", "sfsgdg@gmail.com", 21000, (byte) 23),
                new Customer(333, "  Vinod  ", "21hm1a0402", "+91-9573508320", "sfsgdg@gmail.com", 23000, (byte) 21)};
        for (Customer customer : customers){
            customer.name = customer.name.toUpperCase();
            customer.displayDetails();
        }
//        for(Customer customer :customers ){
//         customer.name = customer.name.trim();
//         customer.displayDetails();
//        }
    }
}
