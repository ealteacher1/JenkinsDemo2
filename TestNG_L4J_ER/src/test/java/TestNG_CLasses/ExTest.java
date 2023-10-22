package TestNG_CLasses;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utilities.Utilities;

import org.testng.annotations.BeforeTest;


import org.testng.annotations.AfterTest;

public class ExTest extends Utilities {
	ExtentReports extent = new ExtentReports();  //reports
	ExtentSparkReporter spark = new ExtentSparkReporter("Results/ShamsEvan_"+System.currentTimeMillis()+".html"); //htmlreporters
    ExtentTest test;
	
	
	
  @Test
  public void tc1_Validate_Login_Functionality() {
	  test=extent.createTest("Launch Browser and Go to Website").assignAuthor("Maria").assignCategory("smoke").assignDevice("Chrome");
	  //browsert initialized 
	  // implicit wait given
	  // maximize the screen
	  //go to URl
//	  test.log(Status.PASS, "User Launched the Website Successfully");
	  test.info("User Successfully land on Homepage and Title Veified");
	  
	  //validate page title 
	  
	  test.pass("HomePage title verified");  
  }
  
  @Test
  public void tc2_Registration_Validation() {
	  test=extent.createTest("Validate Login ").assignAuthor("Maria").assignCategory("smoke").assignDevice("Chrome");
	  //type email and password in login field 
	  // click on login button 
	  //  wait for the alert
	  
	  test.warning("alert Displaying");
	  
	  //accept the alert 
	  //verified homepage after loging successfuly 
	  
	  test.pass("user logged in to the application Successfully");
	  
	  
  }
  
  public void tc3() {
	  test=extent.createTest("Validate Dashboard ").assignAuthor("Maria").assignCategory("smoke").assignDevice("Chrome");
	  //click on dashboard 
	  // verify /assert the Title 
	  
	  test.fail("Title is not verified");
	  
	  //accept the alert 
	  //verified homepage after loging successfuly 
	  
	  test.skip("Test skipped"); 
	  
	  
  }
  
  
  
  
  
  @BeforeTest
  public void beforeTest() {  
	  extent.attachReporter(spark);

  }

  @AfterTest
  public void afterTest() {
	  extent.flush();
  }

}
