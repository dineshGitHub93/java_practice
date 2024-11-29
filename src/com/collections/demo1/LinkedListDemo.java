package com.collections.demo1;

import java.util.LinkedList;

public class LinkedListDemo {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(10);
        llist.add(20);
        llist.add(30);

        System.out.println("Print elements : "+llist);

        //Add element in specific location
        llist.add(1, 45);
        System.out.println("Print afetr adding element :"+llist);

        //Remove element using object
        llist.remove(3);
        System.out.println("Print after removed element : "+llist);

        
    }
}
