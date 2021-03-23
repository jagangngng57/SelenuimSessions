package com.maersk.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) throws InterruptedException {

	//First Step in Selenium Programming 
		
		System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"))).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("SpiceMAX")).click();

	}

}
