package com.maersk.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearch {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Java");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role ='listbox']//li"));
		
		System.out.println("Size of List : " +list.size());

		for (WebElement webElement : list) {
			System.out.println("WebElements "+webElement.getSize());
			
		}
	}

}
