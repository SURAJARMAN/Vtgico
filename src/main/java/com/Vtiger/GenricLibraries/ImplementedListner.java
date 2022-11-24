package com.Vtiger.GenricLibraries;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ImplementedListner extends BaseClass implements ITestListener {

	
	public void onTestStart(ITestContext context) {
		ExtentSparkReporter report = new ExtentSparkReporter(".\\ExtentReport\\report.html");
		report.config().setDocumentTitle("");
		report.config().setTheme(Theme.DARK);
		report.config().setReportName("V tiger execution report");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(report);
		reports.setSystemInfo("Base Browser", "chrome");
		reports.setSystemInfo("OS", "windows");
		reports.setSystemInfo("Bse_url", "https://localhost:8888");
		reports.setSystemInfo("reporter name", "Suraj");
	}

	
	
	public void onTestSuccess(ITestResult result) {
	
	}

	
	public void onTestFailure(ITestResult result) {
		String  failedTestScript= result.getMethod().getMethodName();
		String FScript=failedTestScript+new JavaUtility().getSystemDateandTimeInFormat(); 
		EventFiringWebDriver  edriver =new EventFiringWebDriver(BaseClass.sdriver);
		File src =edriver.getScreenshotAs(OutputType.FILE);
		File dst =new File(".\\screenshot\\"+FScript+".png");
		try
		{
			FileUtils.copyFile(src,dst);
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	
	

	public void onTestSkipped(ITestResult result) {
	
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}


	public void onTestFailedWithTimeout(ITestResult result) {
		
	}


	public void onStart(ITestContext context) {
	
	}


	public void onFinish(ITestContext context) {
		
	}

}
