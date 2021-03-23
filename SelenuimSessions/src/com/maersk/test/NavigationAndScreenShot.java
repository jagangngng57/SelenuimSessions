package com.maersk.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigationAndScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		//Implicitly waiting the page
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navigation to Amazon page
		
		
		
		driver.navigate().to("https://www.ebay.om/");
		
		
		
		//driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		//Screen shot of google page
		
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//Now copy the screenshot to desired location
	
   FileUtils.copyFile(src,new File("C:\\Users\\u42761\\eclipse-workspace\\SelenuimSessions\\src\\com\\maersk\\test\\google.jpg"));
		
	
		
		
	}

}
