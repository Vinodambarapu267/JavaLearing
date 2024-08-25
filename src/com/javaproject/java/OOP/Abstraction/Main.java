package com.javaproject.java.OOP.Abstraction;


public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(222,"bhanu","+91932449494","21mg10303","sfsgdg@gmail.com",21000,(byte)23);

//        CustomerService customerService = new CustomerService();
//        customerService.addCustomertoDb(customer);
            MYSQLRepository repository = new MYSQLRepository();
            PostGreSQLRepository repository1 = new PostGreSQLRepository();
            CustomerServiceImpl customerService = new CustomerServiceImpl(repository);
            customerService.addCustomertoDb(customer);
            customerService.displayDetails(customer);
    }
}
