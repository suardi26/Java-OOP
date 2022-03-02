package com.practice;

public class Product {
    
    public int idProduct;
    public String nameOfProduct;
    
    public Product(int idProduct, String nameOfProduct){

        this.idProduct = idProduct;
        this.nameOfProduct = nameOfProduct;
    }

    @Override
    public boolean equals(Object obj) {
        
        if ( obj == this){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) return false;

        Product product = (Product) obj;

        if (idProduct != product.idProduct) return false;
        return nameOfProduct != null ? nameOfProduct.equals(product.nameOfProduct) : product.nameOfProduct == null;
    }

    @Override
    public int hashCode() {
        
        int result = this.nameOfProduct != null ? this.nameOfProduct.hashCode() : 0;
        result = 31 * result + this.idProduct;
        return result;
        
    }
}
