package com.ProfoundRadiance.PRTax;

/**
 * *********************************************************************
 * Author: Salma Akhter
 * Class Name: PR_Regression_Suite
 * Description: This class will navigate to user to login to the system
 * Reviewer Name:
 * Comments:
 * *********************************************************************
 */

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class UserLogin {
	
	public WebDriver driver;
    public String baseurl = "http://demo.guru99.com/test/newtours/";

  @Test
  public void userLogin() {
	  try {
	  // User Login
	 WebElement username = driver.findElement(By.name("userName"));
	 WebElement passwd = driver.findElement(By.name("password"));
	 WebElement submitBtn = driver.findElement(By.name("submit"));
	 WebElement loginSuccessMessage = driver.findElement(By.xpath("//*[contains(text(),'Login Successfully')]"));	
	 WebElement signOffHyperlink = driver.findElement(By.linkText("SIGN-OFF"));
	 
	 username.sendKeys("tomcat");
	 Thread.sleep(2000);
	 passwd.sendKeys("tomcat");  
	 
      // Create object of WebDriverWait class
      WebDriverWait waitSubmitBtn = new WebDriverWait(driver,240);
      // Wait till element is visible
      waitSubmitBtn.until(ExpectedConditions.elementToBeClickable(submitBtn));
      submitBtn.click();
      Thread.sleep(4000);
      
      // Create object of WebDriverWait class
      WebDriverWait waitLoginSuccessMessage = new WebDriverWait(driver,240);
      // Wait till element is visible
      waitLoginSuccessMessage.until(ExpectedConditions.elementToBeClickable(loginSuccessMessage));	 
      // Validate user login 	  
	  Assert.assertEquals(loginSuccessMessage, "Login Successfully");
	  
	  signOffHyperlink.click();
	 
	  } catch (Exception e) {
      }	
   }  
  
  /*
  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }
  
*/
  @BeforeClass
  public void beforeClass(){
	  try {
	  
	WebDriverManager.chromedriver().setup();
	//WebDriverManager.firefoxdriver();
	//WebDriverManager.iedriver();
	  
	 driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	 driver.get(baseurl); // Navigate to the expected URL
	 Thread.sleep(6000);

  } catch (Exception e) {
  }	
	 
	 
  } 
}


/**
 * *********************************************************************
 * End of the file
 * *********************************************************************
 */
