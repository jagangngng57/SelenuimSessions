package com.maersk.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		//Implicitly waiting the page
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Finding the links in webpage
		//how to find the buttons in webpage
		//how to 
		
		List<WebElement> webElement = driver.findElements(By.tagName("a"));
		
		System.out.println(webElement.size());
		
		//Iterating webElements --> henanced loop
/*		 for(WebElement element :webElement) {
			 
			 System.out.println(element.getText());
		 }*/
		 
		 //external loop
		 
		 for(int i=0;i<webElement.size();i++) {
			 
			 String element = webElement.get(i).getText();
			 System.out.println(element);
		 }
		 
		 //Lambda Expression
		 
		 
	}
}
