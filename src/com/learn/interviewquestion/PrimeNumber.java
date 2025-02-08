package com.learn.interviewquestion;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		
		for(int i =2; i <= num/2 ; i++) {
			
			if(num % i ==0) {
				
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println(num +" is a prime number.");
		} else {
			System.out.println(num +" is not a prime number. ");
		}
	}

}
