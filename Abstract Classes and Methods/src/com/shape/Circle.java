package com.shape;

public class Circle extends Shape {
    
   
    private double radius;

    public Circle(int radius){

        this.radius = radius;
    }

    @Override
    public double getArea() {
       
        return (Math.PI * ( radius * radius));
    }
   
}
