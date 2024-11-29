package com.collections.demo1;

import java.util.ArrayList;
import java.util.List;

public class CovertToArray {
    
    public static void main(String[] args) {
        
        List<String> listColors = new ArrayList<>();
        listColors.add("Blue");
        listColors.add("Green");
        listColors.add("Yellow");
        listColors.add("White");

        //Convert List to Array
        String[] colors = listColors.toArray(new String[0]);

        System.out.println("Print the Arrays element converted from List :");

        for (String temp : colors) {
            
            System.out.println(temp);
        }
    }
}
