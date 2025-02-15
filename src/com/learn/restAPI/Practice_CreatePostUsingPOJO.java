package com.learn.restAPI;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Practice_CreatePostUsingPOJO {
	
	@Test (priority = 1)
	void testPracticePOJO() {
		
		Bio_Graph_pojo data = new Bio_Graph_pojo();
		data.setName("Gayathri");
		data.setLocation("Chennai");
		data.setPhone_num("123654");
		data.setCourses(new String[] {"java", "python"});
		
		given()
			.contentType("application/json")
			.body(data)
			
		.when()
			.post("http://localhost:3000/students")
			
		.then()
			.statusCode(201)
			.log().all();
		
	}

	@Test(dependsOnMethods = {"testPracticePOJO"})
	void delete() {
		
		when()
			.delete("http://localhost:3000/students/f482")
		.then()
			.log().all();
	}
}
