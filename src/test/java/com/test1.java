package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	
	@Test
	public void test() {
		System.out.println("Hai Jithendra");
	}
	
	@Test
	public void launchBr() {
		System.setProperty("webdriver.chrome.driver", "C:\\Apr13_2019\\Resources\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.google.com");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
		
		driver.close();
	}

}
