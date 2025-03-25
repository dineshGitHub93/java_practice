package com.javaeight.MethodReference;

interface Icall {
	public void call(String name);
}
public class InstanceMethodReference {

	public void wish(String name) {
		System.out.println("Good Morning : "+name);
	}
	
	public static void main(String[] args) {
		
		InstanceMethodReference name = new InstanceMethodReference();
		
		Icall invite = name::wish;
		invite.call("Dinesh");
		
		
	}

}