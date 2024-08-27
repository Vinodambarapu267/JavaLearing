package com.javaproject.java.Java8Features;

public class Greeting implements greet {
    @Override
    public void greet() {
        System.out.println("welcome to my code ");
    }

    @Override
    public void greet(String msg) {
        System.out.println(msg);
    }
}
