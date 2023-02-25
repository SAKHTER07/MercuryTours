package org.mma.mercury.tours.regression.suite;
/**
 * *********************************************************************
 * @author sakhter
 * Class Name: 
 * Description: 
 * Reviewer Name:
 * Comments:
 * *********************************************************************
 **/

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mercury.tours.base.BaseClass;
import com.mercury.tours.pages.MercuryToursRegisterPage;

public class MercuryToursRegressionSuite extends BaseClass
{
	/**
	 *********************************************************************************************************   
                  Add State document form >> Management >> mandatory fields validation (CMS user)
	 *********************************************************************************************************
	 **/
	@Test (priority=0, dataProvider="getRegisterPage") 	
	public void mercuryToursRegisterPageValidation(String userFirstName, String userLastName, String userPhoneNumber, 
			String userEmailId, String userAddress, String userCity, String userState, String userPostalCode, String userCountry, 
			String userId, String userPasswd, String userConfirmPasswd) {		
		MercuryToursRegisterPage mercuryToursRegisterPage = PageFactory.initElements(driver, MercuryToursRegisterPage.class);
		mercuryToursRegisterPage.mercuryToursRegisterPageElementsAndMethods(userFirstName, userLastName, 
				userPhoneNumber, userEmailId, userAddress, userCity, userState, userPostalCode, userCountry, 
				userId, userPasswd, userConfirmPasswd); 
		// System.out.println("<<IM HERE16" );
		
	}
}
