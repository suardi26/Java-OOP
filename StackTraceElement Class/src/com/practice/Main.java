package com.practice;

import java.util.Arrays;

/*
    - StackTraceElement berisi informasi tentang file, package, class, method sampai baris lokasi terjadinya error.
    - Throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan Array dari StackTraceElement object.
    - Class StackTraceElement dapat digunakan untuk menulusuri lokasi terjadinya error.
    - Untuk menggunakan StackTraceElement, dapat memanggil method printStackTrace() dari class Throwable, untuk menampilkan
      detail error StackTraceElement ke console atau dari class StackTraceElement dan memasukan nilai Array dari
      StackTraceElement object dari method getStackTrace() yang ada pada class Throwable.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Test 1 (StackTraceElement)");
            try{
                String[] product = {
                        "Sprite",
                        "Fanta",
                        "Coca-Cola"};
                System.out.println(product[50]);
            }catch(Throwable throwable){
                // automatis
                throwable.printStackTrace();

                // manual
                StackTraceElement[] stackTraceElements = throwable.getStackTrace();
                System.out.println(Arrays.toString(stackTraceElements));

            }

        System.out.println("Test 2 (Multiple StackTraceElement)");

            try{
                sampleError();

            }catch(RuntimeException exception){
                exception.printStackTrace();
            }
        System.out.println("End Of Program");
    }

    // Multiple StackTraceElement
    private static void sampleError() throws RuntimeException{

        try{
            String[] Cars = {
                    "Toyota",
                    "Honda",
                    "Wuling"};
            System.out.println(Cars[50]);

        }catch(Throwable throwable){

            throw new RuntimeException(throwable);
        }
    }
}
