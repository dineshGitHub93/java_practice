package com.collections.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoDistinctValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> num = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 65, 77, 88, 99, 77, 65, 54, 64);
		System.out.println(num);
		List<Integer> distinctNum = num.stream()
										.distinct()
										.collect(Collectors.toList());
		
		System.out.println(distinctNum);
		
		num.addAll(distinctNum);
		
		System.out.println(num);
	}

}
