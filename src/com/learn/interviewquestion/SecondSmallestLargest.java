package com.learn.interviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestLargest {

	public static void findSecondSmallestLargestWith7(int[] arr) {

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int num : arr) {
			//Smallest and second smallest
			if(num<smallest) {
				secondSmallest = smallest;
				smallest = num;}
			else if(num !=smallest && num < secondSmallest) {
				secondSmallest = num;
			}

			// Largest and second largest
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num != largest && num > secondLargest) {
				secondLargest = num;
			}
		}
		System.out.println("Second Smallest: " + (secondSmallest == Integer.MAX_VALUE ? "Not found" : secondSmallest));
		System.out.println("Second Largest: " + (secondLargest == Integer.MIN_VALUE ? "Not found" : secondLargest));

	}
	public static void findSecondSmallestLargestWith8(int[] arr) {

		// Remove duplicates and sort the array
		List<Integer> sorted = Arrays.stream(arr)
				.distinct()
				.sorted()
				.boxed()
				.collect(Collectors.toList());

		int secondSmallest = sorted.get(1);
		int secondLargest = sorted.get(sorted.size() - 2);

		System.out.println("Second Smallest: " + secondSmallest);
		System.out.println("Second Largest: " + secondLargest);
	}
	public static void main(String[] args) {

		int[] arr = {12, 35, 1, 10, 34, 1};

		if (arr.length < 2) {
			System.out.println("Array must have at least two elements.");
			return;
		}
		//findSecondSmallestLargestWith7(arr);
		findSecondSmallestLargestWith8(arr);
	}

}
