package pageObject;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class WebTruckWeight {

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	
public void truckWeight(WebDriver driver) throws InterruptedException
	
	{

	driver.findElement(By.xpath("//span[.='Select Weight']")).click();
	 Thread.sleep(3000);
	 int	truckweight= driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).size();

     System.out.println("no of truckweight is   "  + truckweight);
     
   //  String trucknames=	driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).get(trucktypes).getText();
     
  
   // System.out.println("name of truck is   "  + trucknames);


	 driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).get(2).click();
	
	              
}


	
public Properties getpropertyObject() throws IOException
{
	
	FileReader reader=new FileReader("C:\\Users\\user\\eclipse-workspace\\RobustFramework2\\src\\main\\java\\properties\\EmailLoginTest.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
    
    return p;
      
  //  System.out.println(p.getProperty("user"));  
   // System.out.println(p.getProperty("password"));  
      
}
public  String getweight() throws IOException
{
	return getpropertyObject().getProperty("weight");
}


	
		
		}
