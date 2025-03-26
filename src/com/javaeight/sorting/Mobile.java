package com.javaeight.sorting;

public class Mobile implements Comparable<Mobile>{
	
	enum Brand {
		APPLE, SAMSUNG, SONY, REDMI, XIOMI, VIVO, REALME, OPPO, ONEPLUS, MOTO;
	}
	
	public Brand brand;
	public String model;
	public int memory;
	public double price;
	
	public Mobile(Brand brand, String model, int memory, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.memory = memory;
		this.price = price;
	}

	public Brand getBrand() {
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

	@Override
	public int compareTo(Mobile o) {
		
		if(this.price > o.price) {
			return 1;
		}
		else if(this.price < o.price) {
			return -1;
		}
		else
		return 0;
	}
	
	

}
