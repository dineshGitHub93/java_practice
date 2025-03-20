package com.learn.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/resources/features", 
		glue="stepdefinitions",
		tags ="@Test"
		)
public class RunnerClass{

}
