package com.learn.interviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindtheMissingNumbersUsingStream {

	public static void main(String[] args) {
		
		int[] numbers = {66, 67, 68, 70, 71, 74, 75, 76}; //Series 1...N
		int first = numbers[0];  // Starting number
		int last = numbers[numbers.length - 1];  // Last number
		
		Set<Integer> numberSet = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
		
		List<Integer> missingNumbers = IntStream.range(first, last)
													.filter(n-> !numberSet.contains(n))
													.boxed()
													.collect(Collectors.toList());
		System.out.println("Display Numbers:"+missingNumbers);
	}

}
