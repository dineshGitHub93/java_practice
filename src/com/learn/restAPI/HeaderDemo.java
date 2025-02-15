package com.learn.restAPI;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.apache.poi.hssf.record.HeaderFooterRecord;

public class HeaderDemo {
	
	@Test(priority = 1)
	void testHeaders() {
		
		Response res = given()
		
		.when()
			.get("https://www.facebook.com/");
		
		String headerValue = res.getHeader("Content-Type");
		System.out.println("Values of Content-Type : "+headerValue);
		
		when()
			.get("https://www.facebook.com/")
		
		.then()
			.header("Content-Type", "text/html; charset=\"utf-8\"")
			.header("Content-Encoding","gzip");
			
	}

	@Test(priority = 2)
	void getAllHeaders() {
		

		Response res = given()
		
		.when()
			.get("https://www.facebook.com/");
		
		Headers headerValue = res.getHeaders();
		
		for(Header head :headerValue) {
			System.out.println(head.getName()+" = "+head.getValue());
		}
	}
}
