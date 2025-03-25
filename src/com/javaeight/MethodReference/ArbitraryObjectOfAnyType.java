package com.javaeight.MethodReference;

import java.util.function.Function;

public class ArbitraryObjectOfAnyType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, String> lambda_Convert = text -> text.toLowerCase();
		System.out.println(lambda_Convert.apply("KUNJA"));
		
		Function<String, String> methodRef = String :: toUpperCase;
		System.out.println(methodRef.apply("kunjan"));
		
		Function<String, Integer> lambda_Count = text -> text.length();
		System.out.println(lambda_Count.apply("KUNJA"));
		
		Function<String, Integer> methodRefCount = String :: length;
		System.out.println(lambda_Count.apply("kunjan"));

	}

}
