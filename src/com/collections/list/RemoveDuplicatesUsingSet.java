package com.collections.list;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesUsingSet {

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
		
		//Remove duplicate element from ArrayList.
		//Adding elements in Set object so that it will not allow duplicates
		HashSet<String> set = new HashSet<String>(list);
		
		ArrayList<String> uniqueList = new ArrayList<String>(set);
		
		System.out.println("Unique elements : "+uniqueList);

	}

}
