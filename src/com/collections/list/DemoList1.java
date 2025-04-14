package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class DemoList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits = new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Guva");
		
		//Print elements using classic loop
		for(String f : fruits) {
			System.out.println(f);
		}
		
		//print elements using java 8 forEach loop with lambda
		fruits.forEach(System.out::println);
	}

}
