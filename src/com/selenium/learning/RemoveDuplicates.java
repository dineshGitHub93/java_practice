package com.selenium.learning;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Hello";
		StringBuilder output = new StringBuilder();
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(output.indexOf(input.valueOf(ch))==-1) {
				output.append(ch);
			}
		}
		System.out.println(output);
	}

}
