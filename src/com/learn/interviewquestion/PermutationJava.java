package com.learn.interviewquestion;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PermutationJava {
	public static Stream<String> permutationJava8(String str){
		if(str.isEmpty()) {
			return Stream.of("");
		}
		return IntStream.range(0, str.length())
				.boxed()
				.flatMap(i -> {
					char c = str.charAt(i);
					String remainder = str.substring(0, i) + str.substring(i+1);
					return permutationJava8(remainder).map(s->c+s);
				});
	}

	public static void permutationJava7(String prefix, String str){
		int n = str.length();

		if(n==0) {
			System.out.println(prefix);
		}
		else{
			for(int i = 0; i<n; i++) { //Recurse : str.charAt(i) and add it to prefix and Remove it from str (using substring).
				permutationJava7(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1));
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		permutationJava8("ABC").forEach(System.out::println);
		permutationJava7("", "ABC");
	}

}
