package com.oops_framework.learning;

//Base Class
class BaseController {
	
	public void log(String message) {
		System.out.println("Log : "+message);
	}
	
	public void handleError(Exception e) {
		System.out.println("Exception : "+e.getMessage());
	}
	
}

//Derived class
class UserController extends BaseController {
	
	public void createUser() {
		log("Creating user");
		 // User creation logic
	}
}

class ProductController extends BaseController {
	
	public void createProduct() {
		log("Create product");
		// Product creation logic
	}
}
public class InheritanceInFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserController uc = new UserController();
		uc.createUser();
		
		ProductController pc = new ProductController();
		pc.createProduct();
	}

}
