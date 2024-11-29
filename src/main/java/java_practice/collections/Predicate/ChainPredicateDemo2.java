package java_practice.collections.Predicate;

import java.util.function.Predicate;

public class ChainPredicateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> checkStartLetter = s-> s.contains("A");
		
		System.out.println(checkStartLetter.test("Apple"));
		System.out.println(checkStartLetter.test("Sweet"));
	}

}
