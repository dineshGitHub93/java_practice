package com.string_examples;

import java.util.Arrays;

public class ReverseArray {

    public static void revArray(int[] arr){

        // we will use two pointer, one pointer will start from the beginning
        //Another one from the back, and we will swap their values.
        int start =0;
        int end = arr.length-1;

        while (start < end) {
            // Swap elements;
            int temp = arr[start]; //1,2,3,4,5
            arr[start] = arr[end]; //5,4,3,2,1
            arr[end] = temp;

        //increase start and decrease end
        start++;
        end--;

        }

    }
    
    public static void main(String[] args) {

        int[] inputArr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(inputArr));// [1,2,3,4,5]
        revArray(inputArr);
        System.out.println(Arrays.toString(inputArr));// [5,4,3,2,1]
    }
}
