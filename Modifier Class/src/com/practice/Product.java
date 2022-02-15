package com.practice;

class Product {
    
    String name;
    double price;

    Product(){

        this.name = "";
        this.price = 0.0;
    }

     void setName(String name){

        this.name = name;
    }

     String getName(){

        return this.name;
    }

     void setPrice(double price){

        this.price = price;
    }

     double getPrice(){

        return this.price;
    }
}
