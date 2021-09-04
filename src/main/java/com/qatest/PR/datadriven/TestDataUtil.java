package com.qatest.PR.datadriven;

import java.util.ArrayList;
import com.qatest.PR.util.Excel_Reader;

public class TestDataUtil {

	static Excel_Reader reader;

	public static ArrayList<Object[]> getUserLogin() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Excel_Reader("./TestData/testdata.xlsx");
		}catch (Exception e) {
			System.out.println("Unable to get data  >>"+ e.getMessage());
		}

		for (int rowCnt = 2; rowCnt <= reader.getRowCount("UserLogin"); rowCnt++) {

			String UserID = reader.getCellData("UserLogin", "Username", rowCnt);
			String Passwd = reader.getCellData("UserLogin", "Password", rowCnt);        


			Object ob[] = {UserID, Passwd};

			myData.add(ob);

		}
		return myData;
	}

	// To get test data from the UpdateProfile sheet

	public static ArrayList<Object[]> getUpdateProfile() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Excel_Reader("./TestData/testdata.xlsx");
		}catch (Exception e) {
			System.out.println("Unable to get data  >>"+ e.getMessage());
		}

		for (int rowCnt = 2; rowCnt <= reader.getRowCount("UpdateProfile"); rowCnt++) {

			String firstname = reader.getCellData("UpdateProfile", "FirstName", rowCnt);
			String lastname = reader.getCellData("UpdateProfile", "LastName", rowCnt);    
			String userAddress1 = reader.getCellData("UpdateProfile", "UserAddressLine1", rowCnt);
			String userAddress2 = reader.getCellData("UpdateProfile", "UserAddressLine2", rowCnt);   
			String userCity = reader.getCellData("UpdateProfile", "UserCity", rowCnt);
			String userState = reader.getCellData("UpdateProfile", "UserState", rowCnt);    
			String userZip = reader.getCellData("UpdateProfile", "UserZipcode", rowCnt);

			Object ob[] = {firstname, lastname, userAddress1, userAddress2, userCity, userState, userZip };

			myData.add(ob);

		}
		return myData;
	} 


























	public static ArrayList<Object[]> getMakeInOfficeAppointment() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Excel_Reader("./TestData/testdata.xlsx");
		}catch (Exception e) {
			System.out.println("Unable to get data  >>"+ e.getMessage());
		}

		for (int rowCnt = 2; rowCnt <= reader.getRowCount("MakeInOfficeAppointment"); rowCnt++) {

			String chooseDate = reader.getCellData("MakeInOfficeAppointment", "ChooseDate", rowCnt);
			String fName = reader.getCellData("MakeInOfficeAppointment", "FirstName", rowCnt);       
			String lName = reader.getCellData("MakeInOfficeAppointment", "LastName", rowCnt);
			String eAddress = reader.getCellData("MakeInOfficeAppointment", "EmailAddress", rowCnt);        
			String pNumber = reader.getCellData("MakeInOfficeAppointment", "PhoneNumber", rowCnt);
			String aLine1 = reader.getCellData("MakeInOfficeAppointment", "AddressLine1", rowCnt);        
			String aLine2 = reader.getCellData("MakeInOfficeAppointment", "AddressLine2", rowCnt);
			String city = reader.getCellData("MakeInOfficeAppointment", "City", rowCnt);        
			String state = reader.getCellData("MakeInOfficeAppointment", "State", rowCnt);
			String zCode = reader.getCellData("MakeInOfficeAppointment", "ZipCode", rowCnt);        
			String ssn = reader.getCellData("MakeInOfficeAppointment", "SSN", rowCnt);
			String notes = reader.getCellData("MakeInOfficeAppointment", "Notes", rowCnt);        


			Object ob[] = {chooseDate, fName, lName, eAddress, pNumber, 
					aLine1, aLine2, city, state, zCode, ssn, notes};

			myData.add(ob);

		}
		return myData;
	}


}
