package com.javaproject.java.String;

public class StringReverse {
    public static void main(String[] args) {
        String username ="Vinod";
        String reverse = "";
        for (int i = 0; i<username.length() ; i++){
         reverse = username.charAt(i) + reverse;
        }
        System.out.println("reversed Username: "+reverse);
    }
}
