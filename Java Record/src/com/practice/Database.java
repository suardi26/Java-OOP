package com.practice;

public record Database(String name, int age) {


    // Compact constructor(Constructor tanpa tanda '()').
    public Database{
        System.out.println("Membuat Constructor record class");
    }

    // Overloading constructor pada record class.
    public Database(String name){

        this(name,0);
    }

    // Overloading constructor pada record class.
    public Database(){
        this("",0);
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
