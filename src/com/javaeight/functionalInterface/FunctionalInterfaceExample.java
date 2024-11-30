package com.javaeight.functionalInterface;

@FunctionalInterface
interface Greeting {
	
	public void sayHello(String str);
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greeting greetings = name -> System.out.println("Hello "+name+" Welcome to learathon..!");
		greetings.sayHello("Kunja");
		
		Greeting annonymousGreet = new Greeting() {
			
			@Override
			public void sayHello(String str) {
				
				System.out.println("Hello "+str+" Congrats now you're scrum master..!");
			}
		};
		annonymousGreet.sayHello("Gayathri");
	}

}
