package com.learn.restAPI;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class CreatePostRequestBodyPOJO {
	
	@Test(priority = 1)
	void testPostUsingPojo() 
	{ 
		Bio_Graph_pojo data = new Bio_Graph_pojo();
		data.setName("Kunja");
		data.setLocation("India");
		data.setPhone_num("123356");
		data.setCourses(new String[] {"java", "python"});

		given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("http://localhost:3000/students")
		
		.then()
			.statusCode(201)
			.body("name", equalTo("Kunja"))
			.body("location", equalTo("India"))
			.body("courses[0]", equalTo("java"))
			.body("courses[1]", equalTo("python"))
			.header("Content-Type","application/json")
			.log().all(); 
	}
	
	@Test(priority = 2)
	void testDeleteInfo() {
		
		when()
			.delete("http://localhost:3000/students/fde6")
		.then()
			.statusCode(200);
			
	}

}
