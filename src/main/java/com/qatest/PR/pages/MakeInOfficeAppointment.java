package com.qatest.PR.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeInOfficeAppointment {	
	public WebDriver driver;
	public MakeInOfficeAppointment(WebDriver driver){
		this.driver = driver;	
	}	
	//  Web Elements - <<Make An Appointment For In-office Appointment>> form
	@FindBy(linkText="I Accept") WebElement iAcceptBtn;
	@FindBy(linkText="IN-OFFICE APPOINTMENT") WebElement inOfficeAppmntBtn;
	@FindBy(xpath="//h1[contains(text(),'Make An Appointment')]") WebElement makeAppmntPgTitle;
	@FindBy(id="filing_case_appointment_date") WebElement appmntDate;	
	//	@FindBy(xpath="//input[@type='radio'and@name='filing_case_appointment_time']") WebElement appmntTime;
	//	@FindBy(xpath="//input[@type='radio'and @value='5']") WebElement appmntTime;
	@FindBy(name="user_first_name") WebElement firstName;
	@FindBy(name="user_last_name") WebElement lastName;
	@FindBy(name="user_email") WebElement userEmail;
	@FindBy(name="user_phone") WebElement userPhone;
	@FindBy(name="user_address_line1") WebElement userAddress1;
	@FindBy(name="user_address_line2") WebElement userAddress2;
	@FindBy(name="user_city") WebElement userCity;
	@FindBy(name="user_state") WebElement userState;
	@FindBy(name="user_zipcode") WebElement userZipcode;
	@FindBy(name="user_ssn") WebElement userSSN;
	@FindBy(name="filing_message_text") WebElement messageTextBx;
	@FindBy(xpath="//input[@type ='checkbox' and @value ='1']") WebElement payOfficeCheckbx;
	@FindBy(name="on_submit") WebElement submitBtn;
	@FindBy(xpath=
			"//h1[contains(text(),'Successfully Take The Request, we will contact you soon')]")
	WebElement confirmMessgLabel;

	@Test ()   // Methods - <<Make An Appointment For In-office Appointment>> form
	public void makeInOfficeAppointmentElementsAndMethods
	(String apd, String fnm, String lnm, String uem, String uph, String uad1, String uad2, 
			String ucty, String ust, String uzcd, String usn, String mtxbx) {
		try {
			System.out.println("<<Make An Appointment For In-office Appointment>> form");
			Thread.sleep(2000);            // Wait statement
			iAcceptBtn.click();
			Thread.sleep(2000);           // Wait statement
			inOfficeAppmntBtn.click();
			Thread.sleep(2000);           // Wait statement
			Assert.assertTrue(makeAppmntPgTitle.isDisplayed(),
					"<<Make An Appointment For In-office Appointment >> form is not displayed"
					);

			appmntDate.sendKeys(apd);

			/*	    

	    // Select Bank check options for cash advance : Type radio button
	       List<WebElement> appmntTimes = driver.findElements(By.xpath("//input[@type='radio'and@name='filing_case_appointment_time']"));	       

	       for(int i=0; i<appmntTimes.size(); i++)
	       {
	        WebElement availableAppmntTimes = appmntTimes.get(i);
	        String availableAppmntTimes_value = availableAppmntTimes.getAttribute("value");
	        System.out.println("List of Checking Account Type radio buttons are=======>>>>>"+availableAppmntTimes_value);


	        if(availableAppmntTimes_value.equalsIgnoreCase(2)) {
	         availableAppmntTimes.click();
	             }  

	         }  




		   int totalDates=appmntDates.size();

		   for(int i=0;i<totalDates;i++)
		   {	   
			 String date=appmntDates.get(i).getText();

			 if(date.equalsIgnoreCase("31"))
			 {
				 appmntDates.get(i).click();
			 }
		   }

		   /*


   //      appmntDate.sendKeys(apd);    // Enter valid appmntDate into the field
           Thread.sleep(4000);         // Wait statement
           appmntTime.click();
           Thread.sleep(4000);         // Wait statement
        // firstName.clear();
        // Thread.sleep(2000);                    // Wait statement
          /firstName.sendKeys(fnm);               // Enter valid first name into the field
        // lastName.clear();
         //lastName.sendKeys(lnm);                // Enter valid last name into the field
          /userEmail.clear();
       //  Thread.sleep(2000);                    // Wait statement
        // userEmail.sendKeys(uem);               // Enter valid first name into the field
      //   userPhone.clear();
       //  userPhone.sendKeys(uph);               // Enter valid last name into the field           

           userAddress1.sendKeys(uad1);           // Enter valid last name into the field
           userAddress2.sendKeys(uad2);           // Enter valid last name into the field
           userCity.sendKeys(ucty);               // Enter valid last name into the field
           userState.sendKeys(ust);               // Enter valid last name into the field
           userZipcode.sendKeys(uzcd);            // Enter valid last name into the field
           userSSN.sendKeys(usn);                 // Enter valid last name into the field
           messageTextBx.sendKeys(mtxbx);         // Enter valid last name into the field
           payOfficeCheckbx.click();              // Enter valid last name into the field


    //     Create object of WebDriverWait class
           WebDriverWait waitsubmitBtn = new WebDriverWait(driver,120);
   //      Wait till element is visible
           waitsubmitBtn.until(ExpectedConditions.elementToBeClickable(submitBtn));         
           submitBtn.click();                     // Enter valid last name into the field

    //     Create object of WebDriverWait class
           WebDriverWait waitconfirmMessgLabel = new WebDriverWait(driver,120);
   //      Wait till element is visible
           waitconfirmMessgLabel.until(ExpectedConditions.elementToBeClickable(confirmMessgLabel));
           Assert.assertTrue(confirmMessgLabel.isDisplayed(),
      		     "<<Successfully Take The Request, we will contact you soon>> confirmation message is not displayed"
      		    );

			 */


		} catch (InterruptedException e) {
		}	
	}


	/**
	 * *********************************************************************
	 * End of the file
	 * *********************************************************************
	 */
}
