package com.javaproject.java;

public class SwitchTest {
    public static void main(String[] args) {
        int productPrice;
        int discount;
        int discountPercentage;
        char memberShip;

        productPrice = 20000;
        memberShip = 'D';
        String company;
        company = "samsung";
        switch (company){
            case "samsung" :
                if (memberShip == 'D'){
                    discountPercentage = 20;
                } else if (memberShip == 'G') {
                    discountPercentage = 15;
                } else if (memberShip == 'S') {
                    discountPercentage = 10;
                }else {
                    discountPercentage = 5;
                }
                break;
            case "Appl" :
                if (memberShip == 'D'){
                    discountPercentage = 25;
                } else if (memberShip == 'G') {
                    discountPercentage = 12;
                } else if (memberShip == 'S') {
                    discountPercentage = 10;
                }else {
                    discountPercentage = 7;
                }
                break;
            default:
                discountPercentage = 5;
        }
        discount = productPrice * discountPercentage / 100;
        System.out.println("Discount depends on Company : "  + discount);
        int finalPrice;
        finalPrice = productPrice - discount;
        System.out.println("Final price : "  + finalPrice);

    }
}
