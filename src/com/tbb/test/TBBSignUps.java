package com.tbb.test;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import com.generic.GenericFunctions;
import com.generic.InitiateScript;

import jxl.read.biff.BiffException;

public class TBBSignUps {
//	static String sTestDataPath = "E:/BeachBody/CASL/TestData/FreeSignUpTest.xls";
//	static String sSheetName = "Sheet1";
	public static void generalInformation(String sTestDataPath, String sSheetName) throws BiffException, IOException, HeadlessException, InterruptedException, AWTException
	{
		System.out.println("Inside generalInformation");
		// Get value from the Excel sheet.
		String sFirstName = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "FirstName" );
		String sLastName = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "LastName" );
		String sScreenName = GenericFunctions.generateDateString();
		String sEmailId = sScreenName + "@test.com";
		String sPassword = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "Password" );
		String sDOBMonth = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "DOB Month" );
		String sDOBDay = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "DOB Day" );
		String sDOBYear = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "DOB Year" );
		
		// Events performing on the screen
		InitiateScript.inputText("FirstName", sFirstName);
		InitiateScript.inputText("LastName", sLastName);
		InitiateScript.inputText("EmailId", sEmailId);
		InitiateScript.inputText("ConfirmEmailId", sEmailId);
		InitiateScript.inputText("passwordFree", sPassword);
		InitiateScript.inputText("ConfirmPasswordFree", sPassword);
		InitiateScript.selectDropdownByVisibleText("BirthdayMonthDropdown", sDOBMonth);
		InitiateScript.selectDropdownByVisibleText("BirthdayDayDropdown", sDOBDay);
		InitiateScript.selectDropdownByVisibleText("BirthdayYearDropdown", sDOBYear);
		InitiateScript.inputText("ScreenName", sScreenName);
		
	}
	
	public static void shippingAddress(String sTestDataPath, String sSheetName) throws BiffException, IOException, HeadlessException, InterruptedException, AWTException
	{
		// Get value from the Excel sheet.
		String ShippingAddress1 = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "ShippingAddress1" );
		String ShippingAddress2 = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "ShippingAddress2" );
		String sCity = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "City" );
		String sState = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "State" );
		String sZipCode = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "ZipCode" );
		String sCountry = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "Country" );
		
		// Events performing on the screen
		InitiateScript.selectDropdownByVisibleText("ShippingCountry", sCountry);
		InitiateScript.inputText("Address1", ShippingAddress1);
		InitiateScript.inputText("Address2", ShippingAddress2);
		InitiateScript.inputText("ShippingCity", sCity);
		InitiateScript.inputText("ShippingZipCode", sZipCode);
		InitiateScript.selectDropdownByVisibleText("ShippingState", sState);
		
	}
	
	public static void coachReferral(String sTestDataPath, String sSheetName) throws BiffException, IOException, HeadlessException, InterruptedException, AWTException 
	{
		String sCoachID;
		String sCoachReferral = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "CoachReferral" );
		
		if (sCoachReferral.toUpperCase().equals("TRUE"))
		{
			sCoachID = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "CoachID" );
			if (sCoachID.isEmpty()){
				InitiateScript.log.info("Coach ID is null even Coach Referral is true, so by default selecting the option I do not have coach");
				InitiateScript.clickObject("DefaultCoach");
			}
			else{
				InitiateScript.clickObject("SelectCoach");
				InitiateScript.selectDropdownByValue("CoachLookUpType", "search-coach-id");
				InitiateScript.inputText("CoachSearchField", sCoachID);
				InitiateScript.clickObject("ConfirmCoachButton");
				InitiateScript.verifyObjectText("CoachSelectedMessage", "Yes, I want");
			}
		}
		else
		{
			InitiateScript.clickObject("DefaultCoach");
		}		
	}
	
	public static void CASLTCSelection(String sTestDataPath, String sSheetName) throws BiffException, IOException, HeadlessException, InterruptedException, AWTException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException
	{
		String sCASLTCExits = InitiateScript.verifyObjectIsDisplayed("CASLTC");
		String sCASLTC = InitiateScript.getValuefromExcelFile(sTestDataPath, sSheetName, "CASL T&C" ); 
		if (sCASLTCExits.toUpperCase().equals("PASS"))
		{
			if (sCASLTC.toUpperCase().equals("TRUE"))
			{
				InitiateScript.selectCheckbox("CASLTC");
			}
		}	
		else
		{
			InitiateScript.log.info("NO CASL T & C exists");
		}
	}
	
	public static void UserTC_Captcha() throws BiffException, IOException, HeadlessException, InterruptedException, AWTException
	{
		InitiateScript.selectCheckbox("DefaultTC");
		InitiateScript.inputText("CaptchaInputBox", "1111");
	}
	
	public static void SubmitApplication(String sType) throws HeadlessException, InterruptedException, IOException, AWTException
	{
		if (sType.toUpperCase().equals("FREE"))
		{
			InitiateScript.clickObject("SubmitFreeButton");
			Thread.sleep(10);
			InitiateScript.verifyObjectText("SignupHeaderTitle", "Welcome Free Member!");
		}
		if (sType.toUpperCase().equals("CLUB"))
		{
			InitiateScript.clickObject("SubmitClubButton");
			Thread.sleep(10);
			InitiateScript.verifyObjectText("SignupHeaderTitle", "Welcome Free Member!");
		}
	}
	
	public static void main(String[] args) throws HeadlessException, InterruptedException, IOException, AWTException, BiffException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		InitiateScript.openBrowser("https://tbbqabeta.productpartners.com/en_CA");
		System.out.println(System.currentTimeMillis());
		Thread.sleep(10000);
		System.out.println(System.currentTimeMillis());
		InitiateScript.clickObject("NotAMember");
		System.out.println(System.currentTimeMillis());
		Thread.sleep(10000);
		System.out.println(System.currentTimeMillis());
		System.out.println("going to click free link");
		InitiateScript.clickObject("FreeMemberSignupLink");
		System.out.println("After click free link");
		String sTestDataPath = "E:/BeachBody/CASL/TestData/FreeSignUpTest.xls";
		String sSheetName = "Sheet1";
		
		generalInformation(sTestDataPath, sSheetName);
		shippingAddress(sTestDataPath, sSheetName);
		coachReferral(sTestDataPath, sSheetName);
		CASLTCSelection(sTestDataPath, sSheetName);
		UserTC_Captcha();
		SubmitApplication("free");
//		InitiateScript.clickObject("LINK=Be a Coach");
//		WebElement oElement = InitiateScript.findElement("//div[@id='navigator'/ul/li[6]/a/span]");
//		String locator = "div[id='navigation'] > ul > li:nth-child(6) > ul > li:nth-child(1) > a";
//		String loctorNew = "alert($$(" + locator + "));";
//				System.out.println(loctorNew);
//		InitiateScript.callJavaScript(loctorNew);
		
	}

}
