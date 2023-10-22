package Utilities;

import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Utilities extends Commons {
	

	  @BeforeTest
	  public void beforeTest() {
		  log.info("before Test method");
		 
	  }
	  
	  
	  @AfterTest
	  public void afterTest() {
		  log.info("after Test method");
		 
		  
	  }
	  
	  
      
	  @Parameters({"browser","websiteURL"})	  
	  @BeforeClass
	  public void beforeClass(String browserName,String url) throws InterruptedException {

		  Ibrowser(browserName, url);
		  log.info("User is on the Homepage");
		  
		 
		
	  }
	  
	 

	  
	  
	  @AfterClass //7
	  public void afterClass() throws InterruptedException {
		  Thread.sleep(2000);
		  log.warn("browser is closing.");
	      driver.close();
		
	  }
	  
	  
	  
	  
	  
		
		
		
		
		
		






}
