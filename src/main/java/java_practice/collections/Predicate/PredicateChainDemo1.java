package java_practice.collections.Predicate;

import java.util.function.Predicate;

public class PredicateChainDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> isValidAge = input -> input>=15;
		
		Predicate<Integer> IsGDP = input -> input >15;
		
		Predicate<Integer> IsEligibileForScience = isValidAge.and(IsGDP);
		
		System.out.println("Check Student Eligible for 1st Group : "+IsEligibileForScience.test(18));

	}

}
