package com.learn.interviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class pushZerosToEnd {

	public static int[] moveZerosToEndWithJava7(int[] arr, int n) {
		System.out.println("Array before pushing all zeros to end of array:");
		Arrays.stream(arr).forEach(i ->System.out.print(i+", "));
		int count =0;// Count of non-zero elements

		//replace the element at index 'count' with this element
		for(int i =0; i<n ;i++) {
			if(arr[i]!=0)
				arr[count++]= arr[i];
		}
		// Make all elements 0 from count to end.
		while(count <n) {
			arr[count++] = 0;
		}
		return arr;

	}

	public static int[] moveZerosToEndWithJava8(int[] arr) {

		System.out.println("Array before pushing all zeros to end of array:");
		Arrays.stream(arr).forEach(i ->System.out.print(i+", "));
		//create a List with non-zero values;
		List<Integer> nonZeroList = Arrays.stream(arr)
				.filter(n -> n!=0)
				.boxed()
				.collect(Collectors.toList());

		// Calculate how many zeros were removed
		int nonZeroElementCount = arr.length - nonZeroList.size();

		// Add zeros at the end
		for(int i =0; i<nonZeroElementCount; i++) {
			nonZeroList.add(0);
		}
		// Convert back to int[]
		return nonZeroList.stream().mapToInt(Integer::intValue).toArray();
	}
	public static void main(String[] args) {
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		int n = arr.length;
		
		int result[] = moveZerosToEndWithJava7(arr, n);
		System.out.println("\nArray After pushing all zeros to end of array:");
		Arrays.stream(result).forEach(i ->System.out.print(i+", "));

	}

}
