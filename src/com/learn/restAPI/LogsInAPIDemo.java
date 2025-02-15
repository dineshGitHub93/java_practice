package com.learn.restAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class LogsInAPIDemo {
	
	@Test
	void logsDemo() {
		
		when()
			.get("https://www.facebook.com/")
		.then()
			//.log().body();
			//.log().cookies();
			//.log().headers();
			.log().all();
		
	}

}
