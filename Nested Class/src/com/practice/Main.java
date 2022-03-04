package com.practice;

public class Main {

    /*
        - Nested class (class bersarang) adalah terdapat class di dalam class. 

        - Nested class dibuat untuk ketika kita ingin membuat beberapa class yang saling berhubungan, dimana class tidak bisa dibuat tanpa
          class lain.

        - Inner Class adalah class di dalam class sedangkan outer class adalah class yang berada di luar inner class.
        
        - Misalnya kita akan membuat class Duck, dan membutuhkan class Animal, maka kita bisa membuat class Duck sebagai Inner class dan 
          class Animal sebagai Outer class.
          
        - Inner class dibuat dalam outer class.

        - Pada saat membuat inner class, kita juga dapat mengakses outer classnya.

        - Inner Class dapat mengakses attribut dan method yang ada pada outer class meskipun access modifiernya 'private'.

        - Untuk mengakses object outer class, kita dapat menggunakan nama dari class outernya diikuti dengan keyword 'this'. 
          contoh : Animal.this._ _ _.

        - Untuk pewarisan, kita dapat mengakses super class outer classnya dengan menggunakan nama class outernya diikuti dengan keyword
          'super'. contoh : Animal.super._ _ _.
          
        - Untuk mengakses inner class, maka buat terlebih dahulu object dari outer class kemudian buat object inner class.

        - Inner class dapat diberi access modifier 'private' atau 'protected', jika kita tidak ingin inner class dapat diakses oleh object 
          lain.
          
        - inner class juga dapat didefenisikan sebagai static. sehingga kita dapat membuat object inner class tanpa membuat object outer class.
          namun kita tidak dapat mengakses secara langsung atribut dan method pada outer classnya jika tidak menggunakan kata 'static'.
          Contoh : "Animal.Duck duck = new Animal.Duck();"

    */

    public static void main(String[] args){

        Animal animal1 = new Animal();

        animal1.setFood("dapat berbeda-beda sesuai dengan jenisnya.");

        Animal.Duck duck1 = animal1.new Duck();
        duck1.setFood("Jagung");

        System.out.println("Makanan Hewan "+duck1.getAnimal());
        System.out.println("Makanan Bebek : "+duck1.getFood());

        Animal animal2 = new Animal();

        System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");

        animal2.setFood("Memiliki Banyak jenis.");

        Animal.Duck duck2 = animal2.new Duck();
        duck2.setFood("Konsentrat");

        System.out.println("Makanan Hewan "+duck2.getAnimal());
        System.out.println("Makanan Bebek : "+duck2.getFood());

       
    }
    
}
