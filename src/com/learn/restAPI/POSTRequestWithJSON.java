package com.learn.restAPI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class POSTRequestWithJSON {
	
	
	@Test(enabled = false)
	public void testPostRequestWithJsonBody() {
		given()
			.header("Content-Type", "application/json")
			.body("{\"username\":\"john_doe\",\"password\":\"securepassword123\"}")
			.when()
			.post("http://64.227.160.186:8080/api/auth/login")
			.then()
			.statusCode(200)
			.log().body();
	}

	@Test
	public void testPostRequestWithMap() {
		Map<String, String> data = new HashMap<String, String>();
		data.put("username", "john_doe");
		data.put("password", "securepassword123");
		
		given()
			.header("Content-Type", "application/json")
			.body(data)
		.when()
			.post("http://64.227.160.186:8080/api/auth/login")
		.then()
			.statusCode(200)
			.log().body();
	}
}
