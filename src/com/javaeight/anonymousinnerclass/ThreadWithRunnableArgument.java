package com.javaeight.anonymousinnerclass;

public class ThreadWithRunnableArgument {

	public static void main(String[] args) {
		
		//Approch1
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Approch 1: Anonymous inner class method agrument examples");				
			}
		});
		thread.start();
		
		//Approch2
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Approch 2: Anonymous inner class method agrument examples");
				
			}
		}).start();
	}

}
