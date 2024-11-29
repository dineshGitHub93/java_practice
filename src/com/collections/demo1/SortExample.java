package com.collections.demo1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortExample {
    
    public static void main(String[] args) {
        
        List<String> fruits = Arrays.asList("Orange", "Mango", "Apple", "Banana", "Kiwi");

        //Print element 
        System.out.println("Print elements before sorted :"+fruits);

        //Sorting the list in natural order 
        Collections.sort(fruits);
        System.out.println("Print elements after sorting : "+fruits);

        //Sorting in reverse order
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Print element sorting in reverse order : "+fruits);
    }
}
