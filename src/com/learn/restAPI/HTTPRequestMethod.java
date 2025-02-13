package com.learn.restAPI;


import  org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class HTTPRequestMethod {
	
	/*
	 given()
	 	content type , set cookies , add auth, add param, set headers info etc...
	 	
	 when()
	 	get, post, put, delete
	 	
	 then()
	 	validate status code, extract response, extract headers cookies & response body...
	 	
	 */
	
	int id ;
	
	@Test(priority = 1)
	void getUsers() { 
		
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
			
		.then()
			.statusCode(200)
			.body("page", equalTo(2))
			.log().all();
	}
	
	@Test(priority = 2)
	void createUser() {
		
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "Kunja");
		data.put("reletionship", "my love");
		
		id = given()
			.contentType("application/json")
			.body(data)
			
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
		
		//.then()
		//	.statusCode(201)
		//	.log().all();
	}

	@Test(priority = 3, dependsOnMethods = {"createUser"})
	void updateUser() {
		
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "Kunja");
		data.put("reletionship", "Ultra love");
		
		given()
			.contentType("application/json")
			.body(data)
			
		.when()
			.put("https://reqres.in/api/users/"+id)
		
		.then()
			.statusCode(200)
			.log().all();
	}
	
	@Test(priority = 4, dependsOnMethods = {"updateUser"})
	void deleteUser() {
		
		when()
		.delete("https://reqres.in/api/users/"+id)
	
	.then()
		.statusCode(204)
		.log().all();
	}
}
