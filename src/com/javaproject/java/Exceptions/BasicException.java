package com.javaproject.java.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicException {
    static String username;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a first number : ");
        int a = scanner.nextInt();
        System.out.println("enter a second number : ");
        int b = scanner.nextInt();
        try {
            int Result = a / b;
            int[] ids = {1, 2, 4};
            System.out.println("Result :" + Result);
            System.out.println("Array index: " + ids[2]);
            System.out.println(username.equals("vinod"));
        }
        catch (InputMismatchException e){
            System.out.println("Please Etner number only!");
        }
//        } catch (ArithmeticException e) {
//            System.out.println("Should not enter the Zero");
//            input();
//        }
//        catch (ArrayIndexOutOfBoundsException e ){
//            System.out.println("index check ceshuko");
//            input();
//        }catch (NullPointerException e){
//            System.out.println("username shouldn't null");
//            input();
//        }
        catch (Exception e) {
            System.out.println("Some internal error is Occured, please try again!");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void input() {
        System.out.println("Input here");
    }
}