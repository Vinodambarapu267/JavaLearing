package com.javaproject.java.Java8Features;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.greet("hello my name is Vinod");
        greeting.greet();
        greet greet = new greet() {
            @Override
            public void greet() {
                System.out.println("Greet");
            }

            @Override
            public void greet(String msg) {
                System.out.println("Greet(String)");
            }
        };
        greet.greet();
        greet.greet("hello");


       //lambda expressions
        // is implementation of functional interface (instance of the functional interface)
        //() ->{logic}
        funct funct = (hellomsg) ->{
            System.out.println(hellomsg);
        };
        funct.sayhello("String parameterized");
    }
}
