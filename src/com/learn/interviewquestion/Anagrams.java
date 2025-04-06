package com.learn.interviewquestion;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
	
	public static boolean isAnagram(String str1, String str2) {
		
		if(str1 == null || str2 == null || str1.length() != str2.length()) return false;
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
	
	public static boolean isAnagramUsingHashmap(String str1, String str2) {
		 boolean mainResult = false;

		 if (str1 == null || str2 == null || str1.length() != str2.length()){
		 return false;
		 }
		 HashMap<Character,Integer> charCount = new HashMap<>();
		 str1 = str1.toLowerCase();
		 str2 = str2.toLowerCase();
		 for (char c : str1.toCharArray()) {
		 charCount.put(c, charCount.getOrDefault(c, 0)+1);
		 }
		 System.out.println(charCount);
		 for (char c : str2.toCharArray()){
		 if (!charCount.containsKey(c) || charCount.get(c) == 0){
		 return false;
		 }
		 }
		 return true;
	}

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		System.out.println("Given String are Anagram :"+isAnagram(str1, str2) );
		System.out.println("Result "+isAnagramUsingHashmap(str1, str2));
	}

}
