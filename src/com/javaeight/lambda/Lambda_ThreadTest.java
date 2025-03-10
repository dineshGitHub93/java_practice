package com.javaeight.lambda;

public class Lambda_ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread(()->{
			for(int i=0; i<=5;i++) {
				System.out.println("Child Thread is running...!");
			}
		});
		thread.start();
		
		for(int i=0; i<=5;i++) {
			System.out.println("Parent Thread is running...!");
		}
	}

}
