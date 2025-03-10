package com.javaeight.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaWithComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Before Java 8, sorting a list of strings
		List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve");
		
		System.out.println("Print elements before sort: "+names);
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
		});
		
		System.out.println("Print elements after sort : "+names);
		*/
		
		//After Java 8, sorting a list of strings
		
		List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve");
		System.out.println("Print elements before sort: "+names);
		Collections.sort(names, (s1,s2)-> s1.compareTo(s2));
		System.out.println("Print elements before sort: "+names);
	}

}
