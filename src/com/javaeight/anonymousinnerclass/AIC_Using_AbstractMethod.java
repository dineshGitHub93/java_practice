package com.javaeight.anonymousinnerclass;

public class AIC_Using_AbstractMethod {

	public static void main(String[] args) {
		
		ParentAbs child = new ParentAbs() {
			
			@Override
			public void findLifePartner() {
				//Create Anonymous inner class to implement the methods, A separate concrete class is not required for implementing one or two methods
				System.out.println("Implement the un-implemented abstract method using anonymous inner class");
			}
		};

		child.findLifePartner();
	}

}
