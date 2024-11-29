package com.collections.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAllMethodDemo {
    
    public static void main(String[] args) {
        
        List<Character> ch = new ArrayList<>();
        ch.add('A');
        ch.add('B');
        ch.add('C');
        ch.add('E');

        System.out.println("Print element : "+ch);

        List<Character> ch1 = Arrays.asList('F','G','H','I');
        System.out.println("Print element of ch1 : "+ch1);

        // Addding element of ch to ch1 
        ch.addAll(ch1);
        System.out.println("Print elements after all together :"+ch);
    }
}
