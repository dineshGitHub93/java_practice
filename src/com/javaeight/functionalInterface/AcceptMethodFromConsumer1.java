package com.javaeight.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AcceptMethodFromConsumer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<List<Integer>> modify = list -> {
			
			for(int i =0; i<=list.size()-1; i++) {
				list.set(i, 2*list.get(i));
			}
		};

		Consumer<List<Integer>> displyList = list -> list.forEach(n->System.out.println(n));
		
		List<Integer> list = Arrays.asList(1,2,5,7,9,8);
		
		modify.accept(list);
		
		displyList.accept(list);
	}

}
