package com.string_examples;

import java.util.function.Predicate;

public class MaxNumber {
    
    public static int MaxNumber(int[] arr){

        int max = arr[0];

        for (int num : arr) {
            
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        
        System.out.println(MaxNumber(new int[]{12,87,92,201,301,03,02})); //301
        System.out.println(MaxNumber(new int[]{15,2,01,8})); //15
    }
}
