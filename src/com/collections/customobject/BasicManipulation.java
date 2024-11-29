package com.collections.customobject;

class Product{

    String name;
    float price;

    //Construtor for feed values to the object
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    //Print method
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    
}
public class BasicManipulation {
    
   public static void main(String[] args) {
    Product produect = new Product("Watch", 1500);
    System.out.println(produect);
    
   }
}
