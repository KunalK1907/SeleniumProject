package extentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
	
	@Test
	public void BasicReport()
	{
		//create a spark reporter
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./Report/sampleReport.html");
		
		//configure the spark reporter
		
		spark.config().setDocumentTitle("SampleReport");
		
		spark.config().setReportName("Kunal");
		
		spark.config().setTheme(Theme.DARK);
		
		//Create the extentReport
		
		ExtentReports report = new ExtentReports();
		
		//configure the extent report
		
		report.setSystemInfo("Os", "Window-10");
		
		report.setSystemInfo("Browser", "Chrome-100");
		
		//Attach the spark Reporter to the extent Report
		
		report.attachReporter(spark);
		
		ExtentTest test =  report.createTest("BasicReport");
		
		test.log(Status.INFO,"Report is Successfully Created");
		
		report.flush();
	}

}
