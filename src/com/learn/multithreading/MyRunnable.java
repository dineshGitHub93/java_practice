package com.learn.multithreading;

public class MyRunnable implements Runnable {

	
	public static void main(String[] args) {
		
		MyRunnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("Thread is running");		
	}

}
