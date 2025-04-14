package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsolidatedListOperations {

	public static void main(String[] args) {
		
		//List object creation new ArrayList<>()
		List<String> fruitsName = new ArrayList<String>(
				Arrays.asList("Apple", "Banana", "Mango", "Apple", "kiwi"));
		System.out.println("Print original elements :"+fruitsName);
		
		//Iterate elements using forEach() or enhanced for-loop
		System.out.println("Iteation: ");
		fruitsName.forEach(fruit -> System.out.println(fruit));
		
		// 3. Sorting (Alphabetical)
		List<String> sortedFruit = new ArrayList<String>(fruitsName);
		sortedFruit.sort(String::compareTo);
		System.out.println("Print sorted List :"+sortedFruit);
	}

}
