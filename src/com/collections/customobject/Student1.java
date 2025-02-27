package com.collections.customobject;

public class Student1 {

	int id;
	String name;
	int age;

	public Student1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
