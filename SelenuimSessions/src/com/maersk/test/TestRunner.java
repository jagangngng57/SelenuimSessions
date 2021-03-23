package com.maersk.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner {
	
	public static void main(String[] args) {
		
		
		//First Step in Selenium Programming 
		
		System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// There are 8 Locators 
		//1 . Xpath : We have to take only relative xpath. We should not take absolute xpath
		   
		   driver.findElement(By.id("firstname")).sendKeys("Jagadeesh");
		   
		// 2. ID : 
	   driver.findElement(By.id("lastname")).sendKeys("Gyangi");
	   
	   // 3. Name 
	   
	   driver.findElement(By.name("Email")).sendKeys("java.gyangi@gmail.com");
	   
	   //CSSSelector : we can use like same ID
	   driver.findElement(By.cssSelector("#password")).sendKeys("Jagan@143");
	   
	   //4 .LinkText  We can use only for links
	 
	   driver.findElement(By.cssSelector("#EMAIL_REG_FORM_SUBMIT")).click();

	   //5. partialLinkText We can use for links but its recomanded 
		
	  // driver.findElement(By.partialLinkText("User Agreement")).click();
		
	// 6. CSSSelector : its like id or xpath
	   
	 //  driver.findElement(By.cssSelector("#lastname")).sendKeys("Jk");
		
	   //7 . ClassName : Its not useful and its not recomanded . Because it will change the Class or division name or may be be duplicate class name
	   
	  // driver.findElement(By.className("")).click();
	}

}
