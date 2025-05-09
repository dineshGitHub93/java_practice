package com.learn.rest_assured;

import java.util.List;

public class Student {

    private String first_name; 
    private String last_name;
    private String email;
    private List<String> skills;
    
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Student(String first_name, String last_name, String email, List<String> skills) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.skills = skills;
	}
	public Student() {
		super();
	}
	
	
	
}
