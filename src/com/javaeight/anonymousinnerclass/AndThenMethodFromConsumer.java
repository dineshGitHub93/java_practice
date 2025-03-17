package com.javaeight.anonymousinnerclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AndThenMethodFromConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<List<Integer>> modify = list -> {
		
			for(int i=0; i<=list.size()-1; i++) {
				
				if(list.get(i)%2==0)
					list.set(i, 2*list.get(i));
				else
					list.set(i, 3*list.get(i));
			}
		};
		
		Consumer<List<Integer>> displyList = list-> list.forEach(System.out::println);
		
		List<Integer> num = Arrays.asList(1,3,6,5,9,8,7,4,5,2,1);
		
		modify.andThen(displyList).accept(num);
	}

}
