package com.oops_framework.learning;

public class MessageUtil {
	
	private String message;
	
	//constructor
	//@Param message to be printed
	public MessageUtil(String msg) {
		this.message = msg;
	}

	public String printMessage() {
		System.out.println(message);
		return message;
		
	}
}
