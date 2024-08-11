package com.javaproject.java;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int factorCount = 0;
        for (int i = 1 ; i<=number ; i++ ) {
            if (number % i == 0)
                factorCount++;
        }
        if (factorCount == 2)
            System.out.println(number + " : is the Prime ");
        else
            System.out.println(number + ": is not prime");
    }
}
