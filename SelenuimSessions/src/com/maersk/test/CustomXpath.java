package com.maersk.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		
	     
		//Implicitly waiting the page
		//Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //Entire Page load
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // if you want to wait for 3 seconds it will wait
		
		
		//driver.findElement(By.xpath("//input[@class='Input2__inputBox']")).sendKeys("Jeans");
		
		//driver.findElement(By.xpath("//input[@name='value']"));
		
		//driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Samsung");
		
		//Dynamic xpath contains method
		//driver.findElement(By.xpath("//input[contains(@id,'field-keywords')]")).sendKeys("Apple");
		//"//input[contain(@id,)]"
		
/*		//Dynamic ID's handling
		//ID : test_12345
		//ID : test_123232
		//ID:  test_232323
		//Id : test_34343
		 //_test_1232323
		
		driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Iphone");		
		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("KYA");
		driver.findElement(By.xpath("//input[ends-with(@id,'_test_')]")).sendKeys("KYA");*/

		//Handling links with custom xpath
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	}

}
