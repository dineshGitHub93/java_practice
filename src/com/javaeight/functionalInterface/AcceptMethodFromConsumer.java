package com.javaeight.functionalInterface;

import java.util.function.Consumer;

public class AcceptMethodFromConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> printNumber = (n) -> System.out.println(n*n);
		printNumber.accept(12);

	}

}
