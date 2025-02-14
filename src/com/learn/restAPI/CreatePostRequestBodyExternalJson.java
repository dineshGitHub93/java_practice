package com.learn.restAPI;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class CreatePostRequestBodyExternalJson {
	
	@Test(priority = 1)
	void testPostUsingExternalJSON() throws FileNotFoundException 
	{ 

		File f = new File(".\\body.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		
		JSONObject data = new JSONObject(jt);
		
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
			.delete("http://localhost:3000/students/1")
		.then()
			.statusCode(200);
			
	}

}
