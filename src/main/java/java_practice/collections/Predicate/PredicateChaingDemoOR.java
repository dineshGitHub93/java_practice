package java_practice.collections.Predicate;

import java.util.function.Predicate;

public class PredicateChaingDemoOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> IsEven = input -> input%2==0;
		Predicate<Integer> IsGreater = input -> input >=10;
		
		Predicate<Integer> IsEvenOrGrater = IsEven.or(IsGreater);
		
		System.out.println("Check given number is 0 OR Greater than 10 :"+IsEvenOrGrater.test(6));
		System.out.println("Check given number is 0 OR Greater than 10 :"+IsEvenOrGrater.test(3));
		System.out.println("Check given number is 0 OR Greater than 10 :"+IsEvenOrGrater.test(12));
	}

}
