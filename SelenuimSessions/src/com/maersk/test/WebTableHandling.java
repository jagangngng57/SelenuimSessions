package com.maersk.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		//WebDriver driver = new ChromeDriver();	
		
		//HtmlUnitDriver -->HeadLessBrowser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.com/2015/01/table-with-checkbox.html");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'Cow')]/preceding-sibling::td//input[@type='checkbox']")).click();	
		
		driver.findElement(By.xpath("//td[contains(text(),'Tiger')]/preceding-sibling::td//input[@type='checkbox']")).click();
		
		
	}

}
