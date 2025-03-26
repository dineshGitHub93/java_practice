package com.javaeight.sorting;

public class Mobile2 {
	
	enum Brand1 {
		APPLE, SAMSUNG, SONY, REDMI, XIOMI, VIVO, REALME, OPPO, ONEPLUS, MOTO;
	}
	
	public Brand1 brand;
	public String model;
	public int memory;
	public double price;
	
	public Mobile2(Brand1 brand, String model, int memory, double price) {
		this.brand = brand;
		this.model = model;
		this.memory = memory;
		this.price = price;
	}

	public Brand1 getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getMemory() {
		return memory;
	}

	public double getPrice() {
		return price;
	}	

}
