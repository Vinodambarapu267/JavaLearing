package com.javaproject.java.Basicconcept;

public class loopStatements {
    public static void main(String[] args) {
        int j ;
        int i;
       outer: for(i=1; i<=3; i++){
         inner:  for (j=1;j<=3; j++){
               if (i == j)
                    break inner;
           }
           System.out.println(i + " " + j);
       }
    }
}
