package com.collections.demo1;

import java.util.ArrayList;

public class ArrayListDemo {
    
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("AC");
        list.add("Monitor");
        list.add("Television");
        list.add("remote");
        list.add("Wireless connection");
        list.add("Monitor");

        System.out.println(list);

        //Accessing element 
        System.out.println("Element at index 1: "+list.get(2));

        //Modifying element 
        list.set(3, "Tablet");
        System.out.println("Print after modifying element : "+list);

        //Removing element
        list.remove(5);
        System.out.println("Print after removing element :"+list);

        //Check if element exist
        System.out.println("Check 'Tablet' is exist : "+list.contains("Tablet"));

        for (String temp : list) {
            
            System.out.println(temp);
        }

        list.removeAll(list);
        System.out.println("Print after remove all element :"+list);
    }
}
