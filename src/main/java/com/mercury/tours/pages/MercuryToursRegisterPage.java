package com.mercury.tours.pages;
/**
 * *********************************************************************************
 * @author sakhter
 * Class Name: MercuryToursRegisterPage 
 * Description: This class will store all the locator and methods of MercuryToursRegisterPage 
 * Reviewer Name:
 * Comments:
 * **********************************************************************************
 **/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mercury.tours.util.Utility;

public class MercuryToursRegisterPage {
	public WebDriver driver;
	public MercuryToursRegisterPage(WebDriver driver) {
		this.driver = driver;  
	}
	/**
	 *********************************************************************************************************   
			                            WebElements - Mercury Tours Register page
	 *********************************************************************************************************
	 **/
	@FindBy(linkText="REGISTER") WebElement registerHyperlink;
	@FindBy(name="firstName") WebElement firstNameInput;
	@FindBy(name="lastName") WebElement lastNameInput;
	@FindBy(name="phone") WebElement phoneNumberInput;
	@FindBy(name="userName") WebElement emailIdInput;
	@FindBy(name="address1") WebElement addressInput;
	@FindBy(name="city") WebElement cityNameInput;
	@FindBy(name="state") WebElement stateNameInput;
	@FindBy(name="postalCode") WebElement postalCodeInput;
	@FindBy(name="country") WebElement countryDrp;
	@FindBy(name="email") WebElement userNameInput;
	@FindBy(name="password") WebElement passwordInput;
	@FindBy(name="confirmPassword") WebElement confirmPasswordInput;
	@FindBy(name="submit") WebElement submitBtn;
	@FindBy(xpath="//*[contains(text(),' Note: Your user name is jojobean.')]") WebElement registerConfirmationMessage;
	/**
	 *********************************************************************************************************   
			                           Methods - Mercury Tours Register page
	 *********************************************************************************************************
	 **/
	@Test  
	public void mercuryToursRegisterPageElementsAndMethods(String fName, String lName, String uPhone, 
			String uEmail, String uAddress, String uCity, String uState, String pCode, String uCountry, 
			String uName, String uPass, String uConfirmPass) {
		try {
			Thread.sleep(2000); // Wait statement    
			System.out.println(">>>>>>>> Test: Validate User Registration <<<<<<<<");
			registerHyperlink.click(); // Click the Register hyperlink

			firstNameInput.sendKeys(fName); // Enter the user first name 
			Thread.sleep(2000); // Wait statement 
			lastNameInput.sendKeys(lName); // Enter the user last name    
			Thread.sleep(2000); // Wait statement
			phoneNumberInput.sendKeys(uPhone); // Enter the user phone number
			Thread.sleep(2000); // Wait statement 
			emailIdInput.sendKeys(uEmail); // Enter email Id   
			Thread.sleep(2000); // Wait statement
			addressInput.sendKeys(uAddress); // Enter user address  
			Thread.sleep(2000); // Wait statement 
			cityNameInput.sendKeys(uCity); // Enter user city name
			Thread.sleep(2000); // Wait statement 
			stateNameInput.sendKeys(uState); // Enter user state
			Thread.sleep(2000); // Wait statement 
			postalCodeInput.sendKeys(pCode); // Enter user postal code 
			Select selectcountry = new Select (countryDrp);
			selectcountry.selectByVisibleText(uCountry); // Select the user country

			userNameInput.sendKeys(uName); // Enter valid username 
			Thread.sleep(2000); // Wait statement 
			passwordInput.sendKeys(uPass); // Enter user password  
			Thread.sleep(2000); // Wait statement
			confirmPasswordInput.sendKeys(uConfirmPass); // Enter confirm password 
			Thread.sleep(2000); // Wait statement 
			submitBtn.click(); // Click the submit button       
			Thread.sleep(2000); // Wait statement

			Utility.captureScreenshot(driver, "MercuryToursRegisterPage"); // Will capture the screenshot
			// Print the confirmation message
			System.out.println("Validate that confirmation message is: "+registerConfirmationMessage.getText());
			// Validate the confirmation message after the user register
			Assert.assertTrue(registerConfirmationMessage.isDisplayed(), "Unable to find the home page");
			Thread.sleep(1000); // wait statement

		} catch (InterruptedException e) {
			System.out.println("Not able to Register "+e.getMessage());
		}       
	}
	/**
	 * ******************************************************************************************************************************************
	 *                                        >>>>>>>>>>>> End of the file <<<<<<<<<<<<
	 * ******************************************************************************************************************************************
	 */
}

