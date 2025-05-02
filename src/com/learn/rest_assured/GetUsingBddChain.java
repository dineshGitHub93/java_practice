package com.learn.rest_assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetUsingBddChain {
	
	@Test(enabled = false)
	public void testGetEmployeeUsingChain() {
		
		RestAssured.given()
				.baseUri("http://localhost:3000/")
			.when()
				.get("employees")
			.prettyPrint();
				
	}
	
	@Test(enabled = false)
	public void testCreateResourceUsingChain() {
		
		String payload = """
				{
					"id" : "530",
					"name" : "Kunja Kutty",
					"title" : "CEO",
					"department" : "IT",
					"base_salary" : "150000",
					"bonus_eligible" : "true",
					"benefits" : ["Health Insurance", "Stock Options","Company Car","Company Accomadations"],
					"start_date" : "2022-05-02"
				}
			""";
		
		RestAssured.given()
				.baseUri("http://localhost:3000/")
				.header("Content-Type", "application/json")
				.body(payload)
			.when()
				.post("employees")
				.prettyPrint();
	}

	@Test(enabled = false)
	public void testUpdateResourceUsingChain() {
		String payload = """
				{
					"name" : "Chitti Robo",
					"title" : "CEO",
					"department" : "Robot",
					"base_salary" : "150000",
					"bonus_eligible" : "true",
					"benefits" : ["Machine", "Charging","Execute Comments","Think smarter than Human"],
					"start_date" : "2025-05-02"
				}
			""";
		
		RestAssured.given()
				.baseUri("http://localhost:3000/")
				.header("Content-Type", "application/json")
				.body(payload)
			.when()
				.put("employees/530")
				.prettyPrint();
	}
	
	@Test
	public void testDeleteResourceUsingChain() {
		
		RestAssured.given()
		.baseUri("http://localhost:3000/")
	.when()
		.delete("employees/f572")
		.prettyPrint();
	}
}
