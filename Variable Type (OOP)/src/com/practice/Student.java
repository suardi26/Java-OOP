package com.practice;

public class Student {
    
    // varibel Instance
    public String name;
    public String address;

    // varibel Static
    public static String collageName;

    // Constructor.
    public Student(String name, String address){

        this.name = name;
        this.address = address;
        
    }

    // setter COllage Name 
    public static void setCollageName(String collageName){

        Student.collageName = collageName;
    }

    public void printData(){

        // varibel Local
        String name;
        String address;
        String collageName;

        name = this.name;
        address = this.address;
        collageName = Student.collageName;
       
        System.out.println("Name : "+name);
        System.out.println("address : "+address);
        System.out.println("Collage Name : "+collageName);
    }
    
}
