package com.training;

public class User {
    
    public static double tax;

    public static void setTax(double tax){
        
        User.tax = tax;

    }

    public static double getTax(){
        
        return User.tax*100; 
    }
    
}
