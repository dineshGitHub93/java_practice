package com.learn.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/com/learn/feature", 
		glue="src/com/learn/stepdefinitions"
		)

public class RunnerClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
