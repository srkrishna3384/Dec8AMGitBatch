package com.rameshsoft.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTwo {
	@Test
	public void demo() {
		System.out.println("TesTwo Class.....");
		//System.setProperty(key, value)
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		System.out.println("Navigated to News18 web page");
		System.out.println("Person2 Modifications");
		System.out.println("Person2 Modifications");
	}

}
