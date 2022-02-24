package com.practice;

/*
access modifier pada class :

    - modifier public : class dapat diakses oleh class lain baik dalam satu package yang sama maupun pada package yang berbeda.
    
    - modifier default (tanpa modifier) : class hanya dapat diakses oleh class lain dalam package yang sama.

    - package adalah sebuah folder yang digunakan untuk mengelompokan class, sehingga lebih memudahkan dalam mengelolah kode program,
      terutama pada aplikasi yang besar.
    
    - sama seperti folder/direktori, package juga bisa nested/bercabang, kita bisa menggunakan tanda titik '.' untuk membuat nested package.

    - ketika membuat class dalam package, maka diatas file java, kita wajib menyebutkan nama packagenya.

    - Built-in Package adalah package bawaan pada java seperti : 'java.util.'
    
    - User-defined Package adalah package yang dibuat sendiri.

    - Keyword 'import' pada java digunakan untuk import class yang berada di package lain, sehingga atribut dan method pada class tersebut
      dapat diakses.

    - untuk impor class pada package yang berbeda harus menggunakan modifier public. 

    - Secara default, semua class yang ada di package java.lang sudah auto import, jadi kita tidak perlu melakukan import secara manual.
      contoh class yang ada pada package java.lang : class String, Integer, Long, Boolean, dan lain-lain. untuk itu kita tidak perlu 
      import class-class tersebut secara manual.

    - Keyword 'import static' pada java digunakan untuk import class dimana atribut atau method static dengan modifier public dapat
      diakses tanpa harus menuliskan nama classnya.  


*/

// import class Shop.java karena berada di posisi package yang berbeda.
import com.training.Shop;


// import variabel atau method static dari class User. 
import static com.training.User.*;


public class Main {
    
    public static void main(String[] args){

        // membuat object dari class Product, dimana class Product dan Class Main berada pada package yang sama yaitu com.practice.
        Product product1 = new Product();

        product1.setName("Dettol");
        System.out.println("Nama Product : "+product1.getName());
        product1.setPrice(7000d);
        System.out.println("Harga : RP. "+product1.getPrice());

        // membuat object dari class User, dimana class User dan Class Main berada pada package yang berbeda, sehingga class User harus
        // diimpor terlebih dahulu.
        Shop shop1 = new Shop();
        shop1.setNameShop("Lapak Sejahtera");
        System.out.println("Nama Toko : "+shop1.getNameShop());
       
        
        // mengakses variabel dan method static pada class User. setelah class User telah diimpor.
        // akses method static dari class User.
        setTax(0.1d);
        System.out.printf("Pajak : %.2f %%.\n", getTax());

        // akses variabel secara langsung 
        tax = 0.2d;
        System.out.printf("Pajak : %.2f %%.\n", getTax());


    }
}
