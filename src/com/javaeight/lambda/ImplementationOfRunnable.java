package com.javaeight.lambda;

public class ImplementationOfRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Child Thread this running");
		}
	}

}
