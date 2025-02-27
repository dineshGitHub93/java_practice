package com.collections.demo1;

public class Car implements Comparable<Car>{
	
	String carName ;
	String carType ;
	
	public Car(String carName, String carType) {
		super();
		this.carName = carName;
		this.carType = carType;
	}

	@Override
	public int compareTo(Car o2) {
		return this.carName.compareTo(o2.carName);
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carType=" + carType + "]";
	}
	
	

}
