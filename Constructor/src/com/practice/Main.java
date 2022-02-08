package com.practice;

    // constructor adalah sebuah method khusus yang akan dieksekusi pada saat pembuatan Object instansiasi(instance).
    // Untuk membuat constructor dapat dilakukan dengan mengambil nama class dan digunakan sebagai nama method.


public class Main {

    public static void main(String[] args){

         // Instance/membuat object baru dari class Product dengan parameter serta langsung mengeksekusi constructor dari class Product.
        Product product1 = new Product(1001,"Coca Cola","Drink");

         // Instance/membuat object baru dari class Product.
        Product product2 = new Product(1002,"Sari Roti","Food");
        
    }
}
