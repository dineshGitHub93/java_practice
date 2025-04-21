package com.learn.restAPI;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class ValidateSchema {

	@Test
	 public void testCreateUser() {
	 given()
	 .contentType("application/json")
	 .body("{ \"name\": \"Hemant\", \"job\": \"QA\" }")
	 .when()
	 .post("/users")
	 .then()
	 .statusCode(201)
	 .body("name", equalTo("Hemant"));
	 }
	


}
