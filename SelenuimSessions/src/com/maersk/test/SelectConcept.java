package com.maersk.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectConcept {

	public static void main(String[] args) throws InterruptedException {

		//First Step in Selenium Programming 
		
		System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
			
		Select select = new Select(driver.findElement(By.id("testingDropdown")));
		select.selectByVisibleText("Manual Testing");

		
	/*	
		driver.get("https://www.tatacliq.com/"); // open google.com

		driver.findElement(By.xpath("//input[@class='Input2__inputBox']")).sendKeys("Jeans");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='Input2__inputBox']")).sendKeys(Keys.ENTER); */

		
			

	}

}
