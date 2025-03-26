package com.javaeight.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.javaeight.sorting.Mobile2.Brand1;


public class MobileRunner2 {
	

	public static void main(String[] args) {
		
		List<Mobile2> mobileList = new ArrayList<Mobile2>();
		mobileList.add(new Mobile2(Brand1.APPLE, "iPhone 15", 128, 999));
		mobileList.add(new Mobile2(Brand1.APPLE, "iPhone 14", 256, 899));
		mobileList.add(new Mobile2(Brand1.SAMSUNG, "Galaxy S23", 128, 799));
		mobileList.add(new Mobile2(Brand1.SAMSUNG, "Galaxy Z Fold 5", 512, 1799));
		mobileList.add(new Mobile2(Brand1.ONEPLUS, "Pixel 8", 128, 699));
		mobileList.add(new Mobile2(Brand1.REALME, "Pixel 7 Pro", 256, 899));
		mobileList.add(new Mobile2(Brand1.ONEPLUS, "OnePlus 11", 256, 699));
		mobileList.add(new Mobile2(Brand1.ONEPLUS, "OnePlus Nord 3", 128, 499));
		mobileList.add(new Mobile2(Brand1.XIOMI,"Mi 13 Pro", 512, 1099));
		mobileList.add(new Mobile2(Brand1.OPPO,"Find X5", 256, 899));
		mobileList.add(new Mobile2(Brand1.OPPO,"Reno 10", 128, 599));
		mobileList.add(new Mobile2(Brand1.SONY, "Xperia 1 V", 256, 1199));
		mobileList.add(new Mobile2(Brand1.SAMSUNG,"ROG Phone 7", 512, 1299));
		mobileList.add(new Mobile2(Brand1.REALME, "GT Neo 5", 256, 549));
		mobileList.add(new Mobile2(Brand1.MOTO, "Moto fusion", 128, 299));
		mobileList.add(new Mobile2(Brand1.MOTO, "Moto Saga", 128, 699));
		
		System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n", "Brand1", "MODEL","MEMORY", "PRICE");
		System.out.printf("------------------------------------------------------------------%n");
		for(Mobile2 mobiles : mobileList) {
			System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n", mobiles.getBrand(), mobiles.getModel(), mobiles.getMemory(), mobiles.getPrice() );
		}
		
		System.out.println("Low to High");
		Collections.sort(mobileList, new SotingByPriceLowtoHigh());
		System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n", "Brand1", "MODEL","MEMORY", "PRICE");
		System.out.printf("------------------------------------------------------------------%n");
		for(Mobile2 mobiles : mobileList) {
			System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n", mobiles.getBrand(), mobiles.getModel(), mobiles.getMemory(), mobiles.getPrice() );
		}
		
		System.out.println("High to Low");
		Collections.sort(mobileList, new SortingPriceHightoLow());
		System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n", "Brand1", "MODEL","MEMORY", "PRICE");
		System.out.printf("------------------------------------------------------------------%n");
		for(Mobile2 mobiles : mobileList) {
			System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n", mobiles.getBrand(), mobiles.getModel(), mobiles.getMemory(), mobiles.getPrice() );
		}

	}

}
