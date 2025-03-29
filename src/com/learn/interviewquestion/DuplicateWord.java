package com.learn.interviewquestion;

import java.util.Iterator;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Big black bug bit a big black dog on his big black nose";
		int count;
		
		//covert the String into lowercase
		text = text.toLowerCase();
		
		//Split the string into words using built-in function
		String words[]= text.split(" ");
		
		System.out.println("Duplicate words in a given string : ");
		
		for(int i =0; i<words.length; i++) {
			count = 1;
			for(int j=i+1; j<words.length; j++){
				if(words[i].equals(words[j])) {
					count++;
					//set words[j] to 0 avoid printing visited word
					words[j]="0";
				}
			}
			
			//Displays the duplicate word if count is greater than 1
			if(count > 1 && words[i] != "0")
			System.out.println(words[i]);
		}

	}

}
