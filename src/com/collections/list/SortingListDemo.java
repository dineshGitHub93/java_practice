package com.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(5,3,9,8,4,3,1);
		System.out.println("Print elements before sort: "+numbers);
		
		//Sorts elements in Ascending oder using collections
		Collections.sort(numbers);
		System.out.println("Print elements after sorting in Ascending :"+numbers);
		
		//Sort in decending order
		numbers.sort(Collections.reverseOrder());
		System.out.println("Print elements after soring in Decending order :"+numbers);
		
	}

}
