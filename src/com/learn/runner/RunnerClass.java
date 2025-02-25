package com.learn.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "feature\google_search.feature", glue="stepdefinitions")

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
