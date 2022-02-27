package com.funtion;

public class Product {

    int idProduct;
    String nameProduct;

    public Product(int idProduct, String nameProduct){
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
    }

    // Override method 'toString()' dari superclass "class Object".
    public String toString(){

        return "ID Product : "+this.idProduct+", Product Name : "+this.nameProduct;
    }
    

}
