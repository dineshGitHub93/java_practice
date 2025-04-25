package com.learn.array;

public class LargestValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,5,6,8,4,11};
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i]<largest && arr[i]!=secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println(largest+" "+secondLargest);
	}

}
