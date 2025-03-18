package com.learn.interviewquestion;

import java.util.Iterator;
import java.util.Scanner;

public class ToFindPrimeNumber {

	//Method to check if a number is prime
	public static boolean isPrime(int num) {
		//Numbers less than or equal to 1 are not prime
		if(num <=1) {
			return false;
		}
		//check for factors from 2 to the square root of the number
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i ==0) {
				return false; //if divisible, it's not a prime
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to find prime :");
		int num = sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println(num+" is a prime number.");
		}
		else {
			System.out.println(num+" is not a prime number.");
		}
	}

}
