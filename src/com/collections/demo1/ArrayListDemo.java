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

        System.out.println(list);

        for (String temp : list) {
            
            System.out.println(temp);
        }
    }
}
