package com.learn.rest_assured;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateEmployeeFromExternalResource {
	
	
	@Test
	public void testCreateEmployeeFromExternalResource() {
		
		File jsonFile = new File("./json/emp_data.json");
		
		RestAssured.given()
					.baseUri("http://localhost:3000/")
					.header("Content-Type", "application/json")
					.body(jsonFile)
					.when()
					.post("employees")
					.prettyPrint();
	}

}
