package com.practice;

public class Product {
    
    // Membuat variabel static
    public static int totalProduct = 0;

    // Membuat variabel instance
    public String productName;

    // Membuat Constructor Overload, dimana terdapat 2 constructor dengan nama yang sama, dimana yang satu memiliki parameter dengan 
    // variabel 'name' yang bertipe data String dan yang satu tidak memiliki parameter.   
    public Product(String name){

        this.productName = name;
    }

    public Product(){

        totalProduct++;
        this.productName = "Product"+totalProduct;
    }

    // membuat method getter untuk variabel 'productName'.
    public String getProductName(){
       
        return this.productName;
    }
}
