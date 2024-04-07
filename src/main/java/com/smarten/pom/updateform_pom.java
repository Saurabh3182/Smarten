package com.smarten.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class updateform_pom
{
	@FindBy(xpath="(//tr[@class='ant-table-row ng-star-inserted'])[2]//td[@class=\"cursor-pointer ant-table-cell\"][2]") private WebElement task ;

	@FindBy(xpath="//div[text()=' Hello ']") private WebElement form_Name ;
	
	
	@FindBy(xpath="//nz-select[@formcontrolname='ProjectSelect']") private WebElement Update_project_task ;
	
	@FindBy(xpath="//div[text()='abcd']") private WebElement Sel_toUpdate_project_task ;

	@FindBy(xpath="//nz-select[@formcontrolname='statusvalue']") private WebElement Update_Status ;

	@FindBy(xpath="//div[text()='In process']") private WebElement Sel_UpdateStatus ;

	@FindBy(xpath="//textarea[@placeholder='Write Comment']") private WebElement Comment ;

	@FindBy(xpath="//span[text()='Comment']") private WebElement Comment_btn ;
	
	
	public updateform_pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void task() throws InterruptedException
	{
		Thread.sleep(2000);
		task.click();
		Thread.sleep(3000);
	}		

	public void Update_project_task() throws InterruptedException
	{
		Update_project_task.click();
		Thread.sleep(3000);
	}		

	public void Sel_toUpdate_project_task() throws InterruptedException
	{
		Sel_toUpdate_project_task.click();
		Thread.sleep(3000);
	}		

	public void Update_Status() throws InterruptedException
	{
		Update_Status.click();
		Thread.sleep(3000);
	 //   return new LoginPage(driver);	
	}		

	public void Sel_UpdateStatus() throws InterruptedException
	{
		Sel_UpdateStatus.click();
		Thread.sleep(3000);
	 //   return new LoginPage(driver);	
	}

	public void Comment(String text) throws InterruptedException
	{
		Comment.sendKeys(text);;
		Thread.sleep(3000);
	 //   return new LoginPage(driver);	
	}
	
	public void Comment_btn() throws InterruptedException
	{
		Comment_btn.click();
		Thread.sleep(3000);
	 //   return new LoginPage(driver);	
	}
	
	public String form_name() throws InterruptedException
	{
		String name=form_Name.getText();
		return name;	
	}	
	

}
