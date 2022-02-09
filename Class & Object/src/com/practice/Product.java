package com.practice;

// Membuat Class.
public class Product {

    // variabel (atribut/properti)
    int idProduct;
    String productName;
    String category;

    // fungsi/method yang tidak mengembalikan return value.
    public void printData(){

        System.out.println("Product Name : "+this.productName);
        System.out.println("Category : "+this.category);

    }

    // fungsi/method yang mengembalikan return value.
    public int getIdProduct(){

        return this.idProduct;
    }
}
