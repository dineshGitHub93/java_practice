package java_practice.collections.BulitInFunction;

import java.util.function.Predicate;

class Eligibility {
	
	public boolean checkElig(int age) {
		
		if(age>=18)
			return true;
		else
			return false;
	}
}

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eligibility elig = new Eligibility();
		System.out.println(elig.checkElig(20));
		
	Predicate<Integer> elig1 =	(age) ->age>=18;
	System.out.println(elig1.test(16));

	}

}
