package com.practice;

public interface Car extends Brand,Price {

    final static int tax  = 2000000;

    public abstract void drive();

    // secara default method ini memiliki modifier public dan juga abstract.
    int getTier();

    // default method.
    default void setTitle(){
        System.out.println("= = = = = = = = = = = = = = = =");
    }
    
    // method static.
    static void setFooter(){
        System.out.println(line());
    }

    // membuat method private.
    private  static String line(){
        
         return "= = = = = = = = = = = = = = = = = = = =";
    }

   
}
