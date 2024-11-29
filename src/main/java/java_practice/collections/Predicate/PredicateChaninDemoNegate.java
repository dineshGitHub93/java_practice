package java_practice.collections.Predicate;

import java.util.function.Predicate;

public class PredicateChaninDemoNegate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> IsEven = input -> input%2==0;
		
		System.out.println("Check given number is Even or ODD :"+IsEven.test(3));
		System.out.println("Check given number is Even or ODD :"+IsEven.test(8));
	}

}
