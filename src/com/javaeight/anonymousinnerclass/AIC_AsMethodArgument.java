package com.javaeight.anonymousinnerclass;

public class AIC_AsMethodArgument {

	public static void main(String[] args) {
		
		Firend friend = new Firend();
		friend.howCouldManage(new IManageable() {
			
			@Override
			public void manage() {
			System.out.println("I plan to study well and clear the interview");				
			}
		});
	}

}
