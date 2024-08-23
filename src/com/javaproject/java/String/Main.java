package com.javaproject.java.String;

public class Main {
    public static void main(String[] args) {
        marks marks = new marks();
        marks.id = 111;
        marks.name = "vinod";
        marks.displayDetails();
        System.out.println("sum of two numbers: " + marks.sum(7,9));
        marks.mul((byte) 2);

    }
}
