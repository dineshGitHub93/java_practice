package com.learn.restAPI;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.net.ResponseCache;
import java.util.Iterator;
import java.util.Map;

public class CookiesDemo {

	//@Test(priority = 1)
	void testCookies() {

		given()

		.when()
		.get("https://www.facebook.com/")

		.then()
		.cookie("evi", "%223%407d0QqL3VkWr7FxJWYxgKaXPfhv-BxMDaoiucxh7Eh5Uh14qxgzV2Pc9y%22")
		.log().all();

	}

	@Test(priority = 2)
	void testGetCookies() {

		Response res =given()

				.when()
				.get("https://www.facebook.com/");

				/*To get single cookies info
				String cookiesValues = res.getCookie("evi");
				System.out.println("Values of evi cookies is : "+cookiesValues);
				*/
				
				//Get all cookies info
				Map<String, String> cookiesValue = res.getCookies();
				
				for(String key : cookiesValue.keySet()) {
					System.out.println(key+" = "+res.cookie(key));
				}
	}
}
