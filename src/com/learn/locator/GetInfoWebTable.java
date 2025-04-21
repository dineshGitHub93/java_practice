package com.learn.locator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GetInfoWebTable extends Base{

	@Test
	public void testHandleDynamicWebTable() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> amtWebElements  = driver.findElements(By.xpath("//th[contains(text(),'Amount')]/ancestor::table/tbody/tr"));

		Map<String, String> map = new HashMap<String, String>();
		for (WebElement rows : amtWebElements) {

			List<WebElement> cell = rows.findElements(By.xpath("td[4]"));
			String amount = cell.get(0).getText();
			//cell.stream().map(amt -> amt.getText()).collect(Collecto)
			List<WebElement> name = rows.findElements(By.xpath("//td[contains(text(),'"+amount+"')]//preceding-sibling::td[3]"));
			String userName = name.get(0).getText();
			//name.stream().map(i->i.getText()).toString();
			map.put(userName, amount);
		}
		System.out.println(map);
	}

}
