package com.collections.customobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AscendingObjectUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student1> students = new ArrayList<Student1>();
		students.add(new Student1(1, "Alice", 20));
		students.add(new Student1(2, "Bob", 18));
		students.add(new Student1(3, "Charlie", 22));

		//Sort by name using comparator
		

		for(Student1 stu : students) {
			System.out.println(stu);
		}
		
		Collections.sort(students, (s1, s2)-> s1.age - s2.age);
		System.out.println("Sort data by age");
		students.forEach(System.out::println);
	}

}
