package com.learn.rest_assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateEmployee {

	@Test
	public void createEmployeeData() {
		
		String payload = """
					{
						"id" : "520",
						"name" : "Kunja Kutty",
						"title" : "CEO",
						"department" : "IT",
						"base_salary" : "150000",
						"bonus_eligible" : "true",
						"benefits" : ["Health Insurance", "Stock Options","Company Car","Company Accomadations"],
						"start_date" : "2022-05-02"
					}
				""";
		
		RestAssured.baseURI = "http://localhost:3000/";
		
		RequestSpecification requestSpecification = RestAssured.given()
													.header("Content-Type", "application/json")
													.body(payload);
		Response response =requestSpecification.request(Method.POST, "employees");
		System.out.println(response.statusLine());
	}
}
