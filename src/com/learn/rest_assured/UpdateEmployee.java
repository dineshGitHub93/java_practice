package com.learn.rest_assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateEmployee {
	
	
	@Test
	public void updateEmployeeTest() {
		
		String payload = """
						 {
    "name": "Kunja Dinesh",
    "title": "Chief Executive Officer",
    "department": "Executive",
    "base_salary": 180000,
    "bonus_eligible": true,
    "benefits": [
      "Health Insurance",
      "Stock Options",
      "Company Car",
      "Company Accomadations",
      "Telephone Bil"
    ],
    "start_date": "2018-11-10"
  }
				""";
		
		RestAssured.baseURI = "http://localhost:3000";
		
		
		RequestSpecification requestSpecification = RestAssured.given().
														header("Content-Type", "application/json")
														.body(payload);
		
		Response response = requestSpecification.request(Method.PUT, "/employees/522");
		System.out.println(response.statusLine());
		
	}

}
