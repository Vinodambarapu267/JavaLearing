package com.javaproject.java.Basicconcept;

public class ConditionalStatement {
    public static void main(String[] args) {
        int productPrice;
        productPrice = 30000;
        int discount;
        char memberShip;
        int discountPercentage;
        memberShip ='G';
        if (memberShip == 'D'){
            discountPercentage = 20;
        } else if (memberShip == 'G') {
            discountPercentage = 15;
        } else if (memberShip == 'S') {
            discountPercentage = 10;
        }else {
            discountPercentage = 5;
        }
        discount = productPrice * discountPercentage / 100;
        System.out.println(" Discount Price $ : " + discount);
        int finalPrice;
        finalPrice= productPrice -discount;
        System.out.println("final Price : " + finalPrice);
    }
}
