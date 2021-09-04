package com.app.newtours.regression;
/**
 * *********************************************************************
 * Author: Salma Akhter
 * Class Name: TestNewToursApp
 * Description: 
 * Reviewer Name:
 * Comments:
 * *********************************************************************
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNewToursApp {
	public WebDriver driver;
	public String baseurl = "http://demo.guru99.com/test/newtours/";

	@Test (priority = 0)
	public void loginNewToursValidation () {
		try {
			// login
			driver.findElement(By.name("userName")).sendKeys("jojobean");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("jojobean");
			Thread.sleep(5000);
			driver.findElement(By.name("submit")).click();
			Thread.sleep(2000);
			WebElement confirmationMessage = driver.findElement(By.xpath("//b[contains(text(),' Thank you for Loggin. ')]"));
			System.out.println(confirmationMessage.getText());
			Assert.assertTrue(confirmationMessage.isDisplayed(), "confirmationMessage web element is not displayed" );
		} catch (Exception e) {
		}	
	}    
	@Test (priority = 1)
	public void flightBookingValidation () {
		try {
			driver.findElement(By.linkText("Flights")).click();
			driver.findElement(By.name("tripType")).click();
			Thread.sleep(2000);
			Select passengers = new Select(driver.findElement(By.name("passCount")));
			passengers.selectByValue("2");
			Thread.sleep(2000);
			Select departingFrom = new Select(driver.findElement(By.name("fromPort")));
			departingFrom.selectByVisibleText("New York");
			Thread.sleep(2000);
			Select departingMonth = new Select(driver.findElement(By.name("fromMonth")));
			departingMonth.selectByVisibleText("February");
			Thread.sleep(2000);
			Select departingDay = new Select(driver.findElement(By.name("fromDay")));
			departingDay.selectByVisibleText("2");
			Thread.sleep(2000);
			Select departingTo = new Select(driver.findElement(By.name("toPort")));
			departingTo.selectByVisibleText("London");
			Thread.sleep(2000);
			Select arrivingMonth = new Select(driver.findElement(By.name("toMonth")));
			arrivingMonth.selectByVisibleText("April");
			Thread.sleep(2000);
			Select arrivingDay = new Select(driver.findElement(By.name("toDay")));
			arrivingDay.selectByVisibleText("1");
			Thread.sleep(2000);		 
			driver.findElement(By.name("servClass")).click();
			Thread.sleep(2000);
			Select serviceClass = new Select(driver.findElement(By.name("airline")));
			serviceClass.selectByVisibleText("Blue Skies Airlines");
			Thread.sleep(2000);
			driver.findElement(By.name("findFlights")).click();
			Thread.sleep(2000);
			WebElement fightBookingconfirmationMessage = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]"));
			System.out.println(fightBookingconfirmationMessage.getText());
			Assert.assertTrue(fightBookingconfirmationMessage.isDisplayed(), "fightBookingconfirmationMessage web element is not displayed");
		} catch (Exception e) {
		}	
	}    
	@BeforeClass
	public void beforeClass(){
		try {
			WebDriverManager.chromedriver().setup();
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
	@AfterClass
	public void afterClass(){
		try {
			driver.quit();
		} catch (Exception e) {
		}	  
	}
}
