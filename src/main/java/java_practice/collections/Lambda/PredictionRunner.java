package java_practice.collections.Lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredictionRunner {

	public void classicalWay() {
		
		EligibilityCheckDemo check = new EligibilityCheckDemo();
		
		System.out.println(check.ageConditionCheck(13));	
	}
	
	public void usingLambda() {
		
		Predicate<Integer> elig = (age)->age>=18;
		System.out.println(elig.test(20));
		
		Function<Integer, Boolean> cond = age -> age >=20 && age <=50;
		System.out.println(cond.apply(23));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PredictionRunner predi = new PredictionRunner();
		predi.classicalWay();
		predi.usingLambda();
	}

}
