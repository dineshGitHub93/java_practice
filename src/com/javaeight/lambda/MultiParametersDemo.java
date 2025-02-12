package com.javaeight.lambda;

interface Functional {
	int operational(int a, int b);
}

public class MultiParametersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Functional fn = (a, b)-> {return a+b;};
		System.out.println("Sum of value a & b : "+fn.operational(12, 18));
	}

}
