package com.shape;

public class Triangle extends Shape {
    
    private double base;
    private double height;

    public Triangle(int base, int height){

        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
       
        return (base * height) / 2;
    }
}
