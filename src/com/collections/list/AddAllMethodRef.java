package com.collections.list;

import java.util.ArrayList;

public class AddAllMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("Java");
		l1.add("Python");
		
		System.out.println("Print all elements in List1 : "+l1);
		
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("Javasrcipt");
		
		System.out.println("Print all elements in List2 :"+l2);
		
		l1.addAll(l2);
		System.out.println("Print all elements in List1 after add List2 : "+l1);
		
		ArrayList<String> l3 = new ArrayList<String>();
		l3.add("C");
		l3.add("C++");
		l3.add("Ruby");
		
		System.out.println("Print all elements in List3 : "+l3);
		l1.addAll(2, l3);
		
		System.out.println("Print all elements in List1 after add List2 : "+l1);

	}

}
