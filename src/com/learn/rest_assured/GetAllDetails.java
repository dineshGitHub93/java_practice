package com.learn.rest_assured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllDetails {

	@Test
	public void testRetriveAllInfoUsingGET() {
		baseURI="http://localhost:3000/";
		
		RequestSpecification requestSpecification = given();
		Response response = requestSpecification.request(Method.GET, "employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
	}

}
