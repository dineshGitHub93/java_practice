package com.javaeight.stream;

public class Dish {
	
	private String dishName;
	private boolean isVegterian;
	private Type type;
	private int price;
	
	public enum Type{
		STARTER, MAIN_COURSE, CURRY, DESSERTS, BREAKFAST, DESSERT, APPETIZER, BEVERAGE, OTHERS;
	}

	public Dish(String dishName, boolean isVegterian, Type type, int price) {
		super();
		this.dishName = dishName;
		this.isVegterian = isVegterian;
		this.type = type;
		this.price = price;
	}

	public String getDishName() {
		return dishName;
	}

	public boolean isVegterian() {
		return isVegterian;
	}

	public Type getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}
	
	
}
