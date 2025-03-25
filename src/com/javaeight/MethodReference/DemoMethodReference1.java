package com.javaeight.MethodReference;

@FunctionalInterface
interface IAdd{
	public void Iadd(int i, int j);
}
public class DemoMethodReference1 {
	
	public static void sum(int i, int j) {
		System.out.println(i+j);
	}

	public static void main(String[] args) {
		//Lambda implementation
		IAdd addition = (i,j)->System.out.println(i+j);
		addition.Iadd(12, 15);
		
		//If we have any existing implementation for the same lambda expression 
		// We can use that method as reference implementation 
		IAdd addSum = DemoMethodReference1::sum;
		addition.Iadd(8, 9);
		addition.Iadd(11, 13);
	}

}
