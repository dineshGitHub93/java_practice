package com.learn.restAPI;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingJSONResponseData {

	//@Test(priority = 1)
	void testJSONResponse() {
	/*	
		//Approach1
		given()
			.contentType("ContentType.JSON")
		
		.when()
			.get("http://localhost:3000/book")
		
		.then()
			.statusCode(200)
			.header("Content-Type", "application/json")
			.body("[3].title",equalTo("Wings of Fire"));
		
		*/
		
		//Approch-II
		Response res = given()
			.contentType("ContentType.JSON")
		
		.when()
			.get("http://localhost:3000/book");
		
		assertEquals(res.statusCode(), 200);
		assertEquals(res.header("Content-Type"), "application/json");
		assertEquals(res.jsonPath().get("[3].title").toString(), "Wings of Fire");
	}
	
	@Test(priority = 2)
	void testJSONResponseBody() {
	/*	
		//Approach1
		given()
			.contentType("ContentType.JSON")
		
		.when()
			.get("http://localhost:3000/book")
		
		.then()
			.statusCode(200)
			.header("Content-Type", "application/json")
			.body("[3].title",equalTo("Wings of Fire"));
		
		*/
		
		//Approch-II
		Response res = given()
			.contentType(ContentType.JSON)
		
		.when()
			.get("http://localhost:3000/book");
		
		JSONObject jo = new JSONObject(res.toString());
		
		for(int i =0; i<jo.getJSONArray("book").length(); i++) {
			String bookTitle = jo.getJSONArray("book").getJSONObject(i).getString("title");
			System.out.println(bookTitle);
		}
	}
}
