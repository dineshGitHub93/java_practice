package com.oops_framework.learning;

//Framework-provided base class
class FrameworkController {
	
	public void execute() {
		System.out.println("Executing default behavior...");
	}
}
//User defined customization
class customController extends FrameworkController {
	
	public void execute() {
		System.out.println("Executing customization behavior...");
	}
}
public class CustomizingController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameworkController fc = new customController();
		fc.execute();
	}

}
