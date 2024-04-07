package com.smarten.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Baseclass
{
    public WebDriver driver=null ;
    public ExtentReports extent;
    public ExtentTest test;
    public ExtentHtmlReporter htmlReporter;

    
    @Parameters("browserName")
	 @BeforeClass
		public void initialize(@Optional String browserName) throws InterruptedException, IOException
		{
			
			System.out.println(browserName);
					
			if(browserName.contains ("chrome"))
			{
				
			System.setProperty("webdriver.chrome.driver",
		        "D:\\TEstingSetUP\\Chrome\\chromedriver-win64\\chromedriver.exe");
	        
		    driver = new ChromeDriver();
		    
		    }
			else if (browserName.equals("edge"))
		     { 
		    	 
			     System.setProperty("webdriver.edge.driver",
			        "D:\\TEstingSetUP\\edge driver\\msedgedriver.exe");

			    driver = new EdgeDriver();

		     }
			driver.get("https://smarten.meriapps.com/erp/dashboard/home");
		    driver.manage().window().maximize();
		}


	    @AfterClass
	    public void CloseBrowser() throws InterruptedException  
	    {
	        driver.close();
	    	Reporter.log("Browser Close",true);
			System.out.println("***********************Tests Finish******************************************");

	    }

	

}
