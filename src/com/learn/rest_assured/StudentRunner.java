package com.learn.rest_assured;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;

public class StudentRunner {

	@Test(enabled = false)
	public void testPojoSerialization() {
		
		Student students = new Student();
		students.setFirst_name("Lee");
		students.setLast_name("Catherine");
		students.setEmail("alice.johnson@example.com");
		students.setSkills(Arrays.asList("Python","pytest", "Rest-Assured"));
		
		System.out.println(students.getFirst_name());
		System.out.println(students.getLast_name());
		System.out.println(students.getEmail());
		System.out.println(students.getSkills());
		
		RestAssured.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type", "application/json")
		.body(new Student("Lee", "Catherine", "alice.johnson@example.com", Arrays.asList("Python","pytest", "Rest-Assured")))
		.log()
		.all()
		.when()
		.post("student")
		.then()
		.log()
		.all();

	}

	@Test
	public void testPojoSerializationWithObjectMappper() throws JsonProcessingException {
		
		Student students = new Student();
		students.setFirst_name("Lee");
		students.setLast_name("Catherine");
		students.setEmail("alice.johnson@example.com");
		students.setSkills(Arrays.asList("Python","pytest", "Rest-Assured"));
		System.out.println(students.toString());
		ObjectMapper mapper = new ObjectMapper();
		String employeeJsonData =mapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);
		System.out.println(employeeJsonData);
	}
	
}
