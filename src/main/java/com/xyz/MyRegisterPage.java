/**
 * 
 */
package com.xyz;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

/**
 * @author Progvaltion_11
 *
 */
public class MyRegisterPage {
	
	
	@FindBy(id="abcd")
	WebElement registerLable;
	
	@FindBy(id="firstname")
	WebElement firstName;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[1]")
	WebElement firstNameLabel;
	
	@FindBy(id="lastname")
	WebElement surName;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[3]/td[1]")
	WebElement surNameLable;
	
	@FindBy(id="dob")
	WebElement dateOfBirth;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[5]/td[1]")
	WebElement dateOfBirthLabel;
	
	@FindBy(id="address")
	WebElement address;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[7]/td[1]")
	WebElement addressLabel;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[9]/td[1]")
	WebElement phoneLabel;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[11]/td[1]")
	WebElement emailLabel;
	
	@FindBy(id="zipcode")
	WebElement zipCode;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[13]/td[1]")
	WebElement zipCodeLabel;
	
	@FindBy(name="cars")
	WebElement multiChoice;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[15]/td[1]")
	WebElement multiChoiceLabel;
	
	@FindBy(name="REGISTER")
	WebElement registerBtn;

	
	public void fillRegistrationForm(String fName,String lName)throws InterruptedException{
		Thread.sleep(300);
		
		firstName.clear();
		firstName.sendKeys(fName);
		Thread.sleep(300);
		surName.clear();
		surName.sendKeys(lName);
		Thread.sleep(300);
		dateOfBirth.clear();
		dateOfBirth.sendKeys("11/03/2017");
		Thread.sleep(300);
		address.clear();
		address.sendKeys("Pune");
		Thread.sleep(300);
		phone.clear();
		phone.sendKeys("123132132");
		Thread.sleep(300);
		email.clear();
		email.sendKeys("abc@gmail.com");
		Thread.sleep(300);
		zipCode.clear();
		zipCode.sendKeys("234312");
		Thread.sleep(300);
		selectDropDownOptions(1,3);
		
	}
	
	
	private void selectDropDownOptions(int ...nums)throws InterruptedException{
		Select multiChoiceDropList = new Select(multiChoice);
		for (int i=0;i<nums.length;i++) {
			multiChoiceDropList.selectByIndex(nums[i]);	
			Thread.sleep(300);
		}
		
	}
	
	
	public void validateRegisterPage() throws InterruptedException{
		Thread.sleep(300);
		Assert.assertEquals(MyConstants.REGISTERPAGEHEADING, registerLable.getText());;
		Assert.assertEquals("SurName:", surNameLable.getText());
		Thread.sleep(300);
	}
	
}
