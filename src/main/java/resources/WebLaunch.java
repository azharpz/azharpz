package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Date;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.network.Network;
import org.testng.Assert;


public class WebLaunch {
	FileInputStream reader;
    Properties p;

public  WebDriver capabilities() throws IOException {
	// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "D:\\Automationcode\\RobustFramework\\src\\main\\java\\utilities\\chromedriver.exe");
	 
		 
		
	System.setProperty("webdriver.chrome.driver", getpath());

   WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
   // driver.get("https://truckglobe.in/");
  
  // driver.get("http://s9trucks.com");
	driver.get(geturl());

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   return driver;
 
    
    
  //  ChromeOptions options = new ChromeOptions();
  //  options.addArguments("--start-maximized");
 //   options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
  //  options.setExperimentalOption("useAutomationExtension", false);
 // driver1 = new ChromeDriver(options);
 // devTools = driver1.getDevTools();
  //  devTools.createSession();
 //   devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.of(100000000)));
 //   devTools.send(Network.setCacheDisabled(true));
 //   devTools.addListener(Network.responseReceived(), responseReceived -> Assert.assertEquals(false, responseReceived.getResponse().getFromDiskCache()));
 //   driver1.get("https://www.google.com/");
 //   devTools.send(Network.clearBrowserCache());
         //  return driver1;
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

public Properties getpropertyObject() throws IOException
{
	
FileReader reader=new FileReader("C:\\Users\\user\\eclipse-workspace\\RobustFramework2\\src\\main\\java\\properties\\EmailLoginTest.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
    
    return p;

//}

//public Properties getpropertyObject() throws IOException
//{
	
      
 //   Properties p=new Properties();  
//    String path=System.getProperty("user.dir");
//	InputStream reader=new FileInputStream(path+"\\src\\main\\java\\properties\\EmailLoginTest.properties");  

 //   p.load(reader);  
    
 //   return p;

//}

}
public  String geturl() throws IOException
{
	return getpropertyObject().getProperty("url");
}


public  String getpath() throws IOException
{
	return getpropertyObject().getProperty("path");
}







}