package com.maersk.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowHandler {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
		
		
		//Second Step 
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/popup.php");
		//Implicitly waiting the page
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//We are going to click the child window for popup
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		//Get the windowhanlers
		Set<String> handler = driver.getWindowHandles();
		
		
		Iterator<String> iteratorValue = handler.iterator();
		
		//Parent ID
		String parentId = iteratorValue.next();
		
		//Child ID 
		
		String childId = iteratorValue.next();
		
		//Switch the parent to child window
		
		driver.switchTo().window(childId);
		
		//System.out.println("Child Id is "+childId);
		
		Thread.sleep(3000);
		driver.findElement(By.name("emailid")).sendKeys("jagang@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("btnLogin")).click();
		
		//close the window
		driver.close();
		Thread.sleep(3000);
		
		//Come Back to normal parent window 
		driver.switchTo().window(parentId);
		
		System.out.println("Child Id vastundi : "+childId);
		
		System.out.println("Parent id vastundi : "+parentId);
		
		
	}
}
