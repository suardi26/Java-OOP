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

        // pemanggilan constructor 'Product' yang memniliki 1 variabel yang bernilai string, dan pemanggilan Constsructor harus diletakan 
        // pada statement pertama atau pada baris pertama dalam sebuah  constructor lain. 
        this("Product "+(++totalProduct));
        
    }

    // membuat method getter untuk variabel 'productName'.
    public String getProductName(){
       
        return this.productName;
    }
}
