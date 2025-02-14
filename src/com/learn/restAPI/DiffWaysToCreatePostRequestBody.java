package com.learn.restAPI;

import java.util.HashMap;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

/*
 Different ways to create post request body
 1) Post request body creation using Hashmap
 2) Post request body creation using Org.JSON
 3) Post request body creation using POJO class
 4) Post request body creation external json file data
 */
public class DiffWaysToCreatePostRequestBody {
	
	@Test(priority = 1)
	void testPostUsingHashMap() 
	{ 

		HashMap data = new HashMap();
		
		data.put("name", "Kunjan");
		data.put("location", "India");
		data.put("Phone", "123645");
		data.put("courses", new String[] {"java","python"});

		given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("http://localhost:3000/students")
		
		.then()
			.statusCode(201)
			.body("name", equalTo("Kunjan"))
			.body("location", equalTo("India"))
			.body("courses[0]", equalTo("java"))
			.body("courses[1]", equalTo("python"))
			.header("Content-Type","application/json")
			.log().all(); 
	}
	
	@Test(priority = 2)
	void testDeleteInfo() {
		
		when()
			.delete("http://localhost:3000/students/1ef3")
		.then()
			.statusCode(200);
			
	}
}
