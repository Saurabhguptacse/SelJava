package com.generic;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;


public class GoogleTest {

	public static void main(String[] args) throws HeadlessException, InterruptedException, IOException, AWTException {
		InitiateScript.openBrowser("http://www.google.com");
		System.out.println("assas");
		InitiateScript.inputText("userName", "dasdadasdasd");
		System.out.println("adaswqwe");
	}
}
