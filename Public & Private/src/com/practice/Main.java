package com.practice;

public class Main {
    
    public static void main(String[] args){

        User user = new User("Suardi",26,"Toraja Utara");

        // modifier default/tanpa modifer, variabel (atribut) dapat dipanggil (Read/Write) 
        // pada class lain dan package yang sama.
        System.out.println(user.name); // membaca (Read) data dengan variabel 'name' di class 'User'. 
        user.name = "Daud"; // menulis (Write) data pada variabel 'name' di class 'User'.
        System.out.println(user.name); // membaca (Read) data dengan variabel 'name' di class 'User'. 


        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
        
        // modifer public, variabel (atribut) dapat dipanggil (Read/Write) pada class lain baik pada  
        // package yang sama ataupun pada package yang lain.
        System.out.println(user.age); // membaca (Read) data dengan variabel 'age' di class 'User'. 
        user.age = 12; // menulis (Write) data pada variabel 'age' di class 'User'.
        System.out.println(user.age); // membaca (Read) data dengan variabel 'age' di class 'User'. 

        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
        // ERROR karena variabel (atribut) hanya dapat dipanggil pada class 'User'. 
        // modifer private, variabel (atribut) hanya dapat dipanggil pada class yang sama.
        // System.out.println(user.address); // membaca (Read) data dengan variabel 'address' di class 'User'. 
        // user.address = "Indonesia"; // menulis (Write) data pada variabel 'address' di class 'User'.
        // System.out.println(user.address); // membaca (Read) data dengan variabel 'address' di class 'User'. 


        // modifier default/tanpa modifer, method dapat dipanggil pada class lain dan package yang sama.
        System.out.println("Method tanpa modifier (default)");
        user.print();

        // modifer public, method dapat dipanggil pada class lain baik pada package yang sama ataupun pada package yang lain.
        user.setName("Suardi");

        // modifier default/tanpa modifer, method dapat dipanggil pada class lain dan package yang sama.
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
        user.print();

        // ERROR karena method  hanya dapat dipanggil pada class 'User'.
        // modifer private, method hanya dapat dipanggil pada class yang sama.
        // System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
        // user.updateAddress();
    }
}
