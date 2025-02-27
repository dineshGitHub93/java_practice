package com.collections.demo1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlphabeticalSorting {

	public static void main(String agrs[]) {
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
		
		// Sort in alphabetical order using lambda
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted in alphabetical order: " + names);

        // Sort in reverse alphabetical order using lambda
        Collections.sort(names, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted in reverse alphabetical order: " + names);
	}
}
