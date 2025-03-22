package com.learn.interviewquestion;

import java.util.Arrays;

public class EvenOddSeparator {

	public static void rearrangeArray(int[] arr) {
		
		int left = 0, right = arr.length-1;
		
		while(left < right) {
			
			//Move left forward if it's already even
			while(left < right && arr[left]%2==0) {
				left++;
			}
			
			//Move left forward if it's already ODD
			while(left < right && arr[right]%2!=0) {
				right--;
			}
			
			// Swap odd at left with even at right
			if(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 8, 7, 1, 3, 6, 4, 5, 9};
		
		rearrangeArray(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
