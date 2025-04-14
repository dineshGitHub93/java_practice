package com.collections.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFilterByNames {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna", "Kamal", "Anbu");
		
		names.stream().sorted().forEach(System.out::print);
		System.out.println();
		
		List<String> filteredData  = names.stream()
											.filter(name -> name.startsWith("A"))
											.collect(Collectors.toList());
		
		System.out.println("Print element after filtered :"+filteredData);
		
				
	}

}
