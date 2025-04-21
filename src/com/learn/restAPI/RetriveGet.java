package com.learn.restAPI;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RetriveGet {
	
	
	
	@Test(enabled = false)
	public void testRetrive() {
		
		RestAssured.baseURI = "https://reqres.in/api/";
		
		//create requestspecification
		RequestSpecification  requestSpecification = RestAssured.given();
		
		//SEND get request
		Response response = requestSpecification.get("users/2");
		
		//Asset the response and body 
		assertEquals(response.statusCode(),200, "status code should be 200");
		System.out.println("GET BODY :"+response.asPrettyString());
	}
	
	@Test(enabled = false)
	public void testCreate() {
		
		RestAssured.baseURI = "https://reqres.in/api/";
		
		//create requestspecification
		RequestSpecification  requestSpecification = RestAssured.given();
		
		//Set the header
		requestSpecification.headers("Content-Type", "application/json");
		
		String data = """
	{
    "name": "Kunja",
    "job": "doctor"
				}
				""";
		
		//SEND get request
		Response response = requestSpecification.body(data).post("users");
		
		//Asset the response and body 
		assertEquals(response.statusCode(),201, "status code should be 201");
		System.out.println("POST Response BODY :"+response.getBody().asPrettyString());
	}
	
	@Test(enabled = false)
	public void testUpdate() {
		
		RestAssured.baseURI = "https://reqres.in/api/";
		
		//create requestspecification
		RequestSpecification  requestSpecification = RestAssured.given();
		
		//Set the header
		requestSpecification.headers("Content-Type", "application/json");
		
		String data = """
	{
    "name": "Kunja",
    "job": "doctor"
				}
				""";
		
		//SEND get request
		Response response = requestSpecification.body(data).put("users/797");
		
		//Asset the response and body 
		assertEquals(response.statusCode(),200, "status code should be 200");
		System.out.println("POST Response BODY :"+response.getBody().asPrettyString());
	}
	
	@Test(enabled = false)
	public void testDelete() {
		
		RestAssured.baseURI = "https://reqres.in/api/";
		
		//create requestspecification
		RequestSpecification  requestSpecification = RestAssured.given();
		
		//Set the header
		//requestSpecification.headers("Content-Type", "application/json");
		
		String data = """
	{
    "name": "Kunja",
    "job": "doctor"
				}
				""";
		
		//SEND get request
		Response response = requestSpecification.delete("users/2");
		
		//Asset the response and body 
		assertEquals(response.statusCode(),200, "status code should be 200");
		//System.out.println("POST Response BODY :"+response.getBody().asPrettyString());
	}

	@Test
	public void testMap() {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Alice", 25);
		map.put("Bob", 30);
		
//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//			
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
		map.forEach((k, v) -> System.out.println(k + " -> " + v));
	}
}
