package com.xyz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.xyz.MyConstants.MyBrowsers;

public class InitializeDrivers {

	/*
	 * 
	 */
	public static WebDriver initializeDrivers(MyBrowsers typeOfBrowser){
		WebDriver driver =null;
		
		switch (typeOfBrowser) {
		case Firefox:
				driver = new FirefoxDriver();
				break;
			
		case Safari:
			driver = new SafariDriver();
			break;
			
		case Chrome:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Progvaltion_11\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case InternetExplorer:
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Specified driver not found..");
			break;
		}

		driver.manage().window().maximize();
		
		return driver;
	}
}
