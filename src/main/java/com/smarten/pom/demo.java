package com.smarten.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class demo
{
	
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TEstingSetUP\\Chrome\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://smarten.meriapps.com/erp/dashboard/home");
		Thread.sleep(2000);
		
		WebElement Login= driver.findElement(By.xpath("//input[@type='email']"));
		Login.sendKeys("shubham@codezen.in");
		Thread.sleep(2000);

		WebElement Password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys("121212");
		Thread.sleep(2000);
		
		WebElement Login_btn= driver.findElement(By.xpath("//button[contains(@class,'ant-btn login')]"));
		Login_btn.click();
		
	//	WebElement Menu= driver.findElement(By.xpath("//li[@class='desktop-toggle']"));
		
	//	Menu.click();
		
		Thread.sleep(2000);
		
		WebElement Task_Allocation= driver.findElement(By.xpath("(//li[contains(@class,'ant-menu-submenu')])[10]"));

		Task_Allocation.click();
		Thread.sleep(2000);

       //	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200)");
		
	//	WebElement All_task= driver.findElement(By.xpath("(//li[contains(@class,'ant-menu-submenu')])[10]/descendant::li[contains(@class,'ant-menu-item ng-star')][4]"));
	//	All_task.click();
		
		WebElement All_task= driver.findElement(By.xpath("(//li[contains(@class,'ant-menu-submenu')])[10]/descendant::li[contains(@class,'ant-menu-item ng-star')][4]"));
	//	WebElement All_task= driver.findElement(By.xpath("(//li[contains(@class,'ant-menu-submenu')])[10]/descendant::a[@href='/erp/task-allocation/all-tasks']"));
	
		Thread.sleep(4000);
	//	All_task.click();

	   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",All_task);    
		Thread.sleep(4000);
//       ((JavascriptExecutor)driver).executeScript("arguments[0].click();", All_task);		
//       Thread.sleep(3000);
       Actions act = new Actions(driver);
       act.click(All_task).perform();

       Thread.sleep(2000);

		WebElement New_Btn= driver.findElement(By.xpath("(//button[contains(@class,'ant-btn text-white')])[1]"));
		New_Btn.click();
		Thread.sleep(2000);
		WebElement Title_In_English= driver.findElement(By.xpath("//textarea[@placeholder='Title in English']"));
		Title_In_English.sendKeys("hello");
		Thread.sleep(2000);
		WebElement Converter1= driver.findElement(By.xpath("(//img[@src='assets/gif/translate.gif'])[1]"));
		Converter1.click();
		Thread.sleep(2000);
		WebElement Description_In_English= driver.findElement(By.xpath("//textarea[@placeholder='Description in English']"));
		Description_In_English.sendKeys("hello");
		Thread.sleep(3000);
		WebElement Converter2= driver.findElement(By.xpath("(//img[@src='assets/gif/translate.gif'])[2]"));
		Converter2.click();
		Thread.sleep(3000);
		
		WebElement project_task= driver.findElement(By.xpath("//nz-select[@formcontrolname='ProjectSelect']"));
		//WebElement A=project_task.get(0);
		project_task.click();
		
		//div[@id='cdk-overlay-3']
		WebElement DD1= driver.findElement(By.xpath("//div[@class='cdk-virtual-scroll-content-wrapper']"));
		String d=DD1.getText();
		System.out.println(d);
		
		if(d.contains("aac"))
		{
			Thread.sleep(3000);
			//   //div[text()='abcd']
			WebElement Sel_project_task= driver.findElement(By.xpath("//div[text()='aac']"));
			Sel_project_task.click();
			Thread.sleep(3000);
		}
		
		Thread.sleep(3000);
//		WebElement Sel_project_task= driver.findElement(By.xpath("//div[text()='QA Team']"));
//		Sel_project_task.click();
//		Thread.sleep(3000);
		WebElement Sel_Assignee= driver.findElement(By.xpath("//nz-select[@nzplaceholder='Select Assignee']"));
		Sel_Assignee.click();
 		WebElement Sel_Assignee_name= driver.findElement(By.xpath("//div[text()='anish/+919028655661']"));
 		Sel_Assignee_name.click();
		
		
		WebElement Star_time= driver.findElement(By.xpath("//nz-date-picker[@formcontrolname='start_time']"));
		Star_time.click();
		Thread.sleep(3000);
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cdk-overlay-7")));
//		WebElement Due_time= driver.findElement(By.xpath("//nz-date-picker[@formcontrolname='due_time']"));
//		.click();
		
		
		
		WebElement Date= driver.findElement(By.xpath("(//div[@class='ant-picker-cell-inner ng-star-inserted'])[5]"));
		Thread.sleep(3000);
		Date.click();
		Thread.sleep(3000);
		WebElement ok= driver.findElement(By.xpath("//li[@class='ant-picker-ok ng-star-inserted']"));
		ok.click();
		Thread.sleep(3000);
		WebElement Due_time= driver.findElement(By.xpath("//nz-date-picker[@formcontrolname='due_time']"));
		Due_time.click();
		WebElement Date1= driver.findElement(By.xpath("(//div[@class='ant-picker-cell-inner ng-star-inserted'])[5]"));
		Thread.sleep(3000);
		Date1.click();
		Thread.sleep(3000);
		WebElement ok1= driver.findElement(By.xpath("//li[@class='ant-picker-ok ng-star-inserted']"));
		ok1.click();
		Thread.sleep(3000);
		WebElement Priority_high= driver.findElement(By.xpath("//label[@formcontrolname='priorityVeryHigh']"));
	    act.click(Priority_high).perform();
		//Priority_high.click();
		Thread.sleep(3000);
		WebElement Status= driver.findElement(By.xpath("//nz-select[@formcontrolname='statusvalue']"));
        Status.click();
        Thread.sleep(3000);
		WebElement Sel_Status= driver.findElement(By.xpath("//div[text()='In process']"));        
		Sel_Status.click();
		Thread.sleep(3000);
		WebElement Add= driver.findElement(By.xpath("//button[@type='submit']"));        
		Add.click();
		Thread.sleep(3000);
		WebElement Done= driver.findElement(By.xpath("(//button[contains(@class,'ant-btn bg-secondary')])[2]"));        
		Done.click();
		Thread.sleep(3000);
		WebElement task= driver.findElement(By.xpath("(//tr[@class='ant-table-row ng-star-inserted'])[2]//td[@class=\"cursor-pointer ant-table-cell\"][2]"));        
		task.click();
		
		WebElement Update_project_task= driver.findElement(By.xpath("//nz-select[@formcontrolname='ProjectSelect']"));
		Update_project_task.click();
		Thread.sleep(3000);
		WebElement Sel_toUpdate_project_task= driver.findElement(By.xpath("//div[text()='abcd']"));
		Sel_toUpdate_project_task.click();
		Thread.sleep(3000);
		
		
		WebElement Update_Status= driver.findElement(By.xpath("//nz-select[@formcontrolname='statusvalue']"));
		Update_Status.click();
        Thread.sleep(3000);
		WebElement Sel_UpdateStatus= driver.findElement(By.xpath("//div[text()='In process']"));        
		Sel_UpdateStatus.click();
		Thread.sleep(3000);
		WebElement Comment= driver.findElement(By.xpath("//textarea[@placeholder='Write Comment']"));        
		Comment.sendKeys("update in task");
		WebElement Comment_btn= driver.findElement(By.xpath("//span[text()='Comment']"));        
		Comment_btn.sendKeys("update in task");
		
		
		
	//	Select sel = new Select(Status);
    //    sel.selectByVisibleText("Service Done");
        
    /*    WebElement Assignee= driver.findElement(By.xpath("(//nz-select[@nzplaceholder='Select Project'])[2]"));

		Select sel1 = new Select(Assignee);
		sel1.selectByVisibleText("Shubham");
		
		WebElement Priority= driver.findElement(By.xpath("//label[@formcontrolname='priorityHigh']"));
        Priority.click();
        
		WebElement Status= driver.findElement(By.xpath("//nz-select[@nzplaceholder='Select']"));

        Select sel2 = new Select(Status);
		sel2.selectByVisibleText("In process");
	*/
		
 
		
		
	}
	
	

}
