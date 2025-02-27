package com.collections.demo1;

import java.util.Arrays;

public class ObjectArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car[] car = new Car[3];
		
		car[0] = new Car("SUV", "Petrol");
		car[1] = new Car("sedan", "Diesel");
		car[2] = new Car("HatchBack", "CNG");
		
		Arrays.sort(car, (c1,c2)->c1.carType.compareTo(c2.carType));
		System.out.println("Sorted by carType, then by type:");
		for(Car c : car) {
			System.out.println(c);
		}
		
		Arrays.sort(car, (c1,c2)-> c1.carName.compareTo(c2.carName));
		System.out.println("Sorted by name, then by name:");
		for(Car c : car) {
			System.out.println(c);
		}
	}

}
