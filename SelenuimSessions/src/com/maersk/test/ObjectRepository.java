package com.maersk.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		
		Properties properties = new Properties();
		
		FileInputStream input = new FileInputStream("C:\\Users\\u42761\\eclipse-workspace\\SelenuimSessions\\src\\com\\maersk\\test\\ssp.properties");
		properties.load(input);
		
		String name = properties.getProperty("firstName");
		String lastName = properties.getProperty("lastName");
		
		String browserName = properties.getProperty("browser");
		String url = properties.getProperty("URL");
		if(browserName.contains("chrome")) {
		
			System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}else if(browserName.contains("FF")) {
			System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
			
		}else if(browserName.contains("IE")) {
			System.setProperty("webdriver.chrome.driver", "D:\\SelenuimJava\\chromedriver_win32\\chromedriver.exe");
			
		}
		
		driver.get(url);
		driver.findElement(By.xpath(properties.getProperty("firstName_XPath"))).sendKeys(properties.getProperty("firstName"));
		driver.findElement(By.xpath(properties.getProperty("lastName_XPath"))).sendKeys(properties.getProperty("lastName"));
	}

}
