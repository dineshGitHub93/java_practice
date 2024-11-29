package com.collections.demo1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterationExample {

    public static void main(String[] args) {
        
        List<String> colors = Arrays.asList("Blue", "White", "Yellow", "Orange");

        //Iterate through a list using standard for loop
        System.out.println("Iterate using standard for loop : ");
        for (int i = 0; i < colors.size(); i++) {

            System.out.println(colors.get(i));
        }

        //Iterate through a list using enhanced for loop
        System.out.println("\nIterate using enhanced for loop : ");
        for (String temp : colors) {
            System.out.println(temp);
        }

        //Iterate through a list using Iterator interface
        System.out.println("\nIterate a list using iterator : ");
        
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
    
}
