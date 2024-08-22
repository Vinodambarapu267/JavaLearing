package com.javaproject.java.OOP;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.displayDetails();
        customer1.id = 111;
        customer1.name = "Vinod";
        customer1.grade = 9;
        customer1.PhoneNO = "+91-95735083200";
        customer1.rollNo = "21HM1A0302";
        customer1.email = "ambarapuvinod@gmail.com";
        customer1.salary = 200000;
        customer1.displayDetails();

        Customer customer2 = new Customer();
        customer2.id = 112;
        customer2.name = "Konda Reddy";
        customer2.grade = 8;
        customer2.PhoneNO = "+91-989032484";
        customer2.rollNo = "21HM1A0330";
        customer2.email = "skfnaskfn@gmail.com";
        customer2.salary = 3000000;
        Customer customer3 =new Customer();
        customer3.grade = 7;
        customer3.name = "rama";
        customer2.displayDetails();
        /* without Returntype and with paramaterized
         */
        customer1.displayMembership("Diamond");
        customer2.displayMembership("GOLD");
        /* with Returntype and without parameters */

//         byte discountPercentage = customer1.discountPercentageByGrade();
//         System.out.println( customer1.name + " 's DiscountPercentage is : " + discountPercentage);
//         System.out.println( customer2.name + " 's DiscountPercentage is : " + discountPercentage);

        System.out.println( customer1.name + " 's DiscountPercentage is : " + customer1.discountPercentageByGrade());
        System.out.println( customer2.name + " 's DiscountPercentage is : " + customer2.discountPercentageByGrade());
        System.out.println( customer3.name + " 's DiscountPercentage is : " + customer3.discountPercentageByGrade());
        /* with ReturnType and Parameter */
        System.out.println("Final ProductPrice for " + customer1.name + " is $ : " + customer1.finalProdcutPriceAtferDiscount(25000));
        System.out.println("Final ProductPrice for " + customer2.name + " is $ : " + customer2.finalProdcutPriceAtferDiscount(25000));
    }
}
