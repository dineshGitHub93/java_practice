package com.javaeight.lambda;

import java.util.ArrayList;

public class SingleParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrL = new ArrayList<Integer>();

		//Add elements in the arrayList Object
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		
		//using lambda expression to print all elements 
		//of arrL
		System.out.println("Print elements of ArrayList: ");
		arrL.forEach(n -> System.out.println(n));
		
		//using lambda expression to print all even elements of arrL
		System.out.println("Print Even elements of ArrayList");
		arrL.forEach(n -> {
			if(n%2==0) {
				System.out.println(n);
			}
		});
	}

}
