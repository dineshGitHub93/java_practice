package com.collections.customobject;

public class Trainees implements Comparable<Trainees>{
	
	int id;
	String name;
	int age;
	
	public Trainees(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Trainees [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Trainees o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	
	

}
