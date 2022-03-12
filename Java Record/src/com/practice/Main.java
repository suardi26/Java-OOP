package com.practice;
    /*
        - Java Record digunakan pembuatan class yang berisikan data yang memiliki method getter,equals,hashCode dan toString method.
        - Java Record digunakan untuk menyimpan data dan bersifat immutability (tidak dapat diubah) hal ini untuk memastikan validasi
          data.
        - Java Record biasanya digunakan pada hasil database, hasil query, dan data lainnya.
        - Java Record memiliki attribut yang diset pada parameter class yang bersifat constant/final dan memiliki akses modifer private
          sehingga tidak dapat diakses secara langsung dan tidak dapat diubah lagi. namun data dapat dipanggil dengan method getternya.
        - Untuk memanggil method getter java record hanya menuliskan nama attributnya diikuti tanda '()'.
        - Pada saat membuat record class maka secara otomatis java akan membuatkan method getter, equals, hashCode, dan toString secara
          otomatis serta constructor secara otomatis.
        - Pada saat membuat record class maka secara otomatis akan mengekstens class java.lang.Record, sehingga tidak dapat
          mengextends class lain, tetapi dapat mengimplement interface.
        - Secara default, class record akan membuat constructor secara otomatis sesuai denga defenisi record/data yang ada pada
          class parameter.
        - Ketika ingin menambahkan statement pada constructor dapat dilakukan dengan membuat
          compact constructor(Constructor tanpa tanda '()').
        - Untuk melakukan constructor overloading kita harus tetap memanggil constructor utama/default yang secara otomatis dibuat
          pada record class.
        - Java Records hadir pada java 14.
    */
public class Main  {

    public static void main(String[] args){

        Database database = new Database("Anu",25);
        System.out.println(database);
        System.out.println(database.name());
        System.out.println(database.age());
        System.out.println(database.getName());
        System.out.println(database.getAge());
        System.out.println("--------------------------------");
        System.out.println(new Database("Romli"));
        System.out.println("--------------------------------");
        System.out.println(new Database());
        System.out.println("--------------------------------");
        System.out.println(new Database("Anu",26));


    }
}
