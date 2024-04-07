package com.smarten.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page_pom 
{
	@FindBy(xpath="//input[@type='email']") private WebElement Email ;

	@FindBy(xpath="//input[@placeholder='Password']") private WebElement Password ;
	
	@FindBy(xpath="//button[contains(@class,'ant-btn login')]") private WebElement Login_btn ;


	
	public Login_page_pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	public void Email(String email) throws InterruptedException
	{
		boolean result = Email.isDisplayed();
		if(result)
		{
			System.out.println("Email Id Entered Successfully");
		}
		else
		{
			System.out.println("Email Id not Entered Successfully");
		}
		
		//boolean result=logo.isDisplayed();
		//return result;
	
		Email.sendKeys(email);
		
	
	}
	
	
	public void Password(String pass) throws InterruptedException
	{
		boolean result = Password.isDisplayed();
		if(result)
		{
			System.out.println("Password Entered Successfully");
		}
		else
		{
			System.out.println("Password not Entered Successfully");
		}
		
		//boolean result=logo.isDisplayed();
		//return result;
	
		Password.sendKeys(pass);
		
	
	}
		
	public void Login_btn() throws InterruptedException
	{
		Login_btn.click();
		Thread.sleep(2000);
     //   return new LoginPage(driver);	
	}



}
