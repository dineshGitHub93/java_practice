package com.javaeight.lambda;

public class Traditional_TheadTest {

	public static void main(String[] args) {
		
		ImplementationOfRunnable myRunnable = new ImplementationOfRunnable(); 
		
		Thread thread = new Thread(myRunnable);
		thread.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println("Parent Thread this running");
		}

		//Lambda expression:
		new Thread(()->System.out.println("Runnable interface")).start();
	
	//Before Java 8, we would implement a Runnable like this:
	Runnable r = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Imaplement runnable interface using Anonymous inner class");			
		}
	};
	
	new Thread(r).start();
	
	//With lambda expressions, this can be simplified to:
	Runnable r1 = ()->System.out.println("Implement Runnable interface using lambda expression");
	//To pass this behavior as parameter to Thread class 
	new Thread(r1).start();

}
}