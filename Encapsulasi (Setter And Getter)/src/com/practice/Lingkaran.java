package com.practice;

public class Lingkaran {
    
    private double diameter;
    private double jari2;
    private double luasLingkaran;
    
    public Lingkaran(){
        this.diameter = 0;
        this.jari2 = 0;
        this.luasLingkaran = 0;

    }

    // method setter.
    public void setDiameter(double diameter){

        this.diameter = diameter;
    }

    // method getter.
    public double getDiameter(){
        
        return this.diameter; 
    }

    // method getter.
    public double getJari2(){
        
        this.jari2 = this.diameter/2;

        return this.jari2; 
    }

    // method getter.
    public double getLuasLingkaran(){

        return 3.14 * ((this.diameter/2)*(this.diameter/2));
    }

    public void printData(){

        System.out.println("Diameter : "+this.diameter );
        System.out.println("Jari-Jari : "+(this.diameter/2));
        System.out.println("==================");
    }
    

}
