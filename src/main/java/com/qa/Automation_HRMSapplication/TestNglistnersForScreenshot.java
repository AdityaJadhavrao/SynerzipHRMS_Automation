package com.qa.Automation_HRMSapplication;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.CodeForScreenshot;

public class TestNglistnersForScreenshot extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started :"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test successful :"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("Oops test failed :"+result.getName()+"- Please check the screenshot");
	try {
		CodeForScreenshot.ScreenshotMethod(result.getName());
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped"+result.getName());
	}
	
	public TestNglistnersForScreenshot()
	{
		PageFactory.initElements(driver, this);
	}

}
