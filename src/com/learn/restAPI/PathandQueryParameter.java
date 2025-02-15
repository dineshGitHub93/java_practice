package com.learn.restAPI;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class PathandQueryParameter {
	
	//https://reqres.in/api/users?page=2&id=2
	
	@Test
	void testPathandQueryParameterValidation() {
		
		 given()
		 	.pathParam("mypath", "users") // Path Parameter
		 	.queryParam("page",2)	//Query Parameter
		 	.queryParam("id",3)	//Query Parameter
		
		 .when()
		 	.get("https://reqres.in/api/{mypath}")
		
		.then()
			.statusCode(200)
			.log().all();

}	
}
