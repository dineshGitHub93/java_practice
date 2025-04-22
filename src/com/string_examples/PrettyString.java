package com.string_examples;

import java.util.ArrayList;

public class PrettyString {

	public static void main(String[] args) {
		
		//get 2 decimal pointer
		float num = 435.8965f;
		//System.out.printf("Print float num %.2f", num);
		
		//System.out.printf("Hello my name is %s, and i %s my mom and dad ", "Kunja", "love");
		
		double pie = Math.PI;
		System.out.println(pie);
		//System.out.printf("Pie: %.3f", pie);
		
		System.out.println('a'+'b'); // char values are converted into askii and perform sum on top of it.
		
		System.out.println("A"+"b"); // When try to sum two strings , it will concatenate and print it 
		
		System.out.println("A"+1);// int value will be converted into Integer(Wrapper class) and that will call toString()
		
		System.out.println("Kunja"+new ArrayList<>() );
		System.out.println("Kunja"+ new Integer(12));
		
		//System.out.println(new ArrayList<>() + new Integer(12) ); //The operator + is undefined for the argument type(s) ArrayList<Object>, Integer
		
		System.out.println(new ArrayList<>() +""+ new Integer(12) );
	}

}
