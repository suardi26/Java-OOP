package com.practice;

import java.util.Arrays;

/*
    - Sama seperti class biasa, Enum dapat memiliki attribute, method dan constructor. namun enum berisikan nilai constanta yang secara 
      otomatis memiliki modifier public static dan final, dan enum tidak dapat dibuat object (instansiasi). 

    - Enum class digunakan untuk menampung nilai-nilai terbatas yang sudah ditentukan, seperti jenis kelamin, Nama hari, dll.

    - Pada saat membuat Enum class, maka secara otomatis akan mengekstends class java.lang.Enum sehingga class enum tidak dapat mengekstends
      class lain, akan tetapi bisa implements interface.

    - Seperti class biasanya, class enum pun dapat menambahkan members (attribute, method, dan constructor).

    - Namun untuk constructor kita tidak dapat membuat constructor dengan modifier public hanya bisa modifier private atau default, 
      karena tujuan dari enum class bukan untuk di instansiasi secara bebas.

    - Saat membuat constructor di enum, maka semua opsi nilai constanta enum wajib mamanggil method constructor tersebut misalnya parameter.

    - Enum dapat dibuat didalam class atau didalam file terpisah.


    
*/

public class Main{
    
    public static void main(String[] args){

        Game player1 = new Game();
        player1.setName("Suardi");
        player1.setLevel(Level.EASY);
        System.out.println(player1.getName().toString());
        System.out.println(player1.getLevel());
        System.out.println(player1.getLevel().getDescription());
        System.out.println(Level.EASY.getDescription());
 
        // Konversi enum to String.
        String valueEnum = Level.HARD.name();
        System.out.println(valueEnum);

        // Konversi String to enum.
        Level level = Level.valueOf("MEDIUM");
        System.out.println(level);

        // Mengakses seluruh nilai enum dengan method 'toString()' pada class 'Arrays'.
        Level[] levels = Level.values();
        System.out.println(Arrays.toString(levels));

        // Mengakses seluruh nilai enum dengan for each.
        for (Level value : Level.values()){

            System.out.println(value);
        }
    }
}