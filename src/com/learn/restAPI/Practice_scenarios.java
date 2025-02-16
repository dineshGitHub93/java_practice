package com.learn.restAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Practice_scenarios {
	
	@Test(priority = 1)
	void testPractice() {
		
		Bio_Graph_pojo data = new Bio_Graph_pojo();
		
		data.setName("Dinesh");
		data.setLocation("Chennai");
		data.setPhone_num("12654748");
		data.setCourses(new String[] {"REST-API","Selenium"});
		
		given()
			.contentType("application/json")
			.body(data)
		
		.when()
			.post("http://localhost:3000/students")
		.then()
			.statusCode(201)
			.header("Content-Type", equalTo("application/json"))
			.log().cookies()
			.log().headers();
	}

}
