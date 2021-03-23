package com.maersk.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadConcept {
	
	public static void main(String[] args) {
		
		
		//First Step in Selenium Programming 
		
		System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.id("fileupload")).sendKeys("D:\\SOAPRequests\\200102132_irin.xml");
	}

}
