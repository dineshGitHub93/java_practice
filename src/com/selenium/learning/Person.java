package com.selenium.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public record Person(String name, int age) implements Comparable<Person>{

	public String name() {
		return name;
	}

	public int age() {
		return age;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	
	public static void main(String[] args) {
		
		List<Person> p = new ArrayList<Person>();
		p.add(new Person("Kunja", 01));
		p.add(new Person("Dinesh", 32));
		p.add(new Person("Gayathri", 31));
		
		System.out.println(p);
		Collections.sort(p);
		p.forEach(System.out::println);
		
		
	}
}
