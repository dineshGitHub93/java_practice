package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoOfCollections {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		
		System.out.println("Max values : "+Collections.max(values));
		System.out.println("Min values : "+Collections.min(values));
		Collections.sort(values);
		System.out.println("Sorted");
		values.forEach((Integer val)->System.out.println(val));

		
	}

}
