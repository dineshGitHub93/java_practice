package com.collections.list;

import java.util.ArrayList;

public class RemoveDuplicateUsingCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Object for ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Kiwi");
		list.add("Apple");
		list.add("Banana");
		list.add("Kiwi");
		
		//Print elements
		System.out.println("Display elements : "+list);
		
		ArrayList<String> uniqueList = new ArrayList<String>();
		
		for(String elements : list) {
			
			if(!uniqueList.contains(elements)) {
				
				uniqueList.add(elements);
			}
		}
		
		System.out.println("Display Unique : "+uniqueList);
	}

}
