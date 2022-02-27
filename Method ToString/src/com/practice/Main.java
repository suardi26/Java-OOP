package com.practice;

/*
    Method 'toString()' adalah method yang terdapat di class Object yang merupakan superclass default ketika class tidak memiliki superclass.
    
    Method 'toString()' biasanya digunakan untuk merepresentasikan object dalam bentuk String. yang berisi nama package dan referensi class
    dari object serta hashcode dari object.

    secara default : className + @ + hashcode.

    kita dapat mengoverride method tersebut sehingga lebih mudah dibaca.
*/

import com.funtion.Product;

public class Main {
    
    public static void main(String[] args){

        Product product1 = new Product(1001, "Aqua.");
        System.out.println(product1.toString());

        Product product2 = new Product(1002 ,"Sprite.");
        System.out.println(product2.toString());

        

    }
}
