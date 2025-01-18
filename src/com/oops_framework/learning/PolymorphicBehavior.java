package com.oops_framework.learning;

//Base class
class Shape {
	
	public void draw() {
		System.out.println("Drawing a shape");
	}
}

//Derived class
class Circle extends Shape {
	
	public void draw() {
		System.out.println("Draw the circle");
	}
}
//Derived class
class Square extends Shape {
	
	public void draw() {
		System.out.println("Draw the square");
	}
}
public class PolymorphicBehavior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape circle = new Circle();
		circle.draw();
		
		Shape square = new Square();
		square.draw();

	}

}
