package com.maersk.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		//WebDriver driver = new ChromeDriver();	
		
		//HtmlUnitDriver -->HeadLessBrowser
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ui.cogmento.com/");
		
		
	     
		//Implicitly waiting the page
		//Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //Entire Page load
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // if you want to wait for 3 seconds it will wait
		
		System.out.println("Before "+driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("jagadesh.selinium@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Jagan@143");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();

		System.out.println("After :"+driver.getTitle());
	}

}
