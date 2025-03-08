package com.javaeight.anonymousinnerclass;

public class AIC_Using_ConcreteMethod {

	public static void main(String[] args) {
		
		//Instead of crating a separate class for implementing one method
		//Will create a Anonymous inner class and implement that method
		
		Parent child = new Parent() {
			
			public void findLifePartner() {
				System.out.println("Implement child's own method using anonymous inner class");
			}
		};
		
		child.education();
		child.findLifePartner();
		child.leaveAsset();
		
		//If we required to call parent's implementation we'll follow below
		Parent parent = new Parent();
		parent.findLifePartner();
		

	}

}
