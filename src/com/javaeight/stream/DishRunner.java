package com.javaeight.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DishRunner {
	
	static List<Dish> menu = null;
	
	public static void getNonVegItemsByPriceLowToHigh() {
		
		List<Dish> nonVegLowToHighList  = new ArrayList<Dish>();
		
		for(Dish dish : menu) {
			
			if(!dish.isVegterian()) {
				nonVegLowToHighList.add(dish);
			}
		}
		
		Collections.sort(nonVegLowToHighList, new Comparator<Dish>() {

			@Override
			public int compare(Dish o1, Dish o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getPrice(), o2.getPrice());
			}
		});
		System.out.println("-------MENU----------");
		for (Dish dish : nonVegLowToHighList) {
			System.out.println(dish.getDishName());
		}
	}
	
	public static void main(String args[]) {
		
		Dish dish1 = new Dish("Chicken Biryani", false, Dish.Type.MAIN_COURSE, 120);
		Dish dish2 = new Dish("Paneer Butter Masala", true, Dish.Type.MAIN_COURSE, 150);
		Dish dish3 = new Dish("Mutton Rogan Josh", false, Dish.Type.MAIN_COURSE, 200);
		Dish dish4 = new Dish("Masala Dosa", true, Dish.Type.BREAKFAST, 180);
		Dish dish5 = new Dish("Egg Curry", false, Dish.Type.MAIN_COURSE, 110);
		Dish dish6 = new Dish("Vegetable Pulao", true, Dish.Type.MAIN_COURSE, 130);
		Dish dish7 = new Dish("Fish Curry", false, Dish.Type.MAIN_COURSE, 170);
		Dish dish8 = new Dish("Chole Bhature", true, Dish.Type.BREAKFAST, 190);
		Dish dish9 = new Dish("Gulab Jamun", true, Dish.Type.DESSERT, 250);
		Dish dish10 = new Dish("Chocolate Brownie", true, Dish.Type.DESSERT, 280);
		Dish dish11 = new Dish("Grilled Chicken", false, Dish.Type.APPETIZER, 220);
		Dish dish12 = new Dish("Spring Rolls", true, Dish.Type.APPETIZER, 90);
		Dish dish13 = new Dish("Pasta Alfredo", true, Dish.Type.MAIN_COURSE, 160);
		Dish dish14 = new Dish("Lemonade", true, Dish.Type.BEVERAGE, 50);
		Dish dish15 = new Dish("Mango Lassi", true, Dish.Type.BEVERAGE, 75);
		menu = Arrays.asList(dish1,dish2,dish3,dish4,dish5,dish6,dish7,dish8,dish9,dish10,dish11,dish12,dish13,dish14,dish15);
		System.out.println("-------MENU----------");
		
		for (Dish dishes : menu) {
			System.out.println(dishes.getDishName());
		}
		
		getNonVegItemsByPriceLowToHigh();
	}

}
