package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporterNG {
	
static ExtentReports extent;
	
	public static  ExtentReports getReportObject() {
	
	String path=System.getProperty("user.dir")+"\\extentreports\\index.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("Zee Business Results");
	reporter.config().setDocumentTitle("Test Results");
	
	extent = new ExtentReports();
	extent.attachReporter(reporter);;
	extent.setSystemInfo("Azhar","Test Engineer");
	return extent;
	
	
	
	

}}
