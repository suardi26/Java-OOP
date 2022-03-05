package com.src;



/*
    - Anonymous Class (class tanpa nama) adalah proses instansiasi object serta mendeklarasikan sebuah class secara langsung.

    - Anonymous Class termasuk Inner class, dimana Outer classnya adalah class dimana kita membuat anonymous Class tersebut.

    - Anonymous class dapat digunkan ketika membuat implementasi interface atau abstract class sederhana, tanpa harus membuat implementasi
      classnya.

    - Karena class Anonymous tidak memiliki nama maka class Anonymous tidak dapat digunakan untuk referensi suatu object/membuat object.

    - Anonymous class biasanya dibuat ketika tidak ingin membuat implementasi dari interface atau class abstract dalam file java yang berbeda
      melainkan diimplementasikan secara langsung pada saat object dibuat/di instance.

    - Class anonymous dapat dibuat di beberapa tempat Seperti :

        - Fields (Properti).

            contoh:
            public class Animal{
                String food;
                int numberOfFeet;
                AnonymousClass variabelReference = new AnonymousClass(){
                    //implementasi.
                }
            }

        - Di dalam method (Parameter atau body).

            contoh:
            Class Animal{
                String food;
                int numberOfFeet;
                Public void eat(new Anonymous(){
                    //implementasi.
                });
                Public void eat(){
                    new Anonymous(){
                        //implementasi.
                    }
                }
            }

        - Instance inisialisasi.

            contoh : 
            private Language variabelReferensi;
            this.variabelReferensi = new Language(){ 
                //implementasi
            }

        - Local Class (Inner Class).

             contoh : 
             public class Animal{
                 public class Cat{
                     public void eat(){
                         new AnonymousClass(){
                            //implementasi
                         }
                     }
                 }
             }
*/

public class Main {
   
    
    public static void main(String[] args) {
        
        Language indonesia = new Language(){

            @Override
            public void sayHello() {
                System.out.println("Halo !!!");
            }

            public void sayHello(String name){
                System.out.println("Halo "+name);
            }
        };

        Language english = new Language() {
           
            @Override
            public void sayHello() {
                System.out.println("Hello !!!");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello "+name);
            }
        };
        System.out.println("= = = = = = = = = ");
        System.out.println("Bahasa Indonesia");
        indonesia.sayHello();
        indonesia.sayHello("Suardi");
        System.out.println("= = = = = = = = = ");
        System.out.println("English");
        english.sayHello();
        english.sayHello("David");

    }

   
}
