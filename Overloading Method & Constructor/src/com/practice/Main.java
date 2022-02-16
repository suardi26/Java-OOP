package com.practice;

// Constructor overload adalah membuat beberapa Constructor dengan nama Constructor yang sama, tapi dibedakan dari tipe data atau jumlah parameter
// Method overload adalah membuat beberapa method dengan nama method yang sama, tapi dibedakan dari tipe data atau jumlah parameter.

public class Main{

    public static void main(String[] args){

        // membuat object dari class Product, dan memanggil constructor yang tidak memiliki parameter.
        Product product1 = new Product();

        // membuat object dari class Product, dan memanggil constructor yang  memiliki parameter.
        Product product2 = new Product("Sprite");

        // membuat object dari class Product, dan memanggil constructor yang  memiliki parameter.
        Product product3 = new Product("Aqua");

        // membuat object dari class Product, dan memanggil constructor yang tidak memiliki parameter.
        Product product4 = new Product();

        //Memanggil Method 'getProductName()'.
        System.out.println("Nama Product\t: "+product1.getProductName());

        //Memanggil Method overload 'getTotalPayment' pada class Arithmetic yang memiliki kedua parameter yang bertipe data int.
        System.out.println("Total Bayar\t: "+Arithmetic.getTotalPayment(10000,1500));

        //Memanggil method footer.
        System.out.println(Main.footer());

         //Memanggil Method 'getProductName()'.
        System.out.println("Nama Product\t: "+product2.getProductName());

         //Memanggil Method overload 'getTotalPayment' pada class Arithmetic yang memiliki kedua parameter yang bertipe data int.
        System.out.println("Total Bayar\t: "+Arithmetic.getTotalPayment(9000,500));

         //Memanggil method footer.
        System.out.println(Main.footer());

         //Memanggil Method 'getProductName()'.
        System.out.println("Nama Product\t: "+product3.getProductName());

         //Memanggil Method overload 'getTotalPayment' pada class Arithmetic yang memiliki kedua parameter yang bertipe data double.
        System.out.println("Total Bayar\t: "+Arithmetic.getTotalPayment(6500.00,0.00));

         //Memanggil method footer.
        System.out.println(Main.footer());

         //Memanggil Method 'getProductName()'.
        System.out.println("Nama Product\t: "+product4.getProductName());

        //Memanggil Method overload 'getTotalPayment' pada class Arithmetic yang memiliki kedua parameter yang bertipe data double.
        System.out.println("Total Bayar\t: "+Arithmetic.getTotalPayment(5000.00,500.00));
    }

    private static String footer(){

        String footer = "= = = = = = = = = = = = = = ";
        return footer;
    }
}