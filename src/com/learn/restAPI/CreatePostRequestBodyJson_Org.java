package com.learn.restAPI;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class CreatePostRequestBodyJson_Org {
	
	@Test(priority = 1)
	void testPostUsingPOJO() 
	{ 

		JSONObject data = new JSONObject();
		
		data.put("name", "Kunjan");
		data.put("location", "India");
		data.put("Phone", "123645");
		data.put("courses", new String[] {"java","python"});

		given()
			.contentType("application/json")
			.body(data.toString())
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
			.delete("http://localhost:3000/students/b5b4")
		.then()
			.statusCode(200);
			
	}

}
