package com.mercury.tours.pages;	
/**
 * *********************************************************************************
 * @author sakhter
 * Class Name: MercuryToursLoginPage 
 * Description: This class will store all the locator and methods of MercuryToursLoginPage 
 * Reviewer Name:
 * Comments:
 * **********************************************************************************
 **/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mercury.tours.util.Utility;

public class MercuryToursLoginPage {
	public WebDriver driver;
	public MercuryToursLoginPage(WebDriver driver) {
		this.driver = driver;  
	}
	/**
	 *********************************************************************************************************   
				                            WebElements - Mercury Tours Login page
	 *********************************************************************************************************
	 **/
	@FindBy(name="email") WebElement userNameInput;
	@FindBy(name="password") WebElement passwordInput;
	@FindBy(name="submit") WebElement submitBtn;
	@FindBy(xpath="//*[contains(text(),' Note: Your user name is jojobean.')]") WebElement registerConfirmationMessage;
	/**
	 *********************************************************************************************************   
				                           Methods - Mercury Tours Login page
	 *********************************************************************************************************
	 **/
	@Test  
	public void mercuryToursLoginPageElementsAndMethods(String uName, String uPass) {
		try {
			Thread.sleep(2000); // Wait statement    
			System.out.println(">>>>>>>> Test: Validate User Registration <<<<<<<<");
			userNameInput.sendKeys(uName); // Enter valid username 
			Thread.sleep(2000); // Wait statement 
			passwordInput.sendKeys(uPass); // Enter valid password  
			Thread.sleep(2000); // Wait statement
			submitBtn.click(); // Click the submit button       
			Thread.sleep(2000); // Wait statement

			Utility.captureScreenshot(driver, "MercuryToursLoginPage"); // Will capture the screenshot
			// Print the confirmation message
			System.out.println("Validate that confirmation message is: "+registerConfirmationMessage.getText());
			// Validate the confirmation message after the user register
			Assert.assertTrue(registerConfirmationMessage.isDisplayed(), "Unable to log into system");
			Thread.sleep(1000); // wait statement

		} catch (InterruptedException e) {
			System.out.println("Not able to Login "+e.getMessage());
		}       
	}
	/**
	 * ******************************************************************************************************************************************
	 *                                        >>>>>>>>>>>> End of the file <<<<<<<<<<<<
	 * ******************************************************************************************************************************************
	 */
}

