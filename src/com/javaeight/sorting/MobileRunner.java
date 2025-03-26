package com.javaeight.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.javaeight.sorting.Mobile.Brand;

public class MobileRunner {
	

	public static void main(String[] args) {
		
		
		List<Mobile> mobileList = new ArrayList<Mobile>();
		mobileList.add(new Mobile(Brand.APPLE, "iPhone 15", 128, 999));
		mobileList.add(new Mobile(Brand.APPLE, "iPhone 14", 256, 899));
		mobileList.add(new Mobile(Brand.SAMSUNG, "Galaxy S23", 128, 799));
		mobileList.add(new Mobile(Brand.SAMSUNG, "Galaxy Z Fold 5", 512, 1799));
		mobileList.add(new Mobile(Brand.ONEPLUS, "Pixel 8", 128, 699));
		mobileList.add(new Mobile(Brand.REALME, "Pixel 7 Pro", 256, 899));
		mobileList.add(new Mobile(Brand.ONEPLUS, "OnePlus 11", 256, 699));
		mobileList.add(new Mobile(Brand.ONEPLUS, "OnePlus Nord 3", 128, 499));
		mobileList.add(new Mobile(Brand.XIOMI,"Mi 13 Pro", 512, 1099));
		mobileList.add(new Mobile(Brand.OPPO,"Find X5", 256, 899));
		mobileList.add(new Mobile(Brand.OPPO,"Reno 10", 128, 599));
		mobileList.add(new Mobile(Brand.SONY, "Xperia 1 V", 256, 1199));
		mobileList.add(new Mobile(Brand.SAMSUNG,"ROG Phone 7", 512, 1299));
		mobileList.add(new Mobile(Brand.REALME, "GT Neo 5", 256, 549));
		mobileList.add(new Mobile(Brand.MOTO, "Moto fusion", 128, 299));
		mobileList.add(new Mobile(Brand.MOTO, "Moto Saga", 128, 699));
		
		System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n", "BRAND", "MODEL","MEMORY", "PRICE");
		System.out.printf("------------------------------------------------------------------%n");
		for(Mobile mobiles : mobileList) {
			System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n", mobiles.getBrand(), mobiles.getModel(), mobiles.getMemory(), mobiles.getPrice() );
		}
		
		Collections.sort(mobileList);
		System.out.println("Mobile List after complete sorting by price");
		System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n", "BRAND", "MODEL","MEMORY", "PRICE");
		System.out.printf("------------------------------------------------------------------%n");
		for(Mobile mobiles : mobileList) {
			System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n", mobiles.getBrand(), mobiles.getModel(), mobiles.getMemory(), mobiles.getPrice() );
		}
		

	}

}
