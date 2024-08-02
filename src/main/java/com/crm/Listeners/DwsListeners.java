package com.crm.Listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import baseClass.BaseClassDWS;

public class DwsListeners extends BaseClassDWS implements ITestListener {
	
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("onTestStart",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSuccess",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("onTestFailure",true);
		LocalDateTime date = LocalDateTime.now();
		
		String time = date.toString().replace(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		
		File to = new File("./Screenshot/Dwspage"+time+".jpg");
		
		try {
			FileHandler.copy(from, to);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("onTestFailedButWithinSuccessPercentage",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("onTestFailedWithTimeout",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("onStart",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("onFinish",true);
	}
	

}
