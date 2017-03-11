package com.xyz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.xyz.MyConstants.MyBrowsers;

public class RegisterTest {
	
  @Test
  public void validateRegisterPage() throws InterruptedException {
	  WebDriver firefoxDriver =InitializeDrivers.initializeDrivers(MyBrowsers.Firefox);
	  firefoxDriver.get(MyConstants.APPLICATION_URL);
	  MyRegisterPage registerpage = PageFactory.initElements(firefoxDriver, MyRegisterPage.class);
	  registerpage.validateRegisterPage();
	  //firefoxDriver.close();
  }
  
  @Test
  public void fillRegistrationDetails() throws InterruptedException {
	  WebDriver chromeDriver =InitializeDrivers.initializeDrivers(MyBrowsers.Firefox);
	  chromeDriver.get(MyConstants.APPLICATION_URL);
	  MyRegisterPage registerPage = PageFactory.initElements(chromeDriver, MyRegisterPage.class);
	  registerPage.fillRegistrationForm("FirstName","lastName");
  }
  
}
