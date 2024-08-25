package com.javaproject.java.Exceptions;

public class Test {
    public static void main(String[] args) {
        String username = "Vinodambarapu";
        String password = "Vinod@267";
        boolean isValid = false;
        try {
            if(isvalid(username,password))
                System.out.println("valid user");
            else
                System.out.println("Wrong username or password");
        }catch (NullPointerException e){
            System.out.println("user name is null");
        }
        catch (InvalidusrException e){
            System.out.println(e.getMessage());
        }
    }
    private static boolean isvalid(String username, String password) throws NullPointerException,InvalidusrException{
        boolean isValid = false;
        if (username.equalsIgnoreCase("Vinodambarapu") && password.equals("Vinod@267"))
            isValid = true;
        else
            throw new InvalidusrException("Wrong username or password");
            return isValid;
    }
}
