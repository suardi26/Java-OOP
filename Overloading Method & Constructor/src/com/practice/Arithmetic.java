package com.practice;

public class Arithmetic  {
    
    // Membuat method Overload, dimana terdapat 2 method dengan nama yang sama, dimana yang satu memiliki 2 parameter 
    // yang bertipe int dan yang satu memiliki 2 parameter yang bertipe double.
    
    public static int getTotalPayment(int totalPrice, int discount){

        return totalPrice - discount;
    }

    public static double getTotalPayment(double totalPrice, double discount){

        return totalPrice - discount;
    }
}
