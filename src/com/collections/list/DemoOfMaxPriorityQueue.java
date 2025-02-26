package com.collections.list;

import java.util.PriorityQueue;

public class DemoOfMaxPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Max priority Queue, used to solve problems of max heap
		PriorityQueue<Integer> maxPQ = new PriorityQueue<Integer>((Integer a, Integer b) -> b-a);
		maxPQ.add(5);
		maxPQ.add(2);
		maxPQ.add(8);
		maxPQ.add(1);
		
		//lets print all the values
		maxPQ.forEach((Integer a)->System.out.println(a));
		
		//Remove top element from the PQ and print
		while(!maxPQ.isEmpty()) {
			int val = maxPQ.poll();
			System.out.println("Remove top element from PQ : "+val);
		}
	}

}
