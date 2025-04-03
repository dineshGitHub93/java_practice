package com.learn.interviewquestion;

import java.util.Arrays;

public class FindTheMissingNumber {

	public static void main(String[] args) {

		int[] numbers = {66, 67, 68, 70, 71};
		
		int acutalCount = numbers.length;
		int first = numbers[0];
		int last = numbers[acutalCount-1];
		
		
		//Calculate A = n (n+1)/2 where n is largest number in series 1…N
		int expectedSum = (acutalCount+1) * (first + last ) / 2;
		int actualSum = Arrays.stream(numbers).sum();
		
		//Missing number = A – B
		System.out.println("Missing number "+(expectedSum-actualSum));
	}

}
