package com.javaproject.java;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
       /* int sum = 0;
        while(number != 0){
            sum += number % 10;
            number /= 10;
        } */
        int sum = sumOfDigits(number);
        System.out.println("Sum of digtis : " + sum);
    }
    public static int sumOfDigits(int number){
        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }
        return  sum;
    }

}
