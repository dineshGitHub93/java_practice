package java_practice.collections.Lambda;

import java.util.function.Function;

public class FunctionLambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, String> learnJava8 = learnJava -> {
			System.out.println("Try to complete Java8 ");
			return "";
		};
		
		Function<String, String> startSelenium = learnSelenium -> {
			System.out.println("Then Start Learn Selenium 4");
			return "";
		};
		
		Function<String, String> learnSQL = sqlLearn -> {
			System.out.println("SQL is easier than selenium to learn ");
			return "";
		};
		
		learnJava8.andThen(startSelenium).apply("");
		
		System.out.println("=========================");
		
		startSelenium.compose(learnSQL).apply("");
		
	}

}
