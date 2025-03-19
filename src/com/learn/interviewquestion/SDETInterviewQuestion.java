package com.learn.interviewquestion;

import java.util.Scanner;

public class SDETInterviewQuestion {
	
	public static boolean isPrime(int num) {
		
		if(num <=1) {
			return false;
		}
		
		for(int i=2 ; i<=num/2; i++) {
			
			if(num % i ==0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check ODD/Even and Prime");
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println(num +" is even number");
		}
		else {
			System.out.println(num +" is not a even number");
		}
		
		if(isPrime(num)) {
			System.out.println(num +" is a prime");
		}
		else {
			System.out.println(num+ " is not a prime");
		}
	}

}
