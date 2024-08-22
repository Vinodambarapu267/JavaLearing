package com.javaproject.java.Inheritance;

public class Main {
    public static void main(String[] args) {
       /* Students students1 = new Students();
        students1.displayDetails();

        Students students2 = new Students(8,"Vinod","21hm1a0402","9573508320",(byte) 98);
        students2.displayDgietails();*/
        EceStudents EceStudents = new EceStudents(9,"vinod","21hm1a0402","9573508320",(byte) 21,(byte) 98,"Java");
        EceStudents.displayDetails();
        CseStudents CseStudents = new CseStudents(10,"mallika","21hm1a0417","9573508320",(byte) 21,(byte) 27,"Python");
        CseStudents.displayDetails();
    }
}

