package com.practice;

public class User {
    
    String name;    // modifier default/tanpa modifer, variabel (atribut) dapat dipanggil (Read/Write) 
                    // pada class lain dan package yang sama.

    public int age; // modifer public, variabel (atribut) dapat dipanggil (Read/Write) pada class lain baik pada  
                    // package yang sama ataupun pada package yang lain.
                    
    protected String phoneNumber; // modifier protected, variabel (atribut) dapat dipanggil (Read/Write) pada class lain baik dalam satu
                                  // package yang sama atau class turunannya.

    private String address; // modifer private, variabel (atribut) hanya dapat dipanggil pada class yang sama.

    public User(String name, int age, String address, String phoneNumber){

        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    // modifier default/tanpa modifer, method dapat dipanggil pada class lain dan package yang sama.
    void print(){
        updateAddress(); // modifer private, method hanya dapat dipanggil pada class yang sama ("User").
        System.out.println("Name\t: "+this.name);
        System.out.println("Age\t: "+this.age);

        // variabel 'address' hanya dapat diakses (read/write) pada classnya sendiri kareana modifier 'private'. 
        System.out.println("Address\t:"+this.address); 
    }

    // modifer public, method dapat dipanggil pada class lain baik pada package yang sama ataupun pada package yang lain.
    public void setName(String name){
        
        this.name = name;

    }

    // modifer private, method hanya dapat dipanggil pada class yang sama.
    private void updateAddress(){ 
        this.address = "Sulawesi Selatan";
    }
}
