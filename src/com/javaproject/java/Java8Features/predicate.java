package com.javaproject.java.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {
        Predicate<Integer>  isEvenPredicate = num -> num %2 == 0;
        System.out.println(isEvenPredicate.test(2211));


        //Consumer
        List<String> customerDetails = Arrays.asList("Vinod", "21","Ece Dept");
        /*Consumer<String> printdetails = name -> System.out.println(name);
        customerDetails.forEach(printdetails);*/
        customerDetails.forEach(System.out::println);
        Function<String,String> uppercase = name ->{
            name = name.toUpperCase();
            return name;
        };
        customerDetails.forEach(name -> System.out.println(uppercase.apply(name)));
        for (String name : customerDetails){
            System.out.println(name);
        }
    }
}
