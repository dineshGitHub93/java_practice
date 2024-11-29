package java_practice.collections.Predicate;

import java.util.function.Predicate;

public class PredicateChaniningDemo {
	
	public static void main(String args[]) {
		
		Predicate<Integer> IsNumberEven = input -> input %2==0;
		
		Predicate<Integer> IsGreaterThanValue = input -> input >=20;
		
		System.out.println("Check Given Number is Even or ODD : "+IsNumberEven.test(12));
		System.out.println("Check Given Number is Greater than 20 : "+IsGreaterThanValue.test(26));
	}

}
