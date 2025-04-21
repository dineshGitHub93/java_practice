package com.learn.locator;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aadhhdggsA";

		Map<Character, Integer> freqMap = new HashMap<Character, Integer>();

		//Java 7 (traditional loop with HashMap)
		for(char ch :str.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			System.out.println("Character: "+entry.getKey()+", Count: "+entry.getValue());
		}

		//Java 8 (functional style with Streams and Collectors)
		Map<Character, Long> frMap1 = str.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(c ->c, Collectors.counting()));
		frMap1.forEach((key, value) -> System.out.println("Character: " + key + ", Count: " + value));
	}

}
