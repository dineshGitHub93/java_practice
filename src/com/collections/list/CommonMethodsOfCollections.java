package com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CommonMethodsOfCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(2);
		values.add(3);
		values.add(4);
		
		//size() of collection
		System.out.println("size : "+values.size());
		//To check  collection isEmpty() or not
		System.out.println("isEmpty :"+values.isEmpty());
		//To check a specific value contains() in the collection
		System.out.println("Is collection contains() value 5: "+values.contains(5));
		//add 
		values.add(5);
		System.out.println("Value 5 added : "+values.contains(5));
		//remove() using index
		values.remove(3);
		System.out.println("removed using index: "+values.contains(5));
		System.out.println("display values after remove : "+values);
		values.add(3);
		//remove() using objects, removes the first occurrence of the values
		values.remove(Integer.valueOf(3));
		System.out.println("removed using objects :"+values.contains(3));
		Stack<Integer> stackValues = new Stack<Integer>();
		stackValues.add(6);
		stackValues.add(7);
		stackValues.add(8);
		//addAll
		values.addAll(stackValues);
		System.out.println("Add all values using containsAll "+values.containsAll(stackValues));
		System.out.println("Print all values : "+values);
		//containsAll
		values.remove(Integer.valueOf(7));
		System.out.println("To check containAll remove value 7 :"+values.containsAll(stackValues));
		//removeAll
		values.removeAll(stackValues);
		System.out.println("removeAll :"+values.contains(8));
		//clear
		values.clear();
		System.out.println("Clear :"+values.isEmpty());
	}

}
