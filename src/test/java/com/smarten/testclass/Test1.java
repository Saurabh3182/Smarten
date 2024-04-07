package com.smarten.testclass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.smarten.pom.Index_page_pom;
import com.smarten.pom.Login_page_pom;
import com.smarten.pom.log_out;
import com.smarten.pom.updateform_pom;
import com.smarten.utility.Baseclass;
import com.smarten.utility.utilityclass;


public class Test1 extends Baseclass
{
	
	Index_page_pom In ;
	String Test_name; 
	Login_page_pom LP;
	utilityclass ul;
	updateform_pom update;
	log_out logOut;
	
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException
	{
		
		System.out.println("************************Test Start*********************************");
	//	initialize("chrome"); // Pass the URL parameter to the initialize method
        Reporter.log("Browser open",true);
        Reporter.log("Enter URL",true);
	
        
        
		In = new Index_page_pom(driver);
		LP = new Login_page_pom(driver);
//		Pone = new Add_task_F(driver);	
		ul = new utilityclass();
	    update = new updateform_pom(driver);
		logOut = new log_out(driver);
		
		LP.Email(utilityclass.getdatafromPF("Email"));
		LP.Password(utilityclass.getdatafromPF("password"));
		LP.Login_btn();    	
		Reporter.log("Login Successfull",true);
		
	}


	@Test(priority=1)
	public void Task_allocation() throws InterruptedException
	{
		Test_name="update_task_name";
		
       In.Task_Allocation();
       
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",In.All_task());    
 	      
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", In.All_task());
        In.Click_All_task();
        In.New_Btn();
        In.Title_In_English("Hello");
        In.Converter1();
        In.Description_In_English("Hello");
        In.Converter2();
        In.project_task();
        In.dropdown();
        In.Sel_Assignee();
        In.Sel_Assignee_name();
        In.Star_time();
        In.Date();
        In.ok();
        In.Duetime();
        In.Date1();
        In.ok1();
        In.Priority_high();
        In.Click();
        In.Sel_Status();
        In.Add();
   	    In.Done();                
   	    update.task();
   	    
   	    String Actual =update.form_name();
        System.out.println(Actual);
		String Expected= "Hello";
        System.out.println(Expected);
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Actual, Expected);
   	
		update.Update_project_task();
		update.Sel_toUpdate_project_task();
	    update.Update_Status();
		update.Sel_UpdateStatus();
    	update.Comment("Update form");
      	update.Comment_btn();
     
	}	

	@AfterMethod
	public void logout(ITestResult Result) throws IOException, InterruptedException
	{
		
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			utilityclass.takeScreenShot(driver, Test_name);

		}

		logOut.Close_form();
		logOut.User();
		logOut.Log_out();

		Reporter.log("Log Out Account",true);
	
	}

}
