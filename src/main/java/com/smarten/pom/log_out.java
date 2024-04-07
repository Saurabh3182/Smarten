package com.smarten.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class log_out
{
	@FindBy(xpath="(//button[@aria-label='Close'])[2]") private WebElement Close_form ;

	@FindBy(xpath="//a[@nzpopovertrigger='click']") private WebElement User ;

	@FindBy(xpath="(//li[@class='ant-menu-item py-2 px-4'])[6]") private WebElement Log_out ;

	
	public log_out(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void Close_form() throws InterruptedException
	{
		Close_form.click();
		Thread.sleep(2000);
	}
	
	public void User() throws InterruptedException
	{
		User.click();
		Thread.sleep(3000);
	}	
	
	public void Log_out() throws InterruptedException
	{
		Log_out.click();
		Thread.sleep(3000);
	}		

}
