package com.practice;



public class Main {
    
    public static void main(String[] args){
        
        Vehicle vehicle1 = new Vehicle("Tesla","T12",450);
        vehicle1.printData();

        footer();

        Car vehicle2 = new Car("Ford","Mustang",550);
        vehicle2.printData();

        footer();
        
        Car vehicle3 = new Car("Mercedez Benz");
        vehicle3.printData();
        
    }
    public static void footer(){
        String footer = "= = = = = = = = = = = = = =";

        System.out.println(footer);
    }


}

