package com.learn.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	@Given("user is entering google.co.in")
	public void user_is_entering_google_co_in() {
		 System.out.println("User is on the login page");
	}

	@When("using is typing the search term {string}")
	public void using_is_typing_the_search_term(String string) {
		 System.out.println("User is on the login page");
	}

	@When("enters the return key")
	public void enters_the_return_key() {
		 System.out.println("User is on the login page");
	}

	@Then("the user should see the search results")
	public void the_user_should_see_the_search_results() {
		 System.out.println("User is on the login page");
	}

}
