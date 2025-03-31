package com.learn.restAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;	

public class WhetherInfoGET {

	public static void main(String[] args) {
		//Base URL
		RestAssured.baseURI = "https://api.openweathermap.org/data/2.5/weather";
		
		 // Use built-in Java HTTP Client instead of Apache HttpClient
      // RestAssured.config = RestAssuredConfig.config().httpClient(HttpClientConfig.httpClientConfig().useSystemProperties());

		
		//API Key
		String apiKey = "17e0e27b172efad4c12478cff51b212d";
		String city = "London";
		
		 // Send GET request
		Response response = 
				given()
					.queryParam("q", "London")
					.queryParam("appid", "17e0e27b172efad4c12478cff51b212d")
					.queryParam("units", "metric")
				.when()
					.get();
		
		 // Print Response
		System.out.println("Response Body: " + response.getBody().asString());
	}

}
