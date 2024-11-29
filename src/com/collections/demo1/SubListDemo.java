package com.collections.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubListDemo {
    
    public static void main(String[] args) {
        
        //Create List object and elements using asList() Method
        List<String> animals = Arrays.asList("Cat", "Dog", "Lion", "Tigor","Cheeta");

        System.out.println("Print element after add : "+animals);

        //Create List object and add element using subList() method
        List<String> subAnimal = animals.subList(1, 4);

        //Print element afetr adding 
        System.out.println("Print element using added subList () : "+subAnimal);
        System.out.println("Print elements of parent object : "+animals);
    }
}
