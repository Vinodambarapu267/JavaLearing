package com.javaproject.java.Array;

public class TwoDimensionalArr {
    public static void main(String[] args) {
//        int [][] twD;
//        twD = new int[2][2];
        int [][] twD ={{1,2,3},{5,6,7}};

        for (int [] oneD:twD){
            for (int value : oneD){
                System.out.print(value+ " ");
            }
            System.out.println();
        }
    }
}
