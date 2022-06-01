package resources;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
public class WebLaunch {
	

	public  WebDriver capabilities() {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\Automationcode\\RobustFramework\\src\\main\\java\\utilities\\chromedriver.exe");
	 
   
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       // driver.get("https://truckglobe.in/");
        driver.get("http://s9trucks.com/profile");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
               
	}
	
	public WebDriver  getScreenshot(String testCaseName,WebDriver driver1 ) throws IOException {
		WebDriver driver = driver1 ;

		//TakesScreenshot ts=(TakesScreenshot)driver;
	    //File source =ts.getScreenshotAs(OutputType.FILE);
		//String destinationfile=System.getProperty("user.dir")+"\\Reports\\"+testCaseName+".png";
		//FileUtils.copyFile(source, new File(destinationfile));
		//return destinationfile;
		
	   
		File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
			FileUtils.copyFile(SrcFile, new File("C:\\Users\\user\\eclipse-workspace\\RobustFramework\\screenshot.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		return driver;
		
		
       
		
		
		
	}
	
	//public WebDriver getDriver() {
       // return this.driver;
  //  }
//public  WebDriver takescreenshot(String testMethodName, WebDriver driver2) throws IOException {
		
	

		//Date currentdate=new Date();
		//String screenshotfilename=currentdate.toString().replace(" ", ".").replace(":","." );
	// screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(screenshotFile, new File(".//screenshot//" +screenshotfilename + ".//failed.jpg"));
	//	return this.driver;
		
		
  //  }

	

}

