package com.qatest.PR.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UpdateProfile {
	
	public WebDriver driver;
	public UpdateProfile(WebDriver driver){
	   this.driver = driver;	
	   }
	// WebElements - Update Profile page
	    @FindBy(linkText="I Accept") WebElement iAcceptBtn;
	    @FindBy(xpath="/html/body/div[1]/nav/div[1]/div[2]/ul/li[3]/a") WebElement accountHyperlink;
        @FindBy(xpath="/html/body/div[1]/nav/div[1]/div[2]/ul/li[3]/ul/li[2]/a") WebElement userProfileHyLink;
		@FindBy(name="firstname") WebElement firstName;
	    @FindBy(name="lastname") WebElement lastName;
		@FindBy(name="user_address_line1") WebElement userAddressLine1;
		@FindBy(name="user_address_line2") WebElement userAddressLine2;
	    @FindBy(name="user_city") WebElement userCity;
		@FindBy(name="user_state") WebElement userState;	
		@FindBy(name="user_zipcode") WebElement userZipcode;
	    @FindBy(name="on_submit") WebElement onSubmit;
	    
	 // Methods - Update Profile page    
@Test()
public void updateProfileElementsAndMethods(String fn, String ln, String ud1, 
		String ud2, String uc, String us, String uz) {
	try {
		 Thread.sleep(4000);       // Wait statement
		 System.out.println("<<Update Profile>> page");
		 iAcceptBtn.click();
		 Thread.sleep(4000); // Wait statement
		 accountHyperlink.click(); // Click on the <Account> 
		 Thread.sleep(4000); // Wait statement
		 userProfileHyLink.click(); // Click on the <Profile> 
		 Thread.sleep(4000); // Wait statement
		 firstName.clear();
	     firstName.sendKeys(fn);
	     Thread.sleep(4000); // Wait statement
	     lastName.clear();
	     lastName.sendKeys(ln);
	     Thread.sleep(4000); // Wait statement
	     userAddressLine1.clear();
	     userAddressLine1.sendKeys(ud1);
	     Thread.sleep(4000); // Wait statement
	     userAddressLine2.clear();
	     userAddressLine2.sendKeys(ud2);
	     Thread.sleep(4000); // Wait statement
	     userCity.clear();
	     userCity.sendKeys(uc);
	     Thread.sleep(4000); // Wait statement
	     userState.clear();
	     userState.sendKeys(us);
	     Thread.sleep(4000); // Wait statement
	     userZipcode.clear();
	     userZipcode.sendKeys(uz);
	     // Create object of WebDriverWait class
         WebDriverWait waitonSubmit = new WebDriverWait(driver,960);
         // Wait till element is visible
         waitonSubmit.until(ExpectedConditions.elementToBeClickable(onSubmit));
	     onSubmit.click();
	     Thread.sleep(4000); // Wait statement
	 } catch (InterruptedException e) {
     }		
	
}


	    
		
	
	
	
	
	
	

}
