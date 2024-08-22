package com.javaproject.java.String;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Vinod Ambarapu";
        System.out.println(str1);
        String str2 = "VINOD AMBARAPU";
        System.out.println(str2);
        System.out.println(str1.charAt(0));
        System.out.println(str1.length());
        boolean isValid = false;
        System.out.println(str1==str2);
        if (str1.length() >5 && str1.length() <=14)
            isValid =true;
        System.out.println(isValid);
        System.out.println(str1.compareTo(str2));

        String password = "Password@123";
        boolean isEqual = false;
        if (str1.trim().toUpperCase().equalsIgnoreCase("Vinod Ambarapu") && password.equalsIgnoreCase("Password@123"))
            isEqual = true;
        System.out.println("Both are Eqaul ? : "+isEqual);
        String employeeDetails = "111,Vinu,sanff@gmail.com,9583508320";
       String [ ] values = employeeDetails.split(",");
        for ( String value :values)
            System.out.println(value);
        }
    }
