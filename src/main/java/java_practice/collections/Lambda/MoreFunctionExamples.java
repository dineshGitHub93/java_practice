package java_practice.collections.Lambda;

import java.util.function.Function;

public class MoreFunctionExamples {

	public void findSquareRoot() {

		Function<Integer, Integer> squareRoot = a ->a*a;
		System.out.println("Square root value : "+squareRoot.apply(4));
	}

	public void findLength() {
		Function<String, Integer> length = a -> a.length();
		System.out.println("Length of string : "+length.apply("Kunja"));
	}

	public void toUppercase() {

		Function<String, String> uppercase = a -> a.toUpperCase();
		System.out.println("Upgrade to uppercase : "+uppercase.apply("i love my kunja"));
	}

	public void toLowercase() {

		Function<String, String> lowercase = a -> a.toLowerCase();
		System.out.println("Upgrade to lowercase : "+lowercase.apply("I LOVE MY WIFE"));
	}
	
	public void checkEmpty() {

		Function<String, Boolean> empty = a -> a.isEmpty() || a.isBlank() | a.equals("");
		System.out.println("To Check String empty : "+empty.apply(""));
	}


	public static void main(String[] args) {

		MoreFunctionExamples examples = new MoreFunctionExamples();
		examples.findSquareRoot();
		examples.findLength();
		examples.toUppercase();
		examples.toLowercase();
		examples.checkEmpty();
	}

}
