package com.collections.customobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Trainees> trainee = new ArrayList<Trainees>();
		trainee.add(new Trainees(1, "Moniha", 24));
		trainee.add(new Trainees(2, "Yadraj", 23));
		trainee.add(new Trainees(3, "Naveen", 28));
		
		//Sort using natural ordering (age)
		Collections.sort(trainee);
		
		for(Trainees tr : trainee) {
			System.out.println(tr);
		}
	}

}
