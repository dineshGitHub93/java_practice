package com.learn.rest_assured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SerializationDemo {
	
	@Test
	public void testSerializationDemo() {
		List<String> skills = new ArrayList<String>();
		Map<String, Object> jsonBody = new HashMap<String, Object>();
		
		jsonBody.put("first_name", "Kunja");
		jsonBody.put("last_name", "Dinesh");
		jsonBody.put("email", "kunja123@gmail.com");
		
		skills.add("java");
		skills.add("selenium");
		skills.add("TestNG");
		jsonBody.put("skills", skills);
		
		RestAssured.given()
					.baseUri("http://localhost:3000/")
					.header("Content-Type", "application/json")
					.body(jsonBody)
					.log()
					.all()
					.when()
					.post("student")
					.then()
					.log()
					.all();
					
	}

}
