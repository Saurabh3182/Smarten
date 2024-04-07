package com.smarten.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Index_page_pom 
{

//	@FindBy(xpath="(//li[contains(@class,'ant-menu-submenu')])[10]") private WebElement Task_Allocation ;
	@FindBy(xpath="(//li[contains(@class,'ant-menu-submenu')])[4]") private WebElement Task_Allocation ;

//	@FindBy(xpath="(//li[contains(@class,'ant-menu-submenu')])[10]/descendant::li[contains(@class,'ant-menu-item ng-star')][4]") private WebElement All_task ;
	@FindBy(xpath="(//li[contains(@class,'ant-menu-submenu')])[4]/descendant::li[contains(@class,'ant-menu-item ng-star')][4]") private WebElement All_task ;

	@FindBy(xpath="(//button[contains(@class,'ant-btn text-white')])[1]") private WebElement New_Btn ;

	@FindBy(xpath=("//textarea[@placeholder='Title in English']")) private WebElement Title_In_English;

	@FindBy(xpath=("(//img[@src='assets/gif/translate.gif'])[1]")) private WebElement Converter1;

	@FindBy(xpath=("//textarea[@placeholder='Description in English']")) private WebElement Description_In_English;

	@FindBy(xpath=("(//img[@src='assets/gif/translate.gif'])[2]")) private WebElement Converter2;

	@FindBy(xpath=("//nz-select[@formcontrolname='ProjectSelect']")) private WebElement project_task;

	@FindBy(xpath=("//div[@class='cdk-virtual-scroll-content-wrapper']")) private WebElement dropdown;

	@FindBy(xpath=("//nz-select[@nzplaceholder='Select Assignee']")) private WebElement Sel_Assignee;

	@FindBy(xpath=("//div[text()='anish/+919028655661']")) private WebElement Sel_Assignee_name;

	@FindBy(xpath=("//nz-date-picker[@formcontrolname='start_time']")) private WebElement Star_time;

	@FindBy(xpath=("(//div[@class='ant-picker-cell-inner ng-star-inserted'])[5]")) private WebElement Date;

	@FindBy(xpath=("//li[@class='ant-picker-ok ng-star-inserted']")) private WebElement ok;

	@FindBy(xpath=("//nz-date-picker[@formcontrolname='due_time']")) private WebElement Duetime;

	@FindBy(xpath=("(//div[@class='ant-picker-cell-inner ng-star-inserted'])[5]")) private WebElement Date1;

	@FindBy(xpath=("//li[@class='ant-picker-ok ng-star-inserted']")) private WebElement ok1;

	@FindBy(xpath=("//label[@formcontrolname='priorityVeryHigh']")) private WebElement Priority_high;

	@FindBy(xpath=("//nz-select[@formcontrolname='statusvalue']")) private WebElement Click;

	@FindBy(xpath=("//div[text()='In process']")) private WebElement Sel_Status;

	@FindBy(xpath=("//button[@type='submit']")) private WebElement Add;

	@FindBy(xpath=("(//button[contains(@class,'ant-btn bg-secondary')])[2]")) private WebElement Done;

	//	@FindBy(xpath=("(//button[contains(@class,'ant-btn bg-secondary')])[2]")) private WebElement Done;
	//	@FindBy(xpath=("(//tr[@class='ant-table-row ng-star-inserted'])[2]//td[@class=\"cursor-pointer ant-table-cell\"][2]")) private WebElement Click;



	public Index_page_pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}





	public void Task_Allocation() throws InterruptedException
	{
		Task_Allocation.click();
		Thread.sleep(3000);
		//   return new LoginPage(driver);	
	}		

	public WebElement All_task() 
	{
		return All_task;
		//   return new LoginPage(driver);	
	}		

	public void Click_All_task() throws InterruptedException
	{
		All_task.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}

	public void New_Btn() throws InterruptedException
	{
		New_Btn.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}

	public void Title_In_English(String text) throws InterruptedException
	{
		Title_In_English.sendKeys(text);
		Thread.sleep(2000);
		//   return new LoginPage(driver);	

	}

	public void Converter1() throws InterruptedException
	{
		Converter1.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}

	public void Description_In_English(String text) throws InterruptedException
	{
		Description_In_English.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}

	public void Converter2() throws InterruptedException
	{
		Converter2.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}	


	public void project_task() throws InterruptedException
	{
		project_task.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}

	public void dropdown() throws InterruptedException
	{
		dropdown.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	


	}

	public void Sel_Assignee() throws InterruptedException
	{
		Sel_Assignee.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	

	}

	public void Sel_Assignee_name() throws InterruptedException
	{
		Sel_Assignee_name.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}

	public void Star_time() throws InterruptedException
	{
		Star_time.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}

	public void Date() throws InterruptedException
	{
		Date.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}

	public void ok() throws InterruptedException
	{
		ok.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}

	public void Duetime() throws InterruptedException
	{
		Duetime.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}


	public void Date1() throws InterruptedException
	{
		Date1.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}


	public void ok1() throws InterruptedException
	{
		ok1.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}


	public void Priority_high() throws InterruptedException
	{
		Priority_high.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}

	public void Click() throws InterruptedException
	{
		Click.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}

	public void Sel_Status() throws InterruptedException
	{
		Sel_Status.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}

	public void Add() throws InterruptedException
	{
		Add.click();
		Thread.sleep(2000);
		//   return new LoginPage(driver);	
	}

	public void Done() throws InterruptedException
	{
		Done.click();
		Thread.sleep(4000);
		//   return new LoginPage(driver);	
	}

}


