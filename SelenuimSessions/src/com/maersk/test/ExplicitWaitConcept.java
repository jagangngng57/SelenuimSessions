package com.maersk.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		//Implicitly waiting the page
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		clickOn(driver, driver.findElement(By.name("login")), 5);
		
		
	}
	
	/*
	 * This method is for explicitly wait the web page until load the all the web elements or links
	 */
	public static void clickOn(WebDriver driver,WebElement locator,int waitTime) {
		new WebDriverWait(driver, waitTime).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}
