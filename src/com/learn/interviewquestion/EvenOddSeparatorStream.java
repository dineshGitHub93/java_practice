package com.learn.interviewquestion;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EvenOddSeparatorStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2, 5, 8, 7, 1, 3, 6, 4, 5, 9};
		
		// Using Streams to separate even and odd numbers
		int[] result = IntStream.concat(
				Arrays.stream(arr).filter(n->n%2==0),
				Arrays.stream(arr).filter(n->n%2!=0)
				).toArray();
		System.out.println(Arrays.toString(result));
	}

}

