package com.learn.interviewquestion;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//To find given number is odd or even
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number to check ODD or Even :");
		int num = sc.nextInt();
		
		if(num % 2==0) {
			System.out.println(num + " is EVEN Number");
		}
		else {
			System.out.println(num + " is a ODD Number");
		}
	}

}
