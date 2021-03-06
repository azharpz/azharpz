package webTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtendReporterNG;
import resources.WebLaunch;


public class Listeners extends WebLaunch  implements ITestListener {
	
	 ExtentTest test;
		
		ExtentReports extent=ExtendReporterNG.getReportObject();
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			 test=extent.createTest(result.getMethod().getMethodName());

		}

		@Override
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			test.log(Status.PASS, "Test Passes");
			
		}

		@Override
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			
			test.fail(result.getThrowable());
			WebDriver driver=null;
			String testMethodName=result.getMethod().getMethodName();
			try {
				driver=	(WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			
			} catch  (Exception e)
			{
				e.printStackTrace();
			}
				try {
					getScreenshot(testMethodName, driver);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestSkipped(result);
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestFailedWithTimeout(result);
		}

		@Override
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			ITestListener.super.onStart(context);
		}

		@Override
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			extent.flush();
			ITestListener.super.onFinish(context);
		}

		}

