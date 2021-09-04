package com.PRregressionSuite;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qatest.PR.base.BaseClass;
import com.qatest.PR.pages.LoginPage;
import com.qatest.PR.pages.MakeInOfficeAppointment;
import com.qatest.PR.pages.UpdateProfile;
import com.qatest.PR.util.Helper;

public class TestScripts_PR_Regression extends BaseClass {
	
	  @Test (priority = 0, dataProvider = "getUserLogin") // Login into the system with valid credentials
	  public void loginValidation(String UserID, String Passwd){
//	  System.out.println("UserID --> " + UserID); 
//	  System.out.println("Passwd --> " + Passwd); 
	  LoginPage login = PageFactory.initElements(driver,LoginPage.class); 
	            login.loginPageElementsAndMethods(UserID, Passwd);
	  Helper.captureScreenshot(driver); // screenshot
  }
	  
	  @Test (priority = 1, dataProvider = "getUpdateProfile") // Login into the system with valid credentials
	  public void updateProfile(String firstname, String lastname, String userAddress1, 
			  String userAddress2, String userCity, String userState, String userZip){
		  UpdateProfile	 updateProfile = PageFactory.initElements(driver, UpdateProfile.class);
		  updateProfile.updateProfileElementsAndMethods(firstname, lastname, userAddress1, 
		  userAddress2, userCity, userState, userZip );
	  Helper.captureScreenshot(driver); // screenshot
  }	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	/*  
	  @Test (priority = 1, dataProvider = "getMakeInOfficeAppointment") // Login into the system with valid credentials
	  public void makeInOfficeAppointmentValidation(String chooseDate, String fName, String lName,
			  String eAddress, String pNumber, String aLine1, String aLine2, String city,
			  String state, String zCode, String ssn, String notes){
	  MakeInOfficeAppointment makeInOfficeAppointment = PageFactory.initElements(driver,MakeInOfficeAppointment.class); 
	  makeInOfficeAppointment.makeInOfficeAppointmentElementsAndMethods(chooseDate, fName, lName, eAddress, 
	  pNumber,  aLine1, aLine2, city, state, zCode, ssn, notes);
	  Helper.captureScreenshot(driver); // screenshot
  }
	*/
}
