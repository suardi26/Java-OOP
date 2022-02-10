package com.practice;

public class Product {
    int idProduct;
    String productName;

    public Product(int idProduct, String productName){
        
        this.idProduct = idProduct;
        this.productName = productName;
    }

    public void printData(){

        System.out.println("ID Produk\t: "+idProduct);
        System.out.println("Nama Produk\t: "+productName);

    }
}
