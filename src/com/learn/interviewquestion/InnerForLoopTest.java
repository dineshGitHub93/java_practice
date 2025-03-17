package com.learn.interviewquestion;

import java.util.Arrays;
import java.util.List;

public class InnerForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> exams = Arrays.asList("OCA","OCP");
		
		for(String e1 : exams) {
			for(String e2 : exams) {
				System.out.println(e1+ " "+e2);
			}
		}

	}

}
