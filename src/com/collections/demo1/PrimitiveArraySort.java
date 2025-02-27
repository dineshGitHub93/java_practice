package com.collections.demo1;

import java.util.Arrays;

public class PrimitiveArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {9,1,5,7,3};
		System.out.println("Print values from Array before sort");
		for(int i : num) {
			System.out.println(i);
		}
		Arrays.sort(num);
		System.out.println("Print values from Array before sort");
		for(int i : num) {
			System.out.println(i);
		}
	}

}
