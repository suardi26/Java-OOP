package com.practice;

public class Application {
    
    public static final int PROCESSORS;

    // membuat block static.
    // block static akan dieksekusi terlebih dahulu sebelum mengakses classnya.
    static{

        System.out.println("Akses Block Static !!!!");
        // mengetahui jumlah core processor pada suatu perangkat.
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
