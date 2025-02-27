package com.collections.customobject;

import java.util.Arrays;
import java.util.Iterator;

public class DataSortUsingComparatorDesending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array = {6,11,1,2,3,9,0,7,9};
		Arrays.sort(array, (Integer v1 , Integer v2)-> v2-v1);
		
		for(Integer val : array) {
			System.out.println(val);
		}
	}

}
