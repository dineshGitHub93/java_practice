package com.learn.array;

public class SmallestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,-21,6,1,4,7,3,8,2,0,-5,-18,};
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i]>smallest && arr[i]!=secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println(smallest+" "+secondSmallest);
	}

}
