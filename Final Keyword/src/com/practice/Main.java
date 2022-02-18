package com.practice;
/*
    - Keyword final adalah sebuah modifier untuk menentukan perilaku dari class, atribut serta method.
      
    - Final Class adalah class yang tidak dapat diturunkan kepada class lain.
    - Final Variabel adalah variabel yang nilainya tidak bisa diubah baik pada classnya maupun pada class turunan. Namun pada Final variabel
      dapat diturunkan pada subclassnya.
    - Final Method dapat di diwariskan pada subclass namun tidak bisa dioverride. Final method juga dapat di overload tapi sebaiknya
      menggunakan keyword 'final' di setiap method overloadnya.
    - Overridding Method dilakukan dengan menggunakan modifier yang sama atau lebih luas dari modifier dari superclassnya.
      Misalnya pada superclass menggunakan modifier default (tanpa menggunakan modifier) maka subclass harus menggunakan modifier default
      atau lebih luas lagi seperti public pada method overridding.

    
*/
public class Main {
     public static void main(String[] args){

        Animal cat = new Cat("fish", 4);
        cat.printData();
           
     }


}
