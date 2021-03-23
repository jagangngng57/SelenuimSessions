package com.maersk.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	
	public static void main(String[] args) {
		
		//First Step in Selenium Programming 
		
		System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		//1. ID
		driver.findElement(By.id("firstname")).sendKeys("Jagan");
		
		//2. Xpath
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Gyangi");
		
		//3.CSSSelector
		
		//driver.findElement(By.cssSelector("#Email")).sendKeys("jagadeesh.gyangi@gmail.com");
		
		//4. name
		
		driver.findElement(By.name("Email")).sendKeys("JK@gmail.com");
		
		//5. linktext
		
		//driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.className("action-link")).click();
		
		
	}
}
