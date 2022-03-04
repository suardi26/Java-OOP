package com.practice;

// Outer Class
public class Animal {

    private String food;
   

    public void setFood(String food){
        this.food = food;
    }

    private String getFood(){
        return this.food;
    }

    

    // Inner Class.
    public class Duck{

        public String food;

        public String getAnimal(){
            
            return Animal.this.getFood();
        }
        
        public void setFood(String food){
            this.food = food;
        }
        
        public String getFood(){
            return this.food;
        }

        
    }
}
