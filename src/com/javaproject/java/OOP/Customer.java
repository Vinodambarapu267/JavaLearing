package com.javaproject.java.OOP;

public class Customer {
    int id;
  public   String name;
    String rollNo;
    String PhoneNO;
    String email;
    int salary;
    byte grade;


// No argument Constructor
   public Customer (){
     id = 11;
     name = "reddy";
     email = "reddy@gmail.com";
     rollNo = "21HM1A0410";
     PhoneNO = "9646864954";
     grade = 8;
     salary = 20002;
    System.out.println("constructor is called..");
    }
    public Customer(int id, String name, String rollNo, String PhoneNO, String email, int salary, byte grade) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
         this.PhoneNO = PhoneNO;
        this.email = email;
        this.salary = salary;
        this.grade = grade;
    }
public  void  Config(){
    System.out.println("configuration of customer3");
}

    /*
    without return type and without parameter
     */
    public void displayDetails(){
        System.out.println("id  : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salery : "  + salary);
        System.out.println("Phone Number : " + PhoneNO);
        System.out.println("Grade : " + grade);
        System.out.println("Email : " + email);
        System.out.println("Roll Number : " + rollNo);
    }
    /* without ReturnType and with Parameter
     */
    void displayMembership(String memberShip){
        System.out.println("Display membershipType : " + memberShip);
    }
/*
with returnType  and No paramters
 */
    byte discountPercentageByGrade(){
        System.out.println("discount Percentage  is called..");
        byte discountPercentage = 0;
        if (grade >=9)
            discountPercentage = 25;
         else if (grade >7 && grade <9)
             discountPercentage = 20;
         else if (grade >4 && grade <7 )
             discountPercentage = 15;
         else
             discountPercentage = 5;
         return discountPercentage;
    }
    /* with returnType and with Parameters
     */
    double finalProdcutPriceAtferDiscount( double productPrice){
        double discountPrice = discountPercentageByGrade();
        return productPrice - (productPrice * discountPrice) / 100;
    }
}
