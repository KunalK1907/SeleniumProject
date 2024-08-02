package com.crm.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DependencyListeners implements ITestListener {
	
	ExtentSparkReporter spark;
	
	ExtentReports report;
	
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		
		String t_name = result.getMethod().getMethodName();
		Reporter.log(t_name+" is executed");
		test = report.createTest(t_name);
		
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		String t_name = result.getMethod().getMethodName();
		
		test.log(Status.PASS, t_name+" is Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
        String t_name = result.getMethod().getMethodName();
		
		test.log(Status.FAIL, t_name+" is Failure");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
        String t_name = result.getMethod().getMethodName();
		
		test.log(Status.SKIP, t_name+" is Skipped");
	
	}

	@Override
	public void onStart(ITestContext context) {
		
		 spark = new ExtentSparkReporter("./Report/MultipleTestReports.html");
		
		spark.config().setDocumentTitle("MultipleTestReport");
		
		spark.config().setReportName("Kunal");
		
		spark.config().setTheme(Theme.DARK);
		
		
		 report = new ExtentReports();
		
		report.setSystemInfo("Os", "Windows-10");
		
		report.setSystemInfo("Browser", "Chrome-100");
		
		report.attachReporter(spark);
		
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		report.flush();
		
	}
	
	

}
