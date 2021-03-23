package com.maersk.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandlerConcept {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/popup.php");
		//Implicitly waiting the page
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		String ParentId = driver.getWindowHandle();
		Set<String> handler =  driver.getWindowHandles();
		
		   Iterator it = handler.iterator();
		   
		   while(it.hasNext()) {
			   
			   String childId = (String) it.next();
			   
			   if(!ParentId.equals(childId)) {
				   
				   //We have to switch the window.
				   
				   driver.switchTo().window(childId);
				   
				   driver.findElement(By.name("emailid")).sendKeys("jagangng57@gmail.com");
				   
				   driver.findElement(By.name("btnLogin")).click();
				   
				   driver.close();
			   }
			   
			   //Switch to parent Window
			   driver.switchTo().window(ParentId);

			   	
		   }

	}

}
