package com.tbb.test;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import com.generic.InitiateScript;


public class BasicScenario {

	public static void LoginPortBase() throws InterruptedException, IOException, HeadlessException, AWTException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException
	{
		InitiateScript.loadConfigProperties();
		String url = InitiateScript.prop.getProperty("PortBase.url");
		InitiateScript.openBrowser(url);
		InitiateScript.verifyObjectIsDisplayed("BuyNowLink");
		InitiateScript.clickObject("BuyNowLink");
		
		InitiateScript.verifyObjectIsDisplayed("PackagingSizeDropDown");
		InitiateScript.selectDropdownByIndex("PackagingSizeDropDown", 1);
		
		InitiateScript.verifyObjectIsDisplayed("OrderDropDown");
		InitiateScript.selectDropdownByIndex("OrderDropDown", 1);
		
		InitiateScript.clickObject("AddToCartButton");
		InitiateScript.clickObject("CheckOut");
		
		InitiateScript.verifyObjectIsDisplayed("CheckoutMain");
		InitiateScript.clickObject("CheckoutMain");
		
		InitiateScript.verifyObjectIsDisplayed("EmailAddress");
		InitiateScript.inputText("EmailAddress", "cnp57255@yopmail.com");
		
		InitiateScript.verifyObjectIsDisplayed("Password");
		InitiateScript.inputText("Password", "test");
		
		InitiateScript.verifyObjectIsDisplayed("LoginButton");
		InitiateScript.clickObject("LoginButton");
	}

	
	public static void main(String[] args) throws InterruptedException, IOException, HeadlessException, AWTException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, SecurityException {
//		(new HelloThread()).start();
//		String oLocatorString = "loginOrgnaizationName";
//		
//		System.out.println(ObjectRepository.class.getDeclaredField("loginOrgnaizationName").get(oLocatorString));
//		InitiateScript.setUp();
		LoginPortBase();
	}
	
}
