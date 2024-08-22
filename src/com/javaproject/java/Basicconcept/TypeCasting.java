package com.javaproject.java.Basicconcept;

public class TypeCasting {
    public static void main(String[] args) {
        int age;
        age = 32;
         int ageValue;
         ageValue = (int)age;
         float a = 230304.4f;
         int b = (int)a;
        System.out.println("float Into Int : " + b);
        ageValue = 130;
        age = (byte)ageValue;
        System.out.println(" int to byte : " + age);
    }
}
