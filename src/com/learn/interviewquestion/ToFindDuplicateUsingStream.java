package com.learn.interviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToFindDuplicateUsingStream {

	public static void main(String[] args) {

		// Define a string.
		String words = "Hello world hello Java world Java";

		// Convert to lowercase and split into words
		List<String> list = Arrays.asList(words.toLowerCase().split(" "));

		// Count occurrences using Streams and Collectors
		Map<String, Long> wordCounts = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Print duplicate words (count > 1)
		System.out.println("Duplicate words in the given string:");
		wordCounts.entrySet().stream()
		.filter(x -> x.getValue()>1)
		.forEach(System.out::println);

	}

}
