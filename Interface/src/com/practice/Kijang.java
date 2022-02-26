package com.practice;

public class Kijang implements Car,IsMaintance{

    @Override
    public void drive(){
        System.out.println("Mengemudi mobil Kijang");
    }

    @Override
    public int getTier(){

        return 4;
    }
    
    // melakukan override default method dari interface.
    @Override
    public void setTitle(){
    
        System.out.println("= = = = = = = = Mobil = = = = = = = =");
    }

    @Override
    public String getBrand() {
        
        return "Toyota";
    }

    @Override
    public boolean isMaintance() {
        
        return true;
    }

    @Override
    public int price() {
        
        return 300000000;
    }
    
    
    
}
