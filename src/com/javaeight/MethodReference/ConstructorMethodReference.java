package com.javaeight.MethodReference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class ConstructorMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruitsList = Arrays.asList("Mango", "banana", "Orange", "Kiwi", "Orange","Straberry","banana");
		System.out.println("Display elements :"+fruitsList);
		/*
		System.out.println("Remove duplicates using set");
		HashSet<String> removeDuplicates = new HashSet<String>(fruitsList);
		System.out.println(removeDuplicates);
*/
		/*
		System.out.println("Remove duplicates using set with help of lambda ");
		Function<List<String>, Set<String>>  lambda_RemoveDuplicates = list -> new HashSet(list);
		System.out.println(lambda_RemoveDuplicates.apply(fruitsList));
*/
		System.out.println("Remove duplicates using set with help of Method Reference ");
		Function<List<String>, Set<String>> MR_RemoveDuplicates = HashSet :: new;
		System.out.println(MR_RemoveDuplicates.apply(fruitsList));
	}

}
