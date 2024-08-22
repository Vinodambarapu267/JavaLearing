package com.javaproject.java.String;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Vinod Ambarapu";
        System.out.println(str1);
        String str2 = "VINOD AMBARAPU";
        System.out.println(str1.toUpperCase());
        System.out.println(str2);
        System.out.println(str1.charAt(0));
        System.out.println(str1.length());
        boolean isValid = false;
        if (str1.length() >5 && str1.length() <=14)
            isValid =true;
        System.out.println(isValid);
        }
    }
