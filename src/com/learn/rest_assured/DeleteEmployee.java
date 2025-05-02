package com.learn.rest_assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteEmployee {

	@Test
	public void testDeleteEmployee() {
		
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestSpecification = RestAssured.given();
		
		Response response =requestSpecification.request(Method.DELETE, "employees/522");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
	}
}
