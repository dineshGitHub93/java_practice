package com.string_examples;

public class MinNumber {
    
    public static int minNumber(int[] arr){

        int min = arr[0];

        for(int i=0; i<=arr.length-1; i++){
            
            if (min > arr[i]) {
                min = arr[i];    
            }
           
        }
        return min;
    }
    public static void main(String[] args) {
        
        System.out.println(minNumber(new int[]{301,701,987,1,06,108,1023}));//1
        System.out.println(minNumber(new int[]{12,7,8,95,64,0,65,4,1}));//0
    }
}
