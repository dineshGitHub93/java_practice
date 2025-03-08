package com.javaeight.anonymousinnerclass;

public class AIC_Using_Interface {

	public static void main(String[] args) {
		// To implement a single abstract method using Anonymous Inner class
		Iparent parent = new Iparent() {
			
			@Override
			public void findLifePartner() {
				System.out.println("To implement a single abstract method from interface using Anonymous Inner class");				
			}
		};
		
		parent.findLifePartner();
	}

}
