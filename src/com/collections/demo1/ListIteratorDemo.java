package com.collections.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("rat");
        animals.add("rabbit");
        animals.add("dog");

        //Sorting collections
        Collections.sort(animals);

        //Sorting reverse order
        Collections.sort(animals, Collections.reverseOrder());

        //using list-iterator
        ListIterator<String> listIterator = animals.listIterator();

        //forward directional 
        System.out.println("Forward Traversal :");
        while (listIterator.hasNext()) {

            System.out.println(listIterator.next());
        }

        System.out.println("\nBackward Traversal :");
        // Reverse directional
        while (listIterator.hasPrevious()) {

            System.out.println(listIterator.previous());
            
        }
    }
}
