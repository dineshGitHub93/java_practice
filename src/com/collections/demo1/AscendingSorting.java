package com.collections.demo1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AscendingSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number = Arrays.asList(8,2,7,1,9,3,5,4,18,19);
		
		System.out.println("Sort in ascending order using lambda");
		Collections.sort(number, (s1,s2)->s1-s2);
		number.forEach(System.out::println);

		System.out.println("Sort in decending order using lambda");
		Collections.sort(number, (s1,s2)->s2-s1);
		number.forEach(System.out::println);
	}

}
