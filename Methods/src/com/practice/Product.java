package com.practice;

// Membuat Class.
public class Product {
    
    // Attribute Class product 
    int idProduct;
    String productName;

    // Constructor
    public Product(int id, String name){

        this.idProduct = id;
        this.productName = name;
    }
    
    // method (tanpa return value dan tanpa parameter).
    public void printData(){

        System.out.println("ID Produk : "+this.idProduct);
        System.out.println("Nama Produk : "+this.productName);        
    }

    // method (dengan parameter dan tanpa return value).
    public void setId(int id){
        
        this.idProduct = id;
    }

    public void setName(String name){
        
        this.productName = name;
    }

    //  method (dengan return value dan tanpa parameter).
    public String getName(){

        return this.productName;
    }

    public int getId(){

        return this.idProduct;
    }

    //  method (dengan return value dan parameter).
    public String GetAndPrint(int id, String name){
        
        String result = "ID Produk : "+id+"\nNama Produk : "+name;
        
        return result; 
    }

}
