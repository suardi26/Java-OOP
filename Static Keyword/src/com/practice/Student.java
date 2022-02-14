package com.practice;

public class Student {
    
    // variabel non static
    String name;
    int NIM;

    // variabel static
    public static String collageName;
    public static int lastNIM = 1000;
    public static String footer = "= = = = = = = = = = = = = = = = = = = = =";
    
    // Constructor
    public Student(String name){

        this.name = name;
        this.NIM = setNIM();
       
    }

    // method static set nama universitas
    public static void setCollageName(String collageName ){

        Student.collageName = collageName;
    }
    
    // method static set NIM
    public static int setNIM(){
        
        Student.lastNIM++;
        
        return lastNIM;
    }

    // method non static
    public void printData(){

        // access non static variabel
        System.out.println("Name\t: "+this.name);
        System.out.println("NIM\t: "+this.NIM);

        // access static variable
        System.out.println("Collage Name : "+Student.collageName);
    }
    
    
    
}
