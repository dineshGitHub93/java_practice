package com.javaeight.lambda;

interface FunInterfaceDemo {
	
	//An abstract function 
	void abstractFun(int x);
	
	//A non-abstract or default function
	default void regularFun() {
		System.out.println("Hello");
	}
}

public class LambdaDemo {
    
    public static void main(String[] args) {

    	 // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
    	
    	FunInterfaceDemo obj = (int x )->System.out.println(2*x);
    	obj.abstractFun(12);
    }
}
