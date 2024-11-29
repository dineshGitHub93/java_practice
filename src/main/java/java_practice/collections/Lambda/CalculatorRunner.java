package java_practice.collections.Lambda;

public class CalculatorRunner {
	
	
	public void classicalWay() {
		
		CalculatorImpl calc = new CalculatorImpl();
		System.out.println(calc.sum(11, 18));
		
	}
	
	public void annonymousWay() {
		Icalculator calc = new Icalculator() 
		{
			@Override
			public int sum(int a, int b) {
				return a+b;
			}
		};
		System.out.println(calc.sum(29, 1));
	}
	
	public void usingLambda() {
//		Icalculator calc = (int a, int b)->{return a+b;}; // Step1
		Icalculator calc = (a, b)->a+b; // Step2
		System.out.println(calc.sum(10, 5));
	}

	public static void main(String[] args) {

		CalculatorRunner calc = new CalculatorRunner();
		calc.classicalWay();
		calc.annonymousWay();
		calc.usingLambda();
		
	}

}
