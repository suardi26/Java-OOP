package com.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    - try with resources adalah statement try yang mendeklarasikan satu atau lebih resource di dalamnya.
      resource adalah object yang harus ditutup setelah statement terakhir dieksekusi.

    - Di java 7 terdapat fitur yang bernama try with resource.

    - Try with resource adalah sebuah cara untuk menulis sebuah resource/membuat object pada block try dan akan ditutup
      secara otomatis pada saat try-catch selesai dieksekusi.

    - Pada saat kita menggunakan fitur ini maka resource wajib menggunakan interface AutoCloseable ataupun turunannya.
*/
public class Main {

    public static void main(String[] args){

        // try without resource
            BufferedReader br = null;
            try{
                br = new BufferedReader(
                        new FileReader("google.txt")
                );

                while(true){
                    String text = br.readLine();
                    if (text  == null){
                        break;
                    }
                    System.out.println(text);
                }
            }catch(Throwable throwable){
                System.out.println("Membaca file gagal !, Message : "+throwable.getMessage().toString());
            }finally{
                if (br != null){
                   try{
                       br.close();
                       System.out.println("= = = = = = = = = = = = =");
                       System.out.println("Menutup resource berhasil");
                   }catch(IOException ioException){
                       System.out.println("Error !!!, tidak dapat menutup resource !!!, Pesan"+ioException.getMessage());
                    }
                }
            }

        // try with resource
        // try with resource dapat menutup secara otomatis resource yang ditambahkan pada statement try, namun
        // harus turunan dari interface AutoCloseable.
        System.out.println("= = = = = = = = = = = = =");
        System.out.println("Try With Resource.");
        System.out.println("= = = = = = = = = = = = =");
        try(BufferedReader br1 = new BufferedReader(new FileReader("google.txt"))){
            while(true){
                String text1 = br1.readLine();
                if (text1  == null){
                    break;
                }
                System.out.println(text1);
            }
        }catch(Throwable throwable){
            System.out.println("Membaca file gagal !, Message : "+throwable.getMessage().toString());
        }
    }
}
