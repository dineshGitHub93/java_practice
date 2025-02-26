package com.collections.list;

import java.util.PriorityQueue;

public class DemoOfPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//min priority queue, used to solve problems of min heap
		PriorityQueue<Integer> minPQ = new PriorityQueue<Integer>();
		minPQ.add(5);
		minPQ.add(2);
		minPQ.add(8);
		minPQ.add(1);
		minPQ.add(13);
		minPQ.add(9);
		minPQ.add(6);
		
		//lets print all the values 
		minPQ.forEach((Integer val)->System.out.println(val));
		
		//remove top elements from the PQ and print 
		while(!minPQ.isEmpty()) {
			int val = minPQ.poll();
			System.out.println("Rrmove from top : "+val);
		}
	}

}
