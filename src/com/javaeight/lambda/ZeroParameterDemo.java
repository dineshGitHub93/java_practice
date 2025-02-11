package com.javaeight.lambda;

interface ZeroParameter {
	
	void display();
}
public class ZeroParameterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZeroParameter disp = () -> System.out.println(
			"This is a zero-paramter lambda expression!");
		
		disp.display();

	}

}
