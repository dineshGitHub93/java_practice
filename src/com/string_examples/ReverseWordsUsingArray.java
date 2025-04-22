package com.string_examples;

public class ReverseWordsUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "programming";
		char[] ch = str.toCharArray();
	
		for(int i=str.length()-1; i>=0;i--) {
			System.out.print(ch[i]);
		}
			
	}

}
