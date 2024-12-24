package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class AddElementUsingAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> alist = new ArrayList<Integer>();
		
		//Adding elements into collections using add() method
		alist.add(11);
		alist.add(22);
		alist.add(33);
		alist.add(44);
		alist.add(55);
		alist.add(66);
		
		System.out.println(" "+ alist);
		
		//Add element at specified position
		int i = 5;
		alist.add(i, 77);
		System.out.println(" "+alist);

	}

}
