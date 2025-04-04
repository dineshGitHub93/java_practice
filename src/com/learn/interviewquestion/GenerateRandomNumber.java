package com.learn.interviewquestion;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {
	
	public static int getRandomValue(int min, int max) {
		
		return ThreadLocalRandom
						.current()
						.nextInt(min, max);
	}

	public static void main(String[] args) {
		int min = 1000, max = 3000;
		
		System.out.println("Print random value between :"+min+" and "+max+": "
				+getRandomValue(min, max));
	}

}
