package com.rameshsoft.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOne {
	
	@Test
	public void test() {
		System.out.println("TestOne Class.....");
		//System.setProperty(key, value)
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Launched successfully.....");
		driver.get("https://rameshsoft.com");
		System.out.println("Navigated to Rameshsoft web page");
		System.out.println("Person1 Modifications...");
		System.out.println("Person1 confilcts....");
	}

}
