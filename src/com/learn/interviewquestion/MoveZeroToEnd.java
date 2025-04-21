package com.learn.interviewquestion;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZeroToEnd {

	public static void moveZerosToEndWithJava7(int[] num) {
		System.out.println("Before: "+Arrays.toString(num));
		int index =0;
		// If the current number is not zero, it moves it to the current index, then increments index.
		for(int i=0; i<num.length;i++) {
			if(num[i]!=0) { 
				num[index++]=num[i];
			}
		}
		while(index < num.length) {
			num[index++]=0;
		}
		System.out.println("After: "+Arrays.toString(num));
	}
	
	public static void moveZerosToEndWithJava8(int[] num) {
		System.out.println("Before: "+Arrays.toString(num));
		
		int[] result = IntStream.concat(
				Arrays.stream(num).filter(i->i!=0), 
				Arrays.stream(num).filter(i->i==0)
				).toArray();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] num = {0,1,0,3,12};


	}

}
