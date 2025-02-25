package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManipulateUsingListAndItearate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		//Traverse collection object using Iterator
		System.out.println("Iterating values from collection object using iterator method");
		Iterator<Integer> values = numbers.iterator();
		while(values.hasNext()) {
			int val = values.next();
			System.out.println(val);
			if(val == 3) {
				values.remove();
			}
		}
		
		// Traverse collection object using foreach-loop
		System.out.println("Iterating values from collection object using Enhanced for-loop");
		for(int num : numbers) {
			System.out.println(num);
		}
		
		// Traverse collection object using foreach() Lambda
		System.out.println("Iterating values from collection object using Lambda & forEach method");
		numbers.forEach((Integer val)-> System.out.println(val));
	}

}
