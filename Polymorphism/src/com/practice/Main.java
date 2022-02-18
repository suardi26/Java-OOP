package com.practice;

import java.util.ArrayList;

/*

    Polimorfisme (Polymorphism) terdiri dari 2 suku kata yaitu 'poly' = banyak, dan 'Morfisme' berarti bentuk, polimorfisme => banyak bentuk. 
    
    Polimorfisme adalah suatu kemampuan dimana setiap subclass dapat membuat ulang method dengan nama yang sama (Overridding) 
    yang di warisi dari super class sehingga isi dari method yang diwarisi dapat berbeda-beda setiap subclassnya.

    Polimorfisme dapat dilakukan ketika memiliki beberapa class yang terkait satu sama lain melalui (Pewarisan) inheritance. Ketika 
    sub class mewarisi atribut dan method dari super class maka polimorfisme membuat method baru dengan nama yang sama untuk tugas yang lain 
    atau tugas yang lebih spesifik. Polimorfisme memungkinkan kita untuk melakukan satu tindakan dengan cara yang berbeda.
    
    java memiliki 2 type polymorfisme : 
        - Compile time Polymorphism (Static Polymorphism) -> Polymorphism ini menerapkan teknik Method Overloading, dimana 
          method Overloading adalah membuat beberapa method dengan satu nama yang sama tapi dibedakan dengan tipe data 
          atau jumlah parameternya dalam sebuah class.
        
        - Runtime Polymorphism(Dynamic Polymorphism) -> Polymorphism ini menerapkan teknik Method Overridding. dimana
          method Overriding adalah Proses membuat ulang method yang diwariskan oleh super class, sehingga method tersebut 
          dapat digunakan oleh sub class dengan lebih spesifik sesuai dengan kebutuhan dari sub class itu sendiri.

*/

public class Main {
    
    public static void main(String[] args){

        // Membuat variabel reference dari super class Animal namun membuat object dari subclass masing masing seperti 'Hawk', 'Cat', 'Dog'.
        // maka kita tidak bisa mengakses langsung atribut & method yang ada pada subclass, namun kita hanya bisa mengakses atribut & method
        // yang ada pada superclass serta attribut & method yang diturunkan dari superclass
        Animal elang = new Hawk("Daging",2); 
        Animal kucing = new Cat("ikan",4);
        Animal anjing = new Dog("Daging",4);

    
        elang.printData();
        kucing.printData();
        anjing.printData();

        // tidak bisa memanggil method 'info()' dari subclass 'Hawk', karena method 'info()' bukan method override dari superclass 'Animal'.
        
        // elang.info();

        // untuk bisa memanggil method 'info()' dari subclass 'Hawk' dan bukan method override dari superclass 'Animal' harus melakukan 
        // Downcasting untuk mengembalikan object subclassnya ke reference subclassnya yaitu 'Hawk' atau bisa membuat object baru dari
        // subclass dan reference variabel dari subclass.
        // Downcasting 
        Hawk elang1 = (Hawk) elang;
        elang1.info();

        // Membuat object Baru.
        Hawk elang2 = new Hawk("Daging",2);
        elang2.info();
        System.out.println("= = = = = = = = = = = = = = = = = =");

        // membuat object dengan Array list.
        ArrayList <Animal> listObject = new ArrayList<Animal>();
        System.out.println("Membuat Object Dengan Array List");
        listObject.add(new Hawk("Daging",2));
        listObject.add(new Cat("Ikan",4));
        listObject.add(new Dog("Daging",4));

        listObject.get(0).printData();
        listObject.get(1).printData();
        listObject.get(2).printData();   
    }
}
