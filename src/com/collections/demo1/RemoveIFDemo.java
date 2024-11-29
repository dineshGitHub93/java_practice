package com.collections.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIFDemo {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(12,11,10,8,1,15,16,35,45);

        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(numbers);

        System.out.println("Print elements before remove : "+numbers);

        //conditions for remove number more than 15
        num.removeIf(n -> n>15);

        System.out.println("Print elements after removed " +num);
    }
}
